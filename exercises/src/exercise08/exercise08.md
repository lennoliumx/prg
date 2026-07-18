# EPR-WIN (Prof. Schneider/Prof. Eiglsperger), Blatt 08

## Hinweis

Beachten Sie
die [Java-Naming-Konventionen](https://bwsyncandshare.kit.edu/s/xqek5T4cR533PEo)!
Bitte erstellen Sie für jedes Aufgabenblatt ein package (`exercise08`, etc.) und
darin für jede Aufgabe eine Klasse und geben dieser ihr einen geeigneten Namen.

## Aufgabe 8.1 - Präsenzaufgabe

Benutzen Sie für diese Aufgabe die Datei  
[OpenGeoDB-plz-ort-de-semi.csv](OpenGeoDB-plz-ort-de-semi.csv)  
(Encoding: UTF-8, die Liste ist sortiert).

<!-- ACHTUNG: GitLab macht daraus einen Link zu einer Tabellenansicht, die nicht oder nur sehr lange lädt. Raw-Ansicht verlinken oder Dateien auf Moodle hochladen! Gleiches gilt für faust.txt weiter unten. -->

Benutzen Sie zum Lösen der Aufgabe ausschließlich die Datenstrukturen und Methoden, die Sie in der Vorlesung behandelt
haben, und nutzen Sie `Scanner`, um die Liste Zeile für Zeile einzulesen.

Tipp: Für eine Instanz von `String` liefert der Methodenaufruf `split(";")` die durch `;` getrennten Substrings als
Array vom Typ `String` zurück.

In dem Beispiel:

```java
String line = "Hallo;Welt";
String[] words = line.split(";");
```

wäre `words` ein Array der Länge zwei mit den Einträgen `"Hallo"` und `"Welt"`.

Schreiben Sie ein Programm, das den/die Benutzer:in nach einer Postleitzahl fragt, diese in der gegebenen
Postleitzahlen-Liste sucht und alle zugehörigen Orte ausgibt.

Starten Sie damit, dass Sie den Inhalt von `ReadingFiles1.java` aus der Vorlesung in ein neues Java-File kopieren.

Beispiel für den Aufbau der Datei:

```text
01067;Dresden
01069;Dresden
01097;Dresden
...
01139;Dresden
01156;Altfranken
usw.
```

---

## Aufgabe 8.2 - Präsenzaufgabe

Gegeben ist ein Array von Strings.

### a) In-place Transformation

Schreiben Sie eine Methode `upperAll`, die alle Strings eines übergebenen String-Arrays in Großbuchstaben umwandelt.

- Verwenden Sie die Methode `toUpperCase()` der Klasse `String`.
- Die Umwandlung soll **direkt im übergebenen Array erfolgen** (d. h. die ursprünglichen Einträge werden überschrieben).
- Die Methode hat **keinen Rückgabewert**.

**Signatur:**

```java
void upperAll(String[] arr)
```

### b) Neue Kopie erzeugen

Schreiben Sie eine zweite Methode `upperAllCopy`, die ebenfalls alle Strings in Großbuchstaben umwandelt.

- Im Unterschied zu Teil a) darf das ursprüngliche Array **nicht verändert werden**.
- Stattdessen soll ein **neues Array** mit den umgewandelten Strings zurückgegeben werden.

**Signatur:**

```java
String[] upperAllCopy(String[] arr)
```

### c) Testen Sie Ihre Methoden

Testen Sie beide Methoden mit folgendem Array:

```java
String[] test = {"Hallo", "Welt", "Java"};
```

- Geben Sie die Ergebnisse beider Methoden auf der Konsole aus.
- Überprüfen Sie insbesondere, ob das ursprüngliche Array nach Aufruf von `upperAllCopy` unverändert bleibt.

---

## Aufgabe 8.3 - Strings aus Arrays zusammensetzen - Hausaufgabe (4 Punkte)

Gegeben ist ein Array von Strings.

### a) Methode `dashAll`

Schreiben Sie eine Methode `dashAll`, die aus einem String-Array einen einzelnen String erzeugt.

- Zwischen jedem Wort sowie **am Anfang und am Ende** des Ergebnisses soll jeweils ein Bindestrich (`-`) stehen.
- Verwenden Sie geeignete String-Operationen zur Verkettung.

**Beispiel:**

```java
{"Hallo", "Welt"} → "-Hallo-Welt-"
```

### b) Spezialfall: leeres Array

Schreiben Sie eine verbesserte Methode `dashAllImproved`.

- Für nicht-leere Arrays soll sie sich wie `dashAll` verhalten.
- Falls das Array leer ist (`arr.length == 0`), soll sie stattdessen den **leeren String (`""`)** zurückgeben.

### c) Methode `dashIn`

Schreiben Sie eine Methode `dashIn`, die ebenfalls aus einem String-Array einen String erzeugt.

- Im Unterschied zu a) sollen Bindestriche **nur zwischen den Wörtern** stehen, also nicht am Anfang und nicht am Ende.

