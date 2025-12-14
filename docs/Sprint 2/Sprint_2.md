# Sprint 2

## Sprint Planung

Im Zweiten Sprint sollen nun die im 1 Sprint implementierten grundfunktionalitäten weiter ausgebaut werden. Dafür werden die folgenden
Requirements implementiert:

- Darstellung der UF Menge

- Darstellung des UF Ziels

- Berechnung der UF Rate

- Anzeigen der UF Rate

- Darstellen des Verbleibenden Dialysefüllstands

- Anzeigen der Dialysat Temperatur


- Warnung bei geringem Arteriellen oder Venösen Druck

- Warnung bei zu geringem Dialysat Füllstands

Durch die Auswahl dieser Requirements werden die grundfunktionen durch die Darstellung des UF Ziels, der UF Menge, UF Rate, dem Dialysatfüllstands und
der Anzeige der dialysat erweitert. Zusätzlich werden bereits implementierte Funktonen durch die verwirklichung von Warn Meldungen bei geringem
Arteriellen/Venösen Druck und zu geringem Dialysat Füllstand weiter ausgebaut.

Requierements:

- Req. 2.1 
- Req. 2.2
- Req. 2.5
- Req. 2.6
- Req. 3.1
- Req. 3.2
- Req. 1.8 -> wurden nicht vollständig implementiert
- Req. 3.3 -> wurden nicht vollständig implementiert

## Architektur

Basierend auf den hier ausgewählten Requierements wurde die Archtiektur des 2 Sprints angepasst


## Design

Zusätzlich wurden für die Requirements des 2. Sprints ein erstes Klassendiagramm, ein dazu passendes Sequenzdiagramm und 
ein Kommunikationsdiagramm erstellt

## Abweichung nach Implementierung

### Architektur

Ähnlich wie im 1 Sprint wurden auch in diesem Sprint Requirements implementiert die eine Abweichung zur zuvor festgelegten Architektur ergeben. So wurde sie im vergliech zum 1.Sprint erweitert,
jedoch fehlt im Vergleich zur ursprünglich geplanten Architektur noch immer ein Teilbereich, der dann im 3.Sprint implementiert wird. 
Architektur.md wurde dementsprechend erneut angepasst

### Klassen-, Kommunikations- und Sequendiagramm

Das Klassendiagramm hat sich erneut verändert. Zusätzlich zu neuen Klassen ist auch die Ebene der "calculation logic" implementiert worden, wodurch das Klassendiagramm
inzwischen stärker die Architektur widerspiegelt.

Ähnlich wurden auch das Kommunikations und Sequenzdiagramm überarbeitet, um die Interaktion der neu implementierten funktionen und Klassen mit den zuvor implementierten
Systemen zu verdeutlichen.

[Überarbeitete_Diagramme](./Design_2.md)

## Tests

[Tests und ergebnisse](../referenziert/Test/Test1.md)


## Erkenntnisse aus 2. Sprint

Aufgrund von Selbstüberschätzung konnten nicht alle geplanten Funktionenen vollständig implemntiert werden. Die nächste Dezember Woche beeinhält 2 "Zwischenklausuren", die für das bestehen anderer Kurse essenziel sind, weswegen Ich mir für diesen Sprint weniger Zeit zur verfügung gestellt habe. Um nicht an Qualität zu verlieren wurden dementsprechend nicht alle Requirements vollständig implementiert (1.8 und 3.3). Um die Arbeitslast (trotz mehr Zeit) im 3 Sprint jedoch nicht unverhältnismäßig zu erhöhen,
wurde die Struktur (warningFlags und deren Trigger) jedoch schon korrekt umgesetzt

Stichpunkthaltige Reflextion über den Sprint:

**Positiv**
- fast alle vorgenommenen Requirements wurden implementiert
- Bisher implemntierter Code konnte problemlos erweiter werden
- Bei der Implementierung wurde sich von anfang an genau an das Design gehalten

**Herausforderungen**
- Unter erhöhtem Zeitdruck und Stress zu arbeiten

**Gewonnene Erkenntnisse**
Bei der Auswahl dafür, was in zukünftigen Sprints umzusetzen ist werde ich mehr auf äußere Faktoren achten, und dementsprechend die workload anpassen. 

Aktueller Stand:
UF aktuell, stand und Zeil, sowie der Aktuelle Dialysat Stand sowie dessen Temperatur werden erfolgreich simuliert und dargestellt. Auch die UF Rate und deren Einfluss (erhöhung des UF Stands nach 30s) wurde erfolgreich implementiert.
Die Warnausgaben konnten noch nicht vollständig umgesetzt werden, es wurde bis jetzt nur die aktualisierung der CheckValue flags gesetzt, die für die jeweilige Warnung überprüfen, ob eine Warnmeldung angezeigt werden muss



