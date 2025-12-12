##Testfälle

Während jedes Sprints wurden je 3 Testfälle auf Modul und 3 Testfälle auf Integrations Ebene erstellt. Um Sicherzustellen, das durch die implementierung neuen Codes keine
vorher schon getesteten Featuers nicht mehr Funktionieren, wurden innerhalb jedes Sprints alle Testfälle erneut abgeprüft.
Im zweiten Sprint wurden also alle Tests auf dem 1. und 2. Sprint durchgeführt und im 3 Sprint alle Tests aus dem 1. , 2. und 3 Sprints.

## Tests auf Modul Ebene

| Testfall-ID | Module                         | Vorbedingung  | Aktion             | Erwartetes Ergebnis | Nachbedingung      |Korrekt abgelaufen? |
| :---------- | :----------------------------- | :------       | :----------------- | :-----------------  | :------------------| :-------------     |
| M1 | Display | Ein Display-Objekt wurde erzeugt. Dialysezeit wird auf 00:03:00 gesetzt. | updateTime() wird aufgerufen | Die interne Zeitvariable wurde korrekt um 1 Sekunde reduziert. | Interne Zeitvariable wird auf 00:02:59 aktualisiert| ✅ |
| M2 | TimerButton | Ein Display-Objekt wurde erzeugt. Dialysezeit wird auf 00:03:00 gesetzt. | increaseRemainingTime() wird ausgeführt. | Die interne Zeitvariable wurde um 30s erhöht | Interne Zeitvariable wird auf 00:03:30 aktulalisiert | ✅| 
| M3 | TimerButton | Ein Display-Objekt wurde erzeugt. Dialysezeit wird auf 00:03:00 gesetzt. | decreaseRemainingTime() wird ausgeführt. | Die interne Zeitvariable wurde um 30s reduziert | Interne Zeitvariable wird auf 00:02:30 aktulalisiert | ✅ |
| M4 |  DialysateSimulator | Display.remainingTime = 00:02:30 gesetzt, DialysateSimulator.temperature = 38 | simulateTemperature() wird aufgerufen |Temperatur wird entweder 37 oder 39 (±1 zufällig) | Rückgabewert ist ein String, der die aktuelle Temperatur repräsentiert | ✅ |
| M5 | CheckVenousPressureValues | VenousPressureSimulator liefert einen wert über "250“ zurück |checkVenousPressure() aufrufen | venousPressureWarning wird true gesetzt | interner Status venousPressureWarning = true | ✅ |
| M6 | CheckDialysateLevel | ufCurrent = 0, Display.remainingTime = 00:02:30 | increaseByFlowRate() wird ausgeführt | ufCurrent erhöht sich auf 1 und "1" wird zurückgegeben | ufCurrent bleibt auf 1 gesetzt | ✅ |





## Tests auf Integrations Ebene
| Testfall-ID | Module | Vorbedingung  | Aktion  | Erwartetes Ergebnis  |Nachbedingung|Korrekt abgelaufen?|
| :---------- | :----------------------------- | :--------------- | :---------------------- | :----------------------- | :-----------------| :----------------|
| I1 | Display, TimerButton|Display und TimerButton existieren. verbleibendeZeit = 00:03:00 . Das Display zeigt 00:03:00 Sekunden an. | TimerButton.increaseRemainingTime() wird aufgerufen und danach ruft TimerButton → Display.updateTime() auf.| Display zeigt neue Zeit korrekt an 00:03:30 | Beide Komponenten haben konsistente Werte: TimerButton.verbleibendeZeit = 00:03:30 ; Display zeigt 00:03:30 |✅ |
| I2 | Display | Label für Zeit, Arteriellen und Venösen Druck werden initialisiert | Display.createFrame() wird ausgeführt | Erstellten Labels werden fügen Anzeigeelemente zum Haupfenster hinzu | Das Hauptfenster enthält zwei zusätzliche Elemente (labels) | ✅ |
| I3 | Display, PressureSimulator | PressureSimulator und Display existieren. Display erwartet einen neuen Druckwert zur Anzeige | PressureSimulator generiert einen Druckwert, welche durch die labels im Hauptfenster dargestellt werden | Display zeigt den geliferten Druck an, Label wird aktualisiert, nicht neu erstellt | Der Druck ist im Display Sichtbar |✅ |
| I4 | DialysateSimulator, CheckDialysateTemperature | Display.remainingTime = 00:02:30, DialysateSimulator.temperature = 41 | checkDialysateTemperature() wird ausgeführt | dialysateTemperatureWarning wird true, Rückgabe = "41" | Beide Module haben konsistente Werte: Warning aktiviert | ❌ |
| I5 | VenousPressureSimulator, CheckVenousPressureValues, Display | VenousPressureSimulator liefert z. B. „-250“ | checkVenousPressure() wird ausgeführt und Display aktualisiert das Druck-Label | Display zeigt den Wert korrekt an und venousPressureWarning = true | Druckwert im Display ist sichtbar und stimmt mit dem generierten überein |✅ |
| I6 | CheckDialysateLevel, Display  | Display.remainingTime = 00:02:30; ufCurrent = 0 | increaseByFlowRate() wird ausgeführt, danach Display.updateTime() | Display zeigt neuen UF-Wert (1) korrekt an | Display und CheckDialysateLevel haben konsistente Werte |✅ |
