# EPR-WIN (Prof. Schneider/Prof. Eiglsperger), Blatt 10

## Hinweis

Benutzen Sie als Vorbereitung für das Testat den Editor VSCodium.
Laden Sie VSCodium von der [Webseite](https://vscodium.com/)
herunter und installieren Sie es.

Um mit VSCodium sinnvoll mit Java arbeiten zu können, müssen Sie folgendes Extension Pack installieren:

* [Java Extension Pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)

Gehen Sie dazu in das Extensions Menu (linke Menüspalte) und suchen Sie nach
"Java Extension Pack".
Selektieren Sie das "Java Extension Pack" und klicken Sie auf "Install".

## Aufgabe 10.1 - Präsenzaufgabe

Erstellen Sie ein neues Verzeichnis, in welchem Sie Ihre Java-Programm für diese Aufgabe abspeichern.
Dies sollte nicht ihr bisheriges Verzeichnis sein, in dem Sie arbeiten.
Öffnen Sie dieses Verzeichnis in VSCodium in dem Sie "File" -> "Open Folder" auswählen, und dann das Verzeichnis
auswählen.

a) Erstellen Sie ein Verzeichnis `exercise10` in dem Sie Ihre Java-Programme abspeichern.

b) Zum Erstellen einer Enum klicken Sie mit rechts auf das
Package `exercise10`, wählen "New Java File", wählen aus der Liste den Typ "Enum..." aus, und drücken Enter.
Geben Sie anschließend den Namen ein. Erstellen Sie auf diese Weise:

- eine Enum `Color` mit den Konstanten
  `BLUE, GREEN, YELLOW, BLACK, RED, SILVER` und
- eine Enum `Manufacturer` mit den
  Konstanten `AUDI, BMW, VOLKSWAGEN, PORSCHE, FERRARI, TOYOTA, HONDA`

Für jeden Enum legen Sie also eine neue Datei an.

c) Erstellen Sie eine Klasse `CarMain` mit einer Main-Methode.

Erstellen Sie eine weitere Klasse `Car` mit den Attributen `color`,`maxSpeedKmh` und `manufacturer`.
Wählen Sie für die Attribute sinnvolle Datentypen. Erstellen Sie get-Methoden für die Attribute, aber keine
set-Methoden.

d) Überschreiben Sie den Default-Konstruktor der Car-Klasse (`public Car() { ... }`). Der neue Konstruktor soll
standardmäßig jede neue Instanz als silbernen Volkswagen mit 150 km/h Maximalgeschwindigkeit anlegen.

Implementieren Sie einen weiteren Konstruktor, an den Sie die Attribute (`color`, `maxSpeedKmh` und `manufacturer`)
übergeben können, um ein neues Objekt anzulegen. **Benutzen Sie in den Konstruktoren Ihre Enums aus a) !**

e) Implementieren Sie in `Car` die Methode `toString()`, welche folgenden String zurückgibt:
`"Car{color=<color>, maxSpeedKmh=<maxSpeedKmh>, manufacturer=<manufacturer>}"`. Die Angaben `<...>` sollten jeweils
durch entsprechende Werte der Attribute ersetzt werden.

f) Implementieren Sie in `CarMain` eine Klassenmethode `fastestCar`. Diese nimmt als Parameter zwei `Car`-Instanzen
`car1` und `car2`. Die Rückgabe ist die folgende:

- 1, wenn die erste Instanz einen größeren Wert für die max. Geschwindigkeit hat
- 2, wenn die zweite Instanz einen größeren Wert für die max. Geschwindigkeit hat
- 0, wenn beide denselben Wert haben.

g) Erstellen Sie in Ihrer `CarMain`-Klasse 4 verschiedene Autos. Nutzen Sie `toString()`, um die Autos in der Konsole
auszugeben.
Nehmen Sie zwei dieser vier Autos und prüfen welches davon das schnellere ist. Machen Sie auch hier eine entsprechende
Ausgabe.

## Aufgabe 10.2 - Hausaufgabe

Implementieren Sie eine Klasse welche Texteinträge verwaltet.

a) Erstellen Sie eine Klasse `Eintrag` mit privaten Attributen `title` und `text`.
Ergänzen Sie die Klasse mit get/set-Methoden, um auf die Werte der Attribute zuzugreifen.
Erstellen Sie einen Konstruktor, welcher die initialen Werte für `titel` und `text` als Parameter übergeben bekommt.

b) Erzeugen Sie in der `main()` Methode einer Klasse `Main` drei Instanzen der Klasse  `Eintrag`  aus Aufgabe a)
mit Namen `instance1`, `instance2`, und `instance3` mit Beispieldaten.

c) Implementieren Sie für die Klasse  `Eintrag`  aus a) eine Instanz-Methode `isLong` die `true` zurück gibt,
wenn die Länge von `titel` und `text` addiert größer als 1000 Zeichen ist und ansonsten false.

d) Ergänzen Sie in der Klasse `Main` die `main()` Methode. Rufen Sie auf den drei Beispielinstanzen jeweils die
Methode `isLong` auf.