# EPR-WIN (Prof. Schneider/Prof. Eiglsperger), Blatt 07

## Anmerkungen

- Verwenden Sie bitte jeweils einen sinnvollen Variablennamen.
- Variablennamen *müssen* den [Namenskonventionen](https://bwsyncandshare.kit.edu/s/xqek5T4cR533PEo) entsprechen.

## Aufgabe 7.1 - Präsenzaufgabe

Erstellen Sie eine Datei `Fibo.java` im package `exercise07`.

* Schreiben Sie eine `main()`Methode, die einen Array mit den ersten 6 Zahlen der Fibonacci-Reihe enthält.
* Schreiben Sie dann eine Schleife, welche die Summer der ersten 6 Zahlen ausgibt.
* Schreiben Sie dann eine Schleife, welche die Differenz zweier benachbarter Zahlen im array ausgibt.

## Aufgabe 7.2 - Präsenzaufgabe

Gegeben ist folgender Code, welcher eine Zufallszahl zwischen 0 und 50 erzeugt.
Kopieren Sie den Code in Ihre Klasse und führen ihn mehrmals aus.

```
void main() {
    // creates a random number between 0 and 50
    int randomNumber = (int) (51 * Math.random());
    System.out.println(randomNumber);
}
```

a) Benutzen Sie den gegebenen Code sowie eine Schleife, um einen int-Array mit
100 zufälligen Zahlen zu befüllen. Tipp: Sie können
mittels `System.out.println(Arrays.toString(<ArrayName>))` ein Array in einer
Zeile auf der Konsole ausgeben, um zu überprüfen, welche Werte sich darin
befinden.

b) Geben Sie die Werte des Arrays zusammen mit ihrem Index auf der Konsole aus.
Schreiben Sie diesen Code nach dem Code von Aufgabe a) und verwenden eine weitere
Schleife.

c) Berechnen Sie die Summe aller Werte des Arrays.
Zur Überprüfung der Werte kann es hilfreich sein, die
Array-Größe temporär zu reduzieren (z.B. nur 3 Elemente zu erzeugen).

## Aufgabe 7.3 - Hausaufgabe (5 Punkte)

Schreiben Sie Methoden, die folgende Werte für int-arrays berechnen:

a) die Summe aller Werte

b) die Summe aller geraden Zahlen

c) ob das Array einen negativen Wert enthält

d) der kleinste Wert

e) der größte Wert

f) der Durchschnitt aller Werte auf 2 Dezimalstellen genau

Bestimmen Sie zuerst Rückgabewert, Name und Parameter der Methode.
Implementieren Sie dann den Methodenkörper.
Rufen Sie jeweils die Methode mit dem in a) erzeugten Array auf und geben sie das Ergebnis auf der Konsole aus.
Verwenden Sie dazu **keine** Hilfsmethoden aus dem SDK (z.B. ist `Arrays.sort()`
nicht erlaubt). Zur Überprüfung der Werte kann es hilfreich sein, die
Array-Größe zu reduzieren (z.B. nur 3 Elemente zu erzeugen).

## Aufgabe 7.4 - Hausaufgabe (4 Punkte)

Wir wollen ein Programm schreiben, welches für eine lange Zahl überprüft, ob sie durch 3 teilbar ist.
Dabei nutzen wir die Eigenschaft aus, dass eine Zahl durch 3 teilbar ist,
wenn ihre Quersumme durch 3 teilbar ist.

a) Schreiben Sie eine Methode, `quersumme`, die aus einem String die Quersumme berechnet.
Der Rückgabewert der Methoder soll `long` sein.
Wandeln Sie dazu den String zuerst mit der Methode `toCharArray()` in einen Array von `char` um.
Nutzen Sie die Eignaschaft aus, dass Sie den Zahlenwert eines chars `c` mit `c - 0` bestimmen können.

b) Schreiben Sie eine Methode `teilbarDurch3`, welche entscheidet, ob eine Zahl, gegeben als `String` durch 3 teilbar
ist.
Eine Zahl ist genau dann durch 3 teilbar, wenn ihre Quersumme durch 3 teilbar ist.
Verwenden Sie aus diesem Grund die Methode `quersumme` aus Teilaufgabe a) um die Methode `teilbarDurch3` zu
implementieren.

c) Schreiben Sie eine *main*-Methode und testen beide Methoden für verschiedene Werte.
Unter anderem sollen die Werte `4839201756483920175648391` und
`72840193651728409365172840936517284093651728409365` getestet werden.

## Aufgabe 7.5 - Hausaufgabe Luhn-Algorithmus (4 Punkte)

Schreiben Sie ein Java-Programm, das überprüft, ob eine eingegebene Zahl nach dem Luhn-Algorithmus gültig ist.
Der Luhn-Algorithmus wird verwendet, um Eingabefehler bei Nummern wie Kreditkartennummern zu erkennen.

Implementieren Sie eine Methode:

`public static boolean isValidLuhn(String number)`

Die Methode soll `true` zurückgeben, wenn die Zahl gültig ist, sonst `false`.

Gehen Sie von rechts nach links durch alle Ziffern der Zahl.

1. Beginnen Sie mit der letzten Ziffer.
2. Verdoppeln Sie jede zweite Ziffer von rechts.
3. Ist das Ergebnis größer als 9, ziehen Sie 9 ab.
4. Addieren Sie alle Ziffern.
5. Ist die Summe durch 10 teilbar, ist die Zahl gültig.

Beispiel:

Zahl: 79927398713

Berechnung:

3 bleibt 3

1 wird verdoppelt → 2

7 bleibt 7

8 wird verdoppelt → 16 → 7

9 bleibt 9

3 wird verdoppelt → 6

7 bleibt 7

2 wird verdoppelt → 4

9 bleibt 9

9 wird verdoppelt → 18 → 9

7 bleibt 7

Summe: 70

Da 70 % 10 == 0, ist die Zahl gültig.

Programmausgabe

Beispiel:

Bitte Zahl eingeben:

79927398713

Die Zahl ist gültig.

Oder:

Bitte Zahl eingeben:

79927398710

Die Zahl ist ungültig.