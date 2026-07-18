# EPR-WIN (Prof. Schneider/Prof. Eiglsperger), Blatt 13

## Hinweis

Beachten Sie
die [Java-Naming-Konventionen](https://bwsyncandshare.kit.edu/s/xqek5T4cR533PEo)!
Bitte erstellen Sie für jedes Aufgabenblatt ein package (`exercise13`, etc.) und
darin für jede Aufgabe eine Klasse und geben dieser ihr einen geeigneten Namen.

## Präsenzaufgabe 13.1

Gegeben ist folgende mathematische Funktion:

magic(0) = 1\
magic(n) = 2 * magic(n-1) + 1 für alle n > 0

Legen Sie eine Klasse `Funktion` an und implementieren Sie dort die Funktion
*magic* als statische Funktion `magic` und zwar genau so, wie sie hier
definiert ist (mit Rekursion). Sie können davon ausgehen, dass die Funktion nur
mit Werten >= 0 aufgerufen wird.

Berechnen Sie in einer `main`-Methode die Werte magic(1), magic(2), ..., magic
(10) und geben Sie diese auf der Konsole aus (Tipp: Am besten eine
for-Schleife verwenden!).

Erkennen Sie das System hinter der Zahlenfolge? Welchen Wert hat magic(n)?

Freiwillig: Können Sie eine iterative Methode `magicIterative` angeben, die dasselbe
berechnet?

## Präsenzaufgabe 13.2

Schreiben Sie ein Programm, das als Eingabe eine Zeichenkette einliest und
ausgibt, ob die Zeichenkette ein Palindrom ist. Ein Palindrom ist eine
Zeichenfolge, die vorwärts und rückwärts gelesen gleich ist. Groß- und
Kleinschreibung sollen dabei nicht unterschieden werden. **Verwenden Sie in
Ihrer Lösung Rekursion** und Methoden der Klasse `String` wie `charAt(n)`,
`substring(begin, end)`, `toLowerCase()` und/oder `toUpperCase()`. Sie
benötigen keine Schleifen, verwenden Sie also auch bitte keine.

Testen Sie Ihr Programm u.a. mit `"", "A", "aa", "aaa", "aabba",
"Radar", "Ebbe", "Emma", "Reliefpfeiler"` und `"Lagertonnennotregal"`

Falls Sie nicht weiterkommen, beachten Sie folgende Hinweise:

- Fügen Sie die Nicht-Beachtung der Groß- und Kleinschreibung erst zum Schluss
  ein und testen zuerst mit Wörtern in Großbuchstaben.
- Das erste Zeichen in einem String s hat den Index 0, das letzte Zeichen in
  einem String hat den Index `s.length() - 1`.
- Bei der Methode `substring(begin, end)` ist `end` die Position, die nicht
  mehr zurückgegeben wird (also wird alles von Position `begin` bis zur
  Position `end - 1` zurückgegeben).
- Je nachdem, wie Sie die Implementierung wählen, hilft es, wenn Sie sich das
  Wort und die Indizes aufschreiben, um den Aufruf besser nachvollziehen zu
  können, z.B.
  ```
  0  01234  0123  0123
  A  RADAR  EBBE  EMMA
  ```
- Welche Abbruchbedingungen gibt es? Ist der leere String ein Palindrom? Ein
  String der Länge 1?
- Wie können Sie das Problem, für einen String der Länge 6 zu entscheiden,
  ob es ein Palindrom ist, auf das Problem eines kürzeren Strings (z.B. der
  Länge 4) plus Buchstabenvergleiche zurückführen? Genauer: Betrachten Sie
  den String s = xty mit Buchstaben x, y und einem String t. Wann ist s ein
  Palindrom? Was muss für x und y gelten? Was gilt, wenn t ein Palindrom ist
  bzw. wenn t kein Palindrom ist?

Dieser Teil hier ist freiwillig: Erweitern Sie Ihr Palindromerkennungsprogramm,
so dass auch
Palindrome erkannt werden, wenn in der Zeichenfolge Leerzeichen und Satzzeichen
ignoriert werden. Sie dürfen dabei nicht die Leerzeichen aus der eingelesenen
Zeichenkette entfernen, sondern müssen die Leerzeichen in Ihrer rekursiv
aufgerufenen Methode ignorieren. Auch hier gibt es eine Lösung ohne
Schleifen. Finden Sie diese? Testen Sie Ihr Programm u.a.
mit `"Alle Bananen, Anabella!"`, `"Nie so sein!
"` und `"Trug Tim eine so helle Hose nie mit Gurt?"`. Es gibt [viele weitere
Beispiele für solche Sätze](https://www.wort-suchen.de/wortlisten/palindrom-saetze).