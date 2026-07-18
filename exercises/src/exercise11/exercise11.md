# EPR-WIN (Prof. Schneider/Prof. Eiglsperger), Blatt 11

## Hinweis

Beachten Sie
die [Java-Naming-Konventionen](https://bwsyncandshare.kit.edu/s/xqek5T4cR533PEo)!
Bitte erstellen Sie für jedes Aufgabenblatt ein package (`exercise11`, etc.) und
darin für jede Aufgabe eine Klasse und geben dieser ihr einen geeigneten Namen.

## Aufgabe 11.1 - Präsenzaufgabe

a) Schreiben Sie eine Klasse `Kredikarte`, welche die Nummer der Kreditkarte und den Namen des Inhabers als String
speichert.

Zusätzlich soll der Herausgeber der Kreditkarte als Enum gespeichert werden.
Als zulässige Werte werden `MasterCard` und `Visa` definiert.

Schreiben Sie einen Konstruktor, welcher diese Werte als Parameter akzeptiert, aber keine getter/setter-Methoden für
diese Attribute.

Zusätzlich soll die Kreditkarte ein Attribut `balance` enthalten, welches den aktuellen Kontostand der Karte speichert.
Dieses Attribut soll mit 0 initialisiert werden und für dieses Attribut soll eine get-Methode implementiert werden.

Schreiben Sie eine Klasse `KreditkarteTest` und testen Sie Ihre Klasse.

b) Die Nummer der Kreditkarte soll ohne Leerzeichen und Bindestriche gespeichert werden.
Überprüfen Sie im Konstruktor daher, dass es sich bei der Kreditkartennummer um eine 16-stellige Zahl handelt.

- Überlegen Sie sich zuerst ein Verfahren, wie sie dies überprüfen, und schreiben dieses in Stichworten auf.
- Erklären Sie das Verfahren dem Tutor
- Implementieren Sie das Verfahren
  Falls die Überprüfung fehlschlägt, soll eine `IllegalArgumentException` geworfen werden.
  Testen Sie Ihre Klasse in `KreditkarteTest`.

c) Überschreiben Sie die `toString()` Methode der Klasse Kreditkarte. Dabei soll der Name des Inhabers und der
Herausgeber der Karte angezeigt werden,
sowie die Nummer der Karte, wobei alle Stellen außer den letzten 4 Stellen durch `X` ersetzt werden.
Beispiel: "Hans Meier XXXX XXXX XXXX 4111 (Visa)"
Testen Sie Ihre Klasse in `KreditkarteTest`.

## Aufgabe 11.2 - Hausaufgabe

a) Eine *Co-Branding-Kreditkarte* sammelt bei der Benutzung Bonuspunkte in einem Treueprogramm, z.B. Airline-Meilen.
Erstellen Sie eine Klasse `HTWGKreditkarte` welche von `Kreditkarte` erbt, und Bonuspunkte für die Mensa sammelt.
Dazu benötigt die Klasse die zusätzlichen Attribute `matrikelNummer`und `mensaBonusPunkte`.
Die Matrikelnummer des Studierenden soll im Konstruktor übergeben werden, `mensaBonusPunkte`
mit dem Startbonus `10` initialisiert werden.
Implementieren Sie für das Attribut `mensaBonusPunkte` eine get-Methode.
Testen Sie Ihre Klasse in `KreditkarteTest`.

b) Wir wollen nun mit der Kreditkarte bezahlen können und implementieren deswegen eine Methode `bezahlen(double)`.
In der Klasse `Kredikarte` soll beim Aufruf der Betrag vom aktuellen Kontostand abgezogen werden.
In der Klasse `HTWGKreditkarte` soll beim Aufruf der Betrag vom aktuellen Kontostand abgezogen werden
und zusätzlich `mensaBonusPunkte` aktualisiert werden.
Dabei soll nach folgendem Verfahren vorgegangen werden:

* Für jeden Bezahlvorgang gibt es einen Bonus von 10 Punkten.
* Wenn der Betrag *100 Euro* übersteigt, werden zusätzlich 3 % des Betrags als Bonus berechnet, dabei wird bei der
  Berechnung aufgerundet.
  Testen Sie Ihre Klasse in `KreditkarteTest`.

## Aufgabe 11.3 - Hausaufgabe

Schreiben Sie ein Programm, das prüft, ob eine Kreditkartennummer gültig ist in dem die Prüfziffer kontrolliert wird.
Die letzte Ziffer der Karte ist die Prüfziffer, die nach dem Luhn-Algorithmus berechnet wird.
Sie können dazu die Implementierung dieses Algorithmus aus Aufgabenblatt 7 verwenden.
Testen Sie Ihr Programm mit der MasterCard-Nummer 5500 0000 0000 0004 und der Visa-Nummer 4111 1111 1111 1111.