**Beispiel:**

```java
{"Hallo", "Welt"} → "Hallo-Welt"
```

### d) Testen Sie Ihre Methoden

Testen Sie alle Methoden mit folgendem Array:

```java
String[] test = {"Hallo", "Welt", "Java"};
```

Zusätzlich:

- Testen Sie das Verhalten bei einem **leeren Array**:

```java
String[] empty = {};
```

- Geben Sie die Ergebnisse auf der Konsole aus.
- Vergleichen Sie insbesondere die Unterschiede zwischen den Methoden.

---

## Aufgabe 8.4 - Hausaufgabe - Anzahl der Orte pro Postleitzahl (4 Punkte)

Mehreren Orten kann die gleiche Postleitzahl zugeordnet sein, und es gibt auch Postleitzahlen, denen kein Ort zugeordnet
ist. Wir wollen untersuchen, wie häufig dies vorkommt.

### a) Anzahl der Orte pro Postleitzahl bestimmen

Schreiben Sie ein Programm, das für jede Postleitzahl bestimmt, wie viele Orte ihr zugeordnet sind.

- Lesen Sie die Datei `OpenGeoDB-plz-ort-de-semi.csv` zeilenweise mit einem `Scanner` ein.
- Zerlegen Sie jede Zeile mit `split(";")` in Postleitzahl und Ortsname.
- Verwenden Sie ein Array, um die Anzahl der Orte zu zählen.
    - Verwenden Sie ein Array der Länge `100000`, sodass alle möglichen fünfstelligen Postleitzahlen von `00000` bis
      `99999` als Index verwendet werden können.
    - Die Postleitzahl soll dabei als Index dienen.
- Erhöhen Sie für jede gelesene Zeile den entsprechenden Zähler im Array.

### b) Auswertung

Geben Sie anschließend aus:

- alle Postleitzahlen, denen **mehrere Orte** zugeordnet sind (Zähler > 1)
- wie viele Postleitzahlen **keinem Ort** zugeordnet sind (Zähler = 0)

Optional können Sie einige Beispiele für Postleitzahlen ohne zugeordneten Ort ausgeben.

### c) Testen

- Testen Sie Ihr Programm mit der gegebenen CSV-Datei.
- Überprüfen Sie stichprobenartig einige Postleitzahlen.

### Hinweise

- Postleitzahlen sind fünfstellig und können als `int` interpretiert werden.
- Beachten Sie: Postleitzahlen können mit `0` beginnen, z. B. `01067`. Beim Umwandeln in `int` geht diese führende Null
  verloren.
- Achten Sie bei der Ausgabe darauf, Postleitzahlen ggf. wieder fünfstellig mit führenden Nullen auszugeben.
- Nicht jede mögliche Postleitzahl kommt tatsächlich in der Datei vor.
- Nutzen Sie nur die Datenstrukturen und Methoden aus der Vorlesung, insbesondere Arrays und `Scanner`.

---

## Aufgabe 8.5 - Hausaufgabe - Arbeiten mit Textdateien (4 Punkte)

### a) Buchstaben zählen

Schreiben Sie ein Programm, das den/die Benutzer:in nach folgenden Eingaben fragt:

- Pfad zu einer Textdatei
- einen Buchstaben

Das Programm soll anschließend:

- die Datei zeilenweise mit einem `Scanner` einlesen
- zählen, wie oft der angegebene Buchstabe in der Datei vorkommt
- **Groß- und Kleinschreibung nicht unterscheiden**

Am Ende soll die Gesamtanzahl ausgegeben werden.

Sie können hierfür die Datei `faust.txt` (Encoding: UTF-8) verwenden.

### b) Vorkommen eines Wortes zählen

Schreiben Sie ein zweites Programm, das den/die Benutzer:in nach folgenden Eingaben fragt:

- Pfad zu einer Textdatei
- ein Wort

Das Programm soll:

- die Datei zeilenweise einlesen
- jede Zeile in Wörter zerlegen, z. B. mit `split(" ")`
- zählen, wie oft das eingegebene Wort in der Datei vorkommt
- **Groß- und Kleinschreibung nicht unterscheiden**

**Hinweise:**

- Gleiche Wörter werden mehrfach gezählt.
- Eine einfache Trennung über Leerzeichen ist ausreichend.
- Satzzeichen müssen nicht gesondert behandelt werden. Das bedeutet zum Beispiel, dass `"Faust"` und `"Faust,"` als
  unterschiedliche Wörter gelten dürfen.

Am Ende soll die Gesamtanzahl ausgegeben werden.

Auch hier können Sie die Datei `faust.txt` (Encoding: UTF-8) verwenden.

---

### Allgemeine Hinweise

- Verwenden Sie ausschließlich die in der Vorlesung behandelten Mittel, z. B. `Scanner`, Arrays und `String`-Methoden.
- Achten Sie auf mögliche Sonderfälle, z. B. leere Zeilen oder leere Arrays.