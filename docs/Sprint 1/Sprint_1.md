# Sprint 1

## Sprint Planung

Zu beginn soll festgelet werden welche Requirements im ersten Sprint realisiert werden sollen. Dabei liegt der Fokus darauf 
eine grundlegende Funktionalität der Aplikation festzulegen. Dafür sollen folgende Kernfunktionen implementiert werden:

- Darstellung des Venösen und Arteriellen Drucks als Ganzzahl in mmHg

- Darstellung der verbleibenden Dialysezeit im Format hh:mm:ss

- Darstellung von 2 Knöpfen um die Dialysezeit zu erhöhen

- Darstellen eines Start/Stop knopf, der die dialyse Startet/stoppt

- Simulation der Hardwarekomponenten zur Ermittlung der Werte

Diese Funktionen wurden gewählt, da die Darstellung, sowie die Simulation der Bereitstellung der benötigten Werte,
spezifisch für den Venösen und Arterillen Druck in kombination mit der Dialysezeit die wichtigsten Komponenten in
der Displayanzeige festlgegen. Zusätzlich wird noch ein Start/Stop knopf hinzugefügt, um die Displayanzeige überhaupt starten
zu können.

Requierements:

Req. 1.1 
Req. 1.2
Req. 1.3
Req. 1.4
Req. 4.1
Req. 4.2

## Architektur

Basierend auf den hier ausgewählten Requierements wurde die Archektur dahingehend angepasst, die funktion und Zuordung der 
Requirements des 1. Sprints zu verdeutlichen


## Design

Zusätzlich wurden für die Requirements des 1. Sprints ein erstes Klassendiagramm, ein dazu passendes Sequenzdiagramm und 
ein Kommunikationsdiagramm erstellt

## Abweichungen nach Implementierung

### Architektur

Aufgrund der begrenzeten anzahl an Requirements die innerhalb des 1 Sprints umgesetzt wurden ergeben sich Abweichungen zur zuvor
festgelegten Software Architektur. Es wurden nur Requirements aus der 'Hardware Abstraction' und dem 'Display Output' ausgewält,
wodurch sowohl der 'Persistance Manager' als auch die 'Calculation Logic' als Komponenten nicht existieren. Um den Aktuellen Stand
nach Sprint 1 wiederzuspiegeln wurde dementsprechend die Architektur.md angepasst.

### Design

#### Klassendiagramm

Aufgrund der Art und Weise wie die Buttons implementiert wurden, besitzt die Display Klasse, im Vergleich zum ersten Entwurf der Klasse, nun
noch zusätzlich 3 JButtons, die initialisiert werden. Zusätzlich verhält sich die art und weise wie Werte updated auch anders als erwartet,
wesewegen auch die zuerst angedachten funktionen vollständig ersetzt werden müssen. Ähnliches gilt für die Druck Wert Generation, da es nicht
nur einen Wert gibt der erzeugt wird, sondern dieser aus einem min und max Wert gebildet werden muss.

Auch wurde während der implementierung nicht aufmerksam genug auf die Bennenung der Funktionsnamen geachtet, wodurch sich 
dahingehend abweichungen befinden, die nun überarbeitet werden müssen

Überarbeitetes Klassendiagramm:

### Kommunikationsdiagramm

Auch hier müssen die 3 JButtons als Elemente der Display Klasse hinzugefügt werden, sowie die funktionen überarbeitet werden

Überarbeitetes Kommunikationsdiagramm: 

## Erkenntnisse aus 1. Sprint

Die für micht wichtigste Erkenntnis aus dem 1. Sprint besteht darin, sich strickt an das sich zuvor überlegte Design zu halten. Während der
Implementierung habe ich mich nicht genau an die Funktionsnamen aus dem zuvor überlegten Design übernommen. Dadurch kann es jetzt für
aussenstehende schwer werden, meinen Code nachzuvollziehen. Auch für mich selbst wird es dadurch umständlicher den Überblick über bereits
implemntierte Funktionen zu behalten

Stichpunkthaltige Reflextion über den Sprint:

**Positiv**
  - Alle vorgenommenen Requirements wurden implementiert
- Zeitplan wurde (mit 1 Ausnahme) eingehalten
- Tests wurden erfolgreich durchgeführt

**Herausforderungen**
- Einarbeitung in tools zur Design erstellung
- Recherche zur GUI umsetzung in java
- Tracability Matrix korrekt zu erstellen

**Gewonnene Erkenntnisse**
- Ich werde mich im nächsten Sprint genauer an das festgelegte Design halten
- Sollten sich während der Implementierung änderungen im Design ergeben, werde ich diese Sofort in der documentation anpassen

## Baseline:

Innerhalb des ersten Sprints konnten die grundelgensten funktion, wie ein timer und die implementierung eine GIU realisiert werden.
Dadurch ist insgesammt eine solide Basis geschaffen, auf der sich zusätzliche Features schnell und einfach implementieren lassen, indem sie
auf der aktuellen Struktur aufbauen.






