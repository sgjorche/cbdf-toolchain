# Installation and execution

This document describes how to set up the toolchain and reproduce the results reported in the thesis. The toolchain is a set of Eclipse projects. A use case is a folder of CBDL files that the toolchain parses, transforms to Alloy, verifies, and reports on.

## 1. Environment

The thesis runs were performed with the following versions. Later versions are likely to work but have not been used for the reported results.

| Component | Version |
|---|---|
| Java (JDK) | OpenJDK 21.0.10 |
| Eclipse IDE (Modeling Tools package) | 2026-03 (4.39.0) |
| Xtext | 2.42.0 |
| Eclipse Modeling Framework (EMF) | 2.45.0 |
| Epsilon | 2.8.0 |
| Alloy Analyzer (with embedded SAT4J) | 6.1.0 |
| Operating system | Windows 11 Home, build 26300 |
| Hardware | Intel Core i7-12700, 32 GB RAM |

The toolchain projects are compiled against the JavaSE-11 and JavaSE-14 execution environments, and they require Epsilon 2.4.0 or later.

## 2. Prerequisites

You need to install:

* **Eclipse Modeling Tools**: [Download Eclipse](https://www.eclipse.org/downloads/packages/)

With the following plugins:

* **Epsilon**: [Download Epsilon](https://eclipse.dev/epsilon/download/)

In Eclipse:
Help > Install New Software > In "Work with" add Epsilon: [Epsilon Update Site](https://download.eclipse.org/epsilon/updates/2.8/)
Select All > Next > Next > Accept License > Finish > Wait for installation to complete.

* **Xtext**: [Download Xtext](https://www.eclipse.org/Xtext/download.html)

In Eclipse:
Help > Install New Software > In "Work with" add Xtext: [Xtext Update Site](https://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/). Select Xtext package > Next > Finish > Wait for installation to complete.

* **JUnit Testing Framework** and **The Apache Commons IO via Orbit project**: [Download Orbit](https://download.eclipse.org/tools/orbit/)

In Eclipse:
Help > Install New Software > In "Work with" add Orbit: [Orbit Update Site](https://download.eclipse.org/tools/orbit/downloads/drops/R20211213173813/repository/). Select JUnit Testing Framework, JUnit Jupiter API, and Apache Commons IO package > Next > Finish > Wait for installation to complete.

Eclipse comes with its own Java runtime, which is the one used for the thesis runs.

The Alloy Analyzer is bundled with the toolchain as a library (`lib/alloy6.0.0.jar` in the analysis project; the jar identifies itself as version 6.1.0). No separate installation is required.




## 3. Getting the source

Clone the repository:

```
git clone https://github.com/sgjorche/cbdf-toolchain
```

The toolchain projects are in `toolchain/`, the use-case projects in `use-cases/`, and CBDL Studio in `studio/`.

## 4. Importing and building the toolchain

1. Start Eclipse with a new, empty workspace.
2. File → Import → General → Existing Projects into Workspace.
3. Select the `toolchain/` folder of this repository and import all projects it contains.
4. In the `swarchitecture.compliance.security.cbdl` project, open `src` and the package `swarchitecture.compliance.security.cbdl`, then right-click `CBDL.xtext` → Run As → Generate Xtext Artifacts. This generates the CBDL parser and editor from the grammar.
5. Clean and build the workspace (Project → Clean → Clean all projects). No errors should remain.



## 5. Starting the toolchain

The toolchain runs as a plugin in a second Eclipse instance. Right-click the `cbdf.core` project → Run As → Eclipse Application. A new Eclipse window opens with the CBDL editor, the generator, and the report command available. The remaining sections are carried out in that window.

## 6. Importing a use-case project

1. File → Import → General → Existing Projects into Workspace.
2. Select one use-case folder, for example `use-cases/scada/controls-applied/`.

A use-case project contains the four system-specific files (`design.cbdl`, `checks.cbdl`, `controls.cbdl`, `securitycontrol.cbdl`), the imported libraries under `lib/`, and the generated artifacts under `src-gen/` as produced for the thesis.

## 7. Reproducing the results

Generation, verification, and reporting are started by a single command and run one after the other as a background job.

1. In the use-case project, right-click `checks.cbdl` → Cs4cbse2Alloy.
2. Progress is written to the console.


On completion, `src-gen/report.html` is created. It contains the analysis summary (checks, passes, errors, controls applied, analysis time), the table of controls applied per connector, and one entry per check with its property, regulatory references, scope, applied controls, status, and, for a failing check, the reason and a suggested control.


## 8. Modelling a new system



Open `studio/CBDL_Studio.html` in a browser. Draw the architecture, select the regulatory regime, declare compliance checks on component pairs, assign controls to connectors, and export. The exported folder has the layout of a use-case project and can be imported into Eclipse as in Section 6.


