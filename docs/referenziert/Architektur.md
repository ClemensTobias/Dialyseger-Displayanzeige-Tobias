#Architektur

**Schichtenarchitektur**:

##Komponentendiagramm


![Komponenten Diagramm](Komponentendiagramm.png)

| | **Komponente** | **Requirements** |
|:-:|:---|:---|
| 4 | **Display output** | Req. 1.1, Req. 1.2, Req. 2.1, Req. 2.5 Req. 2.3, Req. 3.1, Req. 3.2, Req. 4.1, Req. 5.1, Req. 5.2 |
| 3 | **Calculation Logic (Anwendungslogik/Core)** | Req. 1.3, Req. 1.4, Req. 2.2, Req. 2.4 Req. 2.6, Req. 3.3, Req. 3.4, Req. 3.5 Req. 5.1, Req. 5.2 |
| 2 | **Hardware Abstraction** | Req. 1.3, Req. 1.4, Req. 3.5, Req. 3.6 |
| 1 | **Persistence Manager** | Req. 5.3, Req. 5.4 |




**Verantwortlichkeiten der Komponenten:**

| **Komponente** | **Rolle** | **Verantwortlichkeiten** |
|:---|:---|:---|
| **Display output** | Schnittstelle zum Benutzer | Aktualisierung und Darstellung der Messwerte |
| **Calculation Logic (Anwendungslogik/Core)** | Geschäftslogik und Steuerung | Berechnen der UF-Rate; Validieren von Messwerten; Auslösen von Warnungen bei Grenzwertverletzung. |
| **Hardware Abstraction** | Bindeglied zur Sensorik | Liefern der Messwerte (Venöser Druck); Gewährleistung der Messgenauigkeit; Echtzeit-Datenerfassung. |
| **Persistence Manager** |Datenverwaltung|  Temporäres Speichern von Messdaten|
