## Traceability-Matrix
Tracability Matrix für alle im 1. Sprint realisierten Requirements

| Requirement-ID | Komponente                         | Klasse(n)                             | Schnittstelle(n)                                                  | Test   |
|----------------|------------------------------------|---------------------------------------|-------------------------------------------------------------------|--------|
| 1.1            | Display output                     | `Display`                             | createFrame(),createLabel()                                        | I2       |                 
| 1.2            | Display output                     | `Display`                             | createFrame(),createLabel()                                        | I2       |
| 4.1            | Display output                     | `Display`                             | createFrame(),createLabel(),updateTime(),                          | M1      |
| 4.2            | Display output                     | `TimerButton`                         | increaseRemainingTime(), decreaseTimeRemaining(),createFrame()     | M2, M3, I1     |
| 1.3            | hardwareAbstraction                | `PressureSimulator`                   | PressureSimulator()                                                | I3      |
| 1.4            | hardwareAbstraction                | `PressureSimulator`                   | PressureSimulator()                                                | I3     |
