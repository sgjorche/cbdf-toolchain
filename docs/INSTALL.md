# Installation and execution

This document describes how to set up the toolchain and reproduce the results reported in the thesis. The toolchain is a set of Eclipse projects; a use case is a folder of CBDL files that the toolchain parses, transforms to Alloy, verifies, and reports on. Every result in the thesis was produced by the procedure below, on the environment described in Section 1.

## 1. Environment

The thesis runs were performed with the following versions. Later versions are likely to work but have not been used for the reported results.

| Component | Version |
|---|---|
| Java (JDK) | [version] |
| Eclipse IDE (Modeling Tools package) | [version, e.g. 2025-06] |
| Xtext | [version] |
| Eclipse Modeling Framework (EMF) | [version] |
| Epsilon | [version] |
| Alloy Analyzer (with embedded SAT4J) | [version] |
| Operating system | Windows 11 Home, build 26300 |
| Hardware | Intel Core i7-12700, 32 GB RAM |

Install the JDK first, then the Eclipse Modeling Tools package, then Xtext and Epsilon from the Eclipse Marketplace (Help → Eclipse Marketplace). The Alloy Analyzer is bundled with the toolchain as a library; no separate installation is required.

## 2. Importing the toolchain

1. Start Eclipse with a new, empty workspace.
2. File → Import → General → Existing Projects into Workspace.
3. Select the `toolchain/` folder of this repository and import all projects it contains.
4. Right-click the grammar project and run [Generate Xtext Artifacts / the MWE2 workflow]. This generates the CBDL parser from the grammar.
5. Clean and build the workspace (Project → Clean → Clean all projects). No errors should remain.

The projects correspond to the pipeline stages described in the thesis: the Ecore meta-model (Stage 1), the CBDL grammar (Stage 2), the Epsilon transformation (Stage 3), the Alloy meta-model (Stage 4), and the verification and reporting runner (Stages 5 and 6).

## 3. Importing a use-case project

1. File → Import → General → Existing Projects into Workspace.
2. Select one use-case folder, for example `use-cases/scada/controls-applied/`.

A use-case project contains the three system-specific files (`design.cbdl`, `checks.cbdl`, `controls.cbdl`), the imported libraries under `lib/`, and the generated artifacts under `src-gen/` as produced for the thesis. Opening any `.cbdl` file in the editor confirms that the parser is active: syntax errors, unresolved library references, and unknown components or connectors are reported in the Problems view.

## 4. Generation (Stages 2 to 4)

1. Right-click the use-case project → [Run As → the generation launch configuration / menu entry].
2. The `src-gen/` folder is regenerated. It contains the Alloy meta-model modules, one predicate file per library, the architecture model `logical.als` with one fact per control assignment, one check file per compliance check, and one fact file per control assignment.

Generation is deterministic: the same input files produce the same `src-gen/` contents. Existing files in `src-gen/` are overwritten.

## 5. Verification and reporting (Stages 5 and 6)

1. Right-click the use-case project → [Run As → the verification launch configuration / menu entry].
2. Every generated check is executed in sequence with scope 5 against the architecture model and the applied control facts. Progress is written to the console.
3. On completion, `src-gen/report.html` is written. It contains the analysis summary (checks, passes, errors, controls applied, analysis time), the table of controls applied per connector, and one entry per check with its property, regulatory references, scope, applied controls, status, and, for a failing check, the reason and a suggested control.

Verdicts are deterministic. Analysis time varies between runs; the times reported in the thesis are averages over five runs on the environment in Section 1. Expected durations on that environment: SCADA about 15 minutes, SCS about 90 minutes, NM about 4 hours.


## 6. Modelling a new system

Open `studio/CBDL_Studio.html` in a browser. Draw the architecture, select the regulatory regime, declare compliance checks on component pairs, assign controls to connectors, and export. The exported folder has the layout of a use-case project and can be imported into Eclipse as in Section 3.