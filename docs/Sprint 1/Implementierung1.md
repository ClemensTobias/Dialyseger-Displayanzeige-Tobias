## Traceability-Matrix

| Requirement-ID | Komponente                         | Klasse(n)                             | Schnittstelle(n)                  |
|----------------|------------------------------------|---------------------------------------|-----------------------------------|
| 1.1            | Display output                     | `Display`                             | updateArterialPressure()          |
| 1.2            | Display output                     | `Display`                             | updateVenousPressure()            |
| 4.1            | Display output                     | `Display`                             | updateTime()                      |
| 4.2            | Display output                     | `TimerButton`                         | addTime(), decreaseTime()         |
| 1.3            | hardwareAbstraction                | `ArterialPressureSimulator`           | GeneratreRandomArterailPressure() |
| 1.4            | hardwareAbstraction                | `VenousPressureSimulator`             | GeneratreRandomVenousPressure()   |
