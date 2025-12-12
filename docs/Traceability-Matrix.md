##Tracability Matrix

Hier ist die Vollständige Tracibilty Matrix aufzufinden. innerhalb der jeweiligen Sprint Ordner sind zusätzlich die Requirments, welche während des betrachteten 
Sprints impementiert wurden in Implementierung.md aufzufinden.


| Requirement-ID | Komponente                         | Klasse(n)                             | Schnittstelle(n)                                                  | Test   |  Sprint |
|----------------|------------------------------------|---------------------------------------|-------------------------------------------------------------------|--------|---------|
| 1.1            | Display output                     | `Display`                             | createFrame(),createLabel()                                        | I2    |    1    |         
| 1.2            | Display output                     | `Display`                             | createFrame(),createLabel()                                        | I2    | 1 |
| 1.3            | hardwareAbstraction                | `PressureSimulator`                   | PressureSimulator()                                                | I3      | 1 | 
| 1.4            | hardwareAbstraction                | `PressureSimulator`                   | PressureSimulator()                                                | I3     | 1 |
| 2.1            | Display output                     | `Display`                             | createFrame(),createLabel()                                        |       |  2 |               
| 2.2            | Display output                     | `Display`                             | createFrame(),createLabel()                                        |       | 2 |
| 2.5            | Display output                     | `Display`                             | createFrame(),createLabel(),updateTime(),                          |       | 2 |
| 2.6            | Calculation Logic                  | `CheckDialysateLevel`                 | reduceByFlowRate()                                                 |  I6   | 2 |
| 3.1            | Display output                     | `Display`                             | createFrame(),createLabel()                                        |       | 2 |
| 3.2 | hardwareAbstraction, Calculation Logic, Display output | `DialysateSimulator`,`CheckDialysateTemeprature` ,`Display`| createFrame(),createLabel(),simulateTemperature(),checkDialysateTemperature()  |  M4, M6  | 2 |
| 4.1            | Display output                     | `Display`                             | createFrame(),createLabel(),updateTime(),                          | M1      | 1 |
| 4.2            | Display output                     | `TimerButton`                         | increaseRemainingTime(), decreaseTimeRemaining(),createFrame()     | M2, M3, I1 | 1     |



