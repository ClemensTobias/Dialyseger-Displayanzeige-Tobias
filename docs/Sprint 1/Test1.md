## Tests auf Modul Ebene

| Testfall-ID | Module                         | Vorbedingung  | Aktion             | Erwartetes Ergebnis | Nachbedingung      |Korrekt abgelaufen? |
| :---------- | :----------------------------- | :------       | :----------------- | :-----------------  | :------------------| :-------------     |
| M1 | Display | Ein Display-Objekt wurde erzeugt. Dialysezeit wird auf 00:03:00 gesetzt. | updateTime() wird aufgerufen | Die interne Zeitvariable wurde korrekt um 1 Sekunde reduziert. | Interne Zeitvariable wird auf 00:02:59 aktualisiert| |
| M2 | TimerButton | Ein Display-Objekt wurde erzeugt. Dialysezeit wird auf 00:03:00 gesetzt. | increaseRemainingTime() wird ausgeführt. | Die interne Zeitvariable wurde um 30s erhöht | Interne Zeitvariable wird auf 00:03:30 aktulalisiert |  | 
| M3 | TimerButton | Ein Display-Objekt wurde erzeugt. Dialysezeit wird auf 00:03:00 gesetzt. | decreaseRemainingTime() wird ausgeführt. | Die interne Zeitvariable wurde um 30s reduziert | Interne Zeitvariable wird auf 00:02:30 aktulalisiert | |





## Tests auf Integrations Ebene
| Testfall-ID | Module | Vorbedingung  | Aktion  | Erwartetes Ergebnis  |Nachbedingung|Korrekt abgelaufen?|
| :---------- | :----------------------------- | :--------------- | :---------------------- | :----------------------- | :-----------------| :----------------|
| I1 | Display, TimerButton|Display und TimerButton existieren. verbleibendeZeit = 00:03:00 . Das Display zeigt 00:03:00 Sekunden an. | TimerButton.increaseRemainingTime() wird aufgerufen und danach ruft TimerButton → Display.updateTime() auf.| Display zeigt neue Zeit korrekt an 00:03:30 | Beide Komponenten haben konsistente Werte: TimerButton.verbleibendeZeit = 00:03:30 ; Display zeigt 00:03:30 | |
| I2 | Display | Label für Zeit, Arteriellen und Venösen Druck werden initialisiert | Display.createFrame() wird ausgeführt | Erstellten Labels werden fügen Anzeigeelemente zum Haupfenster hinzu | Das Hauptfenster enthält zwei zusätzliche Elemente (labels) | 
| I3 | Display, PressureSimulator | PressureSimulator und Display existieren. Display erwartet einen neuen Druckwert zur Anzeige | PressureSimulator generiert einen Druckwert, welche durch die labels im Hauptfenster dargestellt werden | Display zeigt den geliferten Druck an, Label wird aktualisiert, nicht neu erstellt | Der Druck ist im Display Sichtbar |
