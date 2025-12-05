# Design

## Klassendiagramm

In Folgendem Klassendiagramm werden die Klassen des 2 Sprints, inklusive ihrer Parameter, Methoden und Beziehung zueinander dargestellt

![Klassendiagramm](../referenziert/Design/Sprint_2_Klassendiagramm.png)

## Sequenzdiagramm

![SequenzDiagramm](../referenziert/Design/Sprint_2_Sequenzdiagramm.png)

## Kommunikationsdiagramm

![SequenzDiagramm](../referenziert/Design/Sprint_2_KommunikationsDiagramm.png)


## Designpatterns

| Klasse                     | Design-Pattern | Grund                                                                                                                      |
|----------------------------|----------------|----------------------------------------------------------------------------------------------------------------------------|
| Display                    | Observer       | Display muss automatisch aktualisiert werden, sobald sich einer der dargestellten Werte ändert. Durch das Observer pattern wird die Anzeige von den Simulatoren entkoppelt |
| TimerButton                | Command        | Verantwortlich für die Verarbeitung der Veränderung der Dialysezeit durch Benutzer interaktion       |
