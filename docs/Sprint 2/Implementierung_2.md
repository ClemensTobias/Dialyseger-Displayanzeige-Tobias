## Traceability-Matrix
Tracability Matrix für alle im 2. Sprint realisierten Requirements

| Requirement-ID | Komponente                         | Klasse(n)                             | Schnittstelle(n)                                                  | Test   |
|----------------|------------------------------------|---------------------------------------|-------------------------------------------------------------------|--------|
| 2.1            | Display output                     | `Display`                             | createFrame(),createLabel()                                        |        |                 
| 2.2            | Display output                     | `Display`                             | createFrame(),createLabel()                                        |        |
| 2.5            | Display output                     | `Display`                             | createFrame(),createLabel(),updateTime(),                          |       |
| 2.6            | Calculation Logic                  | `CheckDialysateLevel`                 | reduceByFlowRate()                                                 |      |
| 3.1            | Display output                     | `Display`                             | createFrame(),createLabel()                                        |       |
| 3.2            | hardwareAbstraction, Calculation Logic, Display output    | `DialysateSimulator`,`CheckDialysateTemeprature` ,`Display`      | createFrame(),createLabel(),simulateTemperature(),checkDialysateTemperature()  |      |

-> 1.8 und 3.3 wurden während dieses Sprints nicht implementiert
