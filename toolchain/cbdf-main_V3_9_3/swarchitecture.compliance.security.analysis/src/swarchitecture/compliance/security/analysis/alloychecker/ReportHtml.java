package swarchitecture.compliance.security.analysis.alloychecker;

import static j2html.TagCreator.a;
import static j2html.TagCreator.b;
import static j2html.TagCreator.body;
import static j2html.TagCreator.br;
import static j2html.TagCreator.div;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.h2;
import static j2html.TagCreator.h3;
import static j2html.TagCreator.head;
import static j2html.TagCreator.html;
import static j2html.TagCreator.link;
import static j2html.TagCreator.nav;
import static j2html.TagCreator.span;
import static j2html.TagCreator.table;
import static j2html.TagCreator.tbody;
import static j2html.TagCreator.td;
import static j2html.TagCreator.th;
import static j2html.TagCreator.thead;
import static j2html.TagCreator.title;
import static j2html.TagCreator.tr;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;

import compliance.PropertyDefinitionStandardRef;
import compliance.SecurityControlInstance;
import compliance.impl.ComplianceDefinitionImpl;
import edu.mit.csail.sdg.alloy4.Err;
import edu.mit.csail.sdg.translator.A4Solution;
import j2html.tags.specialized.DivTag;
import j2html.tags.specialized.HeadTag;
import j2html.tags.specialized.SpanTag;
import j2html.tags.specialized.TableTag;
import logical.Connector;
import property.PropertyCategory;
import property.PropertyCategoryLibrary;
import property.PropertyDefinition;
import property.PropertyDefinitionParameter;
import property.impl.PropertyDefinitionImpl;
import swarchitecture.compliance.security.analysis.libs.Library;

public class ReportHtml extends Report {

	// Elapsed time of the Alloy analysis phase, in milliseconds.
	// Defaults to -1 (meaning "not provided"); reportBodyHeader renders nothing
	// in that case so existing call sites keep working unchanged.
	private long analysisElapsedMs = -1L;

	public ReportHtml(ArrayList<A4Solution> solutions, Library library, Collection<SecurityControlInstance> sec_controls) {
		super(solutions, library, sec_controls);
	}

	public ReportHtml(ArrayList<A4Solution> solutions, Library library,
			Collection<SecurityControlInstance> sec_controls, long analysisElapsedMs) {
		super(solutions, library, sec_controls);
		this.analysisElapsedMs = analysisElapsedMs;
	}

