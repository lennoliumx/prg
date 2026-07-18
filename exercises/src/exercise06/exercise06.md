# EPR-WIN (Prof. Schneider/Prof. Eiglsperger), Blatt 06

## Anmerkungen

- Verwenden Sie bitte jeweils einen sinnvollen Variablennamen.
- Variablennamen *müssen* den [Namenskonventionen](https://bwsyncandshare.kit.edu/s/xqek5T4cR533PEo) entsprechen.

## Aufgabe 6.1 - Präsenzaufgabe

a) Erzeugen Sie eine Datei `Foerderung.java` im package `exercise06` und kopieren Sie folgenden Code:

```
void main() {
   System.out.println(pruefeFoerderung(20,false));
}

boolean pruefeFoerderung(int alter, boolean oelHeizung) {



}
```

a) Ergänzen sie die Java Methode `pruefeJahr`, welche entscheidet, ob der Austausch einer Heizung förderfähig ist.
Der Austausch einer Heizung ist förderfähig, wenn die Heizung älter als 20 Jahre ist oder wenn es sich um eine Ölheizung
handelt.

b) Ergänzen Sie die `main()` Methode, mit einem Aufruf der Methode `pruefeFoerderung`, der `false` zurückgibt.

## Aufgabe 6.2 - Präsenzaufgabe

Im Blatt 2 haben wir bereits die *absolute* und die *relative* Handelsspanne kennengelernt.

a) Erzeugen Sie eine Datei `Handelsspanne.java` im package `exercise06`.

b) Implementieren Sie zuerst eine Methode, welche die *absolute* Wareneinsatzquote berechnet.
Definieren Sie dazu zuerst die Signatur der Methode für die Berechnung der *absoluten* Handelsspanne:

* Bestimmen Sie den Rückgabewert
* Bestimmen Sie einen sinnvollen Namen für die Methode und passen ihn der Java Namenskonvention an.
* Bestimmen Sie die Parameter und den Typ der Parameter

Implementieren Sie dann die Formel und geben das Ergebnis zurück.

ACHTUNG: Alle Eingaben/-Ausgaben sollen über Parameter und Rückgabewerte erfolgen, kein `Scanner`, kein
`System.out.println()` innerhalb der Methode.

c) Testen Sie die Methode. Rufen Sie dazu die Methode mit mindestens drei Beispielwerten aus der *main()* Methode auf.
Geben Sie nach dem Aufruf die Parameter und den Rückgabewert auf der Console mit ``printf`` und geeigneter Formatierung
aus.

d) Ergänzen Sie nun die Datei um die Berechnung der *relativen* Handelsspanne.
Schreiben Sie analog zu b) die entsprechende Methode und rufen Sie diese analog zu c) auf.

## Aufgabe 6.3 - Hausaufgabe (4 Punkte)

Schreiben Sie eine Methode welche ein Namensschild erzeugt.

Beispiel:

```
Max MUSTERMANN
- Consultant -
```

Es sollen also Vorname, Nachname und Beruf übergeben werden,
und die Ausgabe soll dann im obigen Format erscheinen.
Erzeugen Sie dazu eine Datei `NamenschildNeu.java` im package `exercise06`.

a) Definieren Sie zuerst die Signatur der Methode Namenschild:

* Bestimmen Sie den Rückgabewert
* Bestimmen Sie einen sinnvollen Namen für die Methode und passen ihn der Java Namenskonvention an.
* Bestimmen Sie die Parameter und den Typ der Parameter

b) Implementieren Sie die Methode mit nur einem Aufruf zu ``String.format`` (
siehe https://openbook.rheinwerk-verlag.de/javainsel/05_011.html).
Testen Sie die Methode, indem Sie sie mit Beispielwerten aus der *main()* Methode aufrufen
und das Ergbnis auf der Console ausgeben.

ACHTUNG: Alle Eingaben/-Ausgaben sollen über Parameter und Rückgabewerte erfolgen, kein `Scanner`, kein
`System.out.println()` innerhalb der Methode.

c) Ergänzen Sie die *main()* Methode um die Eingabe der Daten über die Tastatur.
Verwenden Sie dazu die Klasse ``Scanner``.

## Aufgabe 6.4 - Hausaufgabe (4 Punkte)

Erstellen Sie im package `exercise06` eine Java Klasse `StringManipulation.java` mit main-Methode und schreiben darin
den Code für diese Aufgabe.

a) Erstellen Sie die `main()`Methode, und speichern Sie den Satz "Lake Constance is 63 kilometers long" in einer
Variablen.

b) Prüfen Sie mit einer geeigneten Methode, ob der Satz ein Leerzeichen enthält. Speichern Sie das Ergebnis in einer
Variablen und geben es auf der Konsole aus.

c) Benutzen Sie die Methode `substring(int beginIndex, int endIndex)`, um das erste Wort des Satzes abzuschneiden und
auf der Konsole auszugeben.

d) Geben Sie den Satz in Großbuchstaben und in Kleinbuchstaben auf der Konsole aus.

## Aufgabe 6.5 - Hausaufgabe (4 Punkte)

Erstellen Sie im package `exercise06` eine Java Klasse `StringFilter.java` mit main-Methode und schreiben darin den Code
für diese Aufgabe.

a) Schreiben Sie eine Methode `ohneLeerzeichen`, welche alle Leerzeichen in einem String entfernt.
Die Methode hat als Parameter einen `String` und als Rückgabewert ebenfalls einen `String`.

ACHTUNG: Alle Eingaben/-Ausgaben sollen über Parameter und Rückgabewerte erfolgen, kein `Scanner`, kein
`System.out.println()` innerhalb der Methode.

Beispiele sind:

* `ohneLeerzeichen("Ein Leerzeichen")` ist `EinLeerzeichen`
* `ohneLeerzeichen("Wort")` ist `Wort`
* `ohneLeerzeichen(" T T  T ")` ist `TTT`

Tipp: Initialisieren Sie den Rückgabewert als leeren String.
Schreiben Sie dann eine `for`-Schleife, welche alle Zeichen des Strings durchgeht und,
wenn es sich nicht um ein Leerzeichen handelt, an den Rückgabewert anhängt.

b) Rufen Sie diese Methode auf den Satz aus Aufgabe 6.4 auf und geben Sie das Ergebnis auf der Konsole aus.