	@Override
	public String toString() {
		try {
			// Pre-compute per-solution OK/NOK so the summary is consistent with the cards
			ArrayList<Boolean> statusList = computeStatusList(
					this.getSolutions(), this.getLibrary(), this.getSecControls());

			return html(reportHead(),
					body(nav(div(span("Compliance Report").withClass("navbar-item")).withClass("navbar-brand"))
							.withClasses("navbar", "is-info").attr("aria-label", "main navigation"),
							div(
								reportBodyHeader(),
								h1("Model analysis summary").withClass("title"),
								reportSummary(this.getSolutions(), this.getSecControls(), statusList),
								h1("Security Controls Applied").withClass("title"),
								securityControlsToDiv(this.getSecControls()),
								h1("Compliance analysis").withClass("title"),
								complianceSolutionsToDiv(this.getSolutions(), this.getLibrary(),
										this.getSecControls(), statusList)
							).withClasses("pt-4", "container")))
					.render();
		} catch (Err e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	// ── Head ──────────────────────────────────────────────────────────────────────
	private static HeadTag reportHead() {
		return head(title("Compliance Report"),
				link().withRel("stylesheet")
					  .withHref("https://cdn.jsdelivr.net/npm/bulma@0.9.4/css/bulma.min.css"));
	}

	// ── Body header ───────────────────────────────────────────────────────────────
	private DivTag reportBodyHeader() {
		Date date = new Date(System.currentTimeMillis());
		String elapsedText = (this.analysisElapsedMs >= 0)
				? (this.analysisElapsedMs + " ms")
				: "(not measured)";
		return div(b("Created on : " + date), br(),
				   b("Model name : "), br(),
				   b("Owner : "), br(),
				   b("Reviewers : "), br(),
				   b("Contributors : "), br(),
				   b("Analysis time : " + elapsedText), br())
				.withClasses("box");
	}

	// ── Summary ───────────────────────────────────────────────────────────────────
	private static DivTag reportSummary(ArrayList<A4Solution> solutions,
			Collection<SecurityControlInstance> sec_controls,
			ArrayList<Boolean> statusList) {

		int total   = statusList.size();
		int valid   = (int) statusList.stream().filter(x -> x).count();
		int invalid = total - valid;

		return div(
				b("Security Compliance Check Total : "  + total),   br(),
				b("Security Compliance Check Passes : " + valid),   br(),
				b("Security Compliance Check Errors : " + invalid), br(),
				b("Security Control Applied : "         + sec_controls.size()), br())
				.withClasses("box");
	}

	// ── Security Controls Applied section ─────────────────────────────────────────
	/**
	 * Renders a table listing every SecurityControlInstance:
	 *   Connector | Security Control | Standard References
	 *
	 * This answers the question: "which controls were implemented on which connector?"
	 */
	private static DivTag securityControlsToDiv(Collection<SecurityControlInstance> sec_controls) {
		if (sec_controls == null || sec_controls.isEmpty()) {
			return div(span("No security controls applied.").withClass("has-text-grey"))
					.withClass("box");
		}

		// Build table rows
		TableTag tbl = table().withClasses("table", "is-fullwidth", "is-striped", "is-hoverable");

		// Header
		tbl.with(
			thead(tr(
				th("Connector"),
				th("Security Control"),
				th("Enforces Overlays")
			))
		);

		// Body rows — one row per SecurityControlInstance
		var rows = tbody();
		for (SecurityControlInstance ctrl : sec_controls) {
			// Connector name — stored as first parameter of the instance
			String connectorName = "—";
			EList<EObject> params = ctrl.getParameters();
			if (params != null && !params.isEmpty()) {
				EObject first = params.get(0);
				if (first instanceof Connector) {
					connectorName = ((Connector) first).getName();
				}
			}

			// Security control definition name (e.g. SecureCommunicationTLS)
			String controlName = ctrl.getPropertyDefinition() != null
					? ctrl.getPropertyDefinition().getName()
					: "—";

			// Which overlays this control enforces (from enforce() in SC.cbdl)
			String enforces = "—";
			if (ctrl.getPropertyDefinition() instanceof property.impl.PropertyDefinitionImpl) {
				PropertyDefinitionImpl def = (PropertyDefinitionImpl) ctrl.getPropertyDefinition();
				// Get enforce list if it is a SecurityControlDefintion
				if (def instanceof compliance.SecurityControlDefintion) {
					compliance.SecurityControlDefintion scd = (compliance.SecurityControlDefintion) def;
					List<String> enforceNames = scd.getEnforce().stream()
							.map(PropertyDefinition::getName)
							.collect(Collectors.toList());
					if (!enforceNames.isEmpty()) {
						enforces = String.join(", ", enforceNames);
					}
				}
			}

			// Colour-code the control name badge
			rows.with(tr(
				td(span(connectorName)
						.withStyle("font-family:monospace;font-weight:600")),
				td(span(controlName)
						.withClasses("tag", "is-info", "is-light")
						.withStyle("font-family:monospace;font-size:0.85em")),
				td(span(enforces)
						.withStyle("font-size:0.85em;color:#555"))
			));
		}
		tbl.with(rows);

		return div(tbl).withClass("box");
	}

	// ── Pre-compute true OK/NOK per solution ──────────────────────────────────────
	/**
	 * A check is truly OK only when:
	 *   1. Alloy finds no counterexample, AND
	 *   2. A SecurityControlInstance whose control definition matches one of the
	 *      overlay's suggested controls is assigned to a connector whose name
	 *      contains both component parameter names.
	 */
	private static ArrayList<Boolean> computeStatusList(
			ArrayList<A4Solution> solutions,
			Library libs,
			Collection<SecurityControlInstance> sec_controls) {

		ArrayList<Boolean> result = new ArrayList<>();
		for (A4Solution s : solutions) {
			try {
				result.add(computeIsOK(s, libs, sec_controls));
			} catch (Exception e) {
				result.add(MyAlloyChecker.isValidAssert(s));
			}
		}
		return result;
	}

	private static boolean computeIsOK(A4Solution solution, Library libs,
			Collection<SecurityControlInstance> sec_controls) throws IOException {

		if (!MyAlloyChecker.isValidAssert(solution)) return false;

		String[] params = getParamsCommand(solution);
		if (params.length < 3) return true;

		String overlayName = params[1];
		String c1 = params.length > 2 ? params[2].toLowerCase() : "";
		String c2 = params.length > 3 ? params[3].toLowerCase() : "";

		PropertyDefinitionImpl def = (PropertyDefinitionImpl) libs.getDefinition(overlayName);
		if (def == null) return true;

		Set<PropertyDefinition> suggestions = libs.getElicit(def);
		if (suggestions.isEmpty()) return true;

		return sec_controls.stream().anyMatch(ctrl -> {
			PropertyDefinition ctrlDef = ctrl.getPropertyDefinition();
			if (ctrlDef == null) return false;
			boolean matchesSuggestion = suggestions.stream()
					.anyMatch(s -> s.getName() != null && ctrlDef.getName() != null && s.getName().equals(ctrlDef.getName()));
			if (!matchesSuggestion) return false;

			EList<EObject> ctrlParams = ctrl.getParameters();
			if (ctrlParams == null || ctrlParams.isEmpty()) return false;
			EObject connObj = ctrlParams.get(0);
			if (!(connObj instanceof Connector)) return false;
			String connName = ((Connector) connObj).getName().toLowerCase();
			return !c1.isEmpty() && !c2.isEmpty()
					&& connName.contains(c1) && connName.contains(c2);
		});
	}

	// ── Render all check cards ────────────────────────────────────────────────────
	private static DivTag complianceSolutionsToDiv(
			ArrayList<A4Solution> solutions, Library libs,
			Collection<SecurityControlInstance> sec_controls,
			ArrayList<Boolean> statusList)
			throws Err, IOException {

		DivTag div = div();
		for (int i = 0; i < solutions.size(); i++) {
			boolean isOK = i < statusList.size() && statusList.get(i);
			div.with(complianceSolutionToDiv(solutions.get(i), libs, sec_controls, isOK));
		}
		return div;
	}

	// ── Render a single check card ────────────────────────────────────────────────
	private static DivTag complianceSolutionToDiv(
			A4Solution solution, Library libs,
			Collection<SecurityControlInstance> sec_controls,
			boolean isOK)
			throws Err, IOException {

		String[] params = getParamsCommand(solution);

		PropertyDefinitionImpl def = (PropertyDefinitionImpl) libs.getDefinition(params[1]);
		Pair<PropertyCategoryLibrary, PropertyCategory> defLibCategory = libs.getLibraryCategory(def);

		HashMap<String, String> mapParams = new HashMap<>();
		EList<PropertyDefinitionParameter> defParams = def.getDefinitionParameters();
		for (int i = 0; i < defParams.size(); i++) {
			mapParams.put(defParams.get(i).getName(), params[i + 2]);
		}

		Handlebars handlebars = new Handlebars();
		HashMap<String, String> titleParams = new HashMap<>();
		titleParams.put("property", def.getName());
		titleParams.put("params", String.join(" ", mapParams.values()));
		String titleStr = handlebars.compileInline("{{property}} {{ params }}").apply(titleParams);
		String description = handlebars.compileInline(def.getDescription()).apply(mapParams);

		// Find controls assigned to the connector for this check's component pair
		String c1 = mapParams.getOrDefault("c1", "").toLowerCase();
		String c2 = mapParams.getOrDefault("c2", "").toLowerCase();
		List<String> assignedControls = sec_controls.stream()
				.filter(ctrl -> {
					EList<EObject> ctrlParams = ctrl.getParameters();
					if (ctrlParams == null || ctrlParams.isEmpty()) return false;
					EObject connObj = ctrlParams.get(0);
					if (!(connObj instanceof Connector)) return false;
					String connName = ((Connector) connObj).getName().toLowerCase();
					return !c1.isEmpty() && !c2.isEmpty()
							&& connName.contains(c1) && connName.contains(c2);
				})
				.map(ctrl -> ctrl.getPropertyDefinition() != null
						? ctrl.getPropertyDefinition().getName() : "?")
				.distinct()
				.collect(Collectors.toList());

		DivTag div = div().withClass("box");
		div.with(h2(titleStr).withClass("title is-4"))
				.with(b("Standard : ")).with(span(defLibCategory.getLeft().getName())).with(br())
				.with(b("Category : ")).with(span(defLibCategory.getRight().getName())).with(br())
				.with(b("Property : ")).with(span(def.getName())).with(br())
				.with(b("Reference : "))
				.with(libs.getStandardRef(def).stream()
						.map(x -> span()
								.with(span(String.format("%s ", x.getName())))
								.with(a("[link] ").withHref(x.getUrl())))
						.toArray(SpanTag[]::new))
				.with(br())
				.with(b("Description : ")).with(span(description)).with(br());

		// Controls assigned for this pair
		if (!assignedControls.isEmpty()) {
			div.with(b("Controls on connector : "))
			   .with(span(String.join(", ", assignedControls))
					   .withStyle("font-family:monospace;font-size:0.9em"))
			   .with(br());
		} else {
			div.with(b("Controls on connector : "))
			   .with(span("none assigned").withClass("has-text-danger"))
			   .with(br());
		}

		if (isOK) {
			div.with(b("Status : "))
			   .with(span("OK").withClasses("has-text-success"))
			   .with(br());
		} else {
			// Choose the reason in priority order:
			//  1. If no security control is assigned to the connector for this
			//     component pair, the cause is the missing control — regardless
			//     of what the Alloy assertion returned. This keeps the reason
			//     consistent across all checks when no controls are applied.
			//  2. Otherwise, a control is assigned but the property still fails,
			//     so the cause is a genuine Alloy counterexample.
			String nokReason;
			if (assignedControls.isEmpty()) {
				nokReason = "No matching security control assigned to the connector for this component pair.";
			} else {
				nokReason = "Alloy property check failed — formal verification found a counterexample.";
			}
			Set<PropertyDefinition> suggestions = libs.getElicit(def);

			div.with(b("Status : "))
			   .with(span("NOK").withClasses("has-text-danger", "has-text-weight-bold"))
			   .with(br())
			   .with(b("Reason : "))
			   .with(span(nokReason).withClass("has-text-danger"))
			   .with(br())
			   .with(b("Security Control Suggestion : "))
			   .with(suggestions.stream()
					   .map(x -> span(String.format("%s ", x.getName()))
							   .withClasses("has-text-danger", "has-text-weight-bold"))
					   .toArray(SpanTag[]::new))
			   .with(br());
		}

		return div;
	}

	// ── Utility ───────────────────────────────────────────────────────────────────
	private static String[] getParamsCommand(A4Solution solution) {
		return solution.getOriginalCommand().split(" ", 0)[1].split("__", 0);
	}
}
