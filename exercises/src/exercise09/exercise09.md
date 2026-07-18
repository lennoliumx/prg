# EPR-WIN (Prof. Schneider/Prof. Eiglsperger), Blatt 9

## Hinweis

Beachten Sie
die [Java-Naming-Konventionen](https://bwsyncandshare.kit.edu/s/xqek5T4cR533PEo)! Bitte erstellen Sie für jedes
Aufgabenblatt ein package (`exercise09`, etc.) und darin für jede Aufgabe eine Klasse und geben dieser ihr einen
geeigneten Namen.

## Aufgabe 9.1 - Präsenzaufgabe

Sie haben den Auftrag eine Lagerhaltung zu implementieren.
Das Lager besteht aus Fächern, in denen Artikel gelagert werden.
Ein Artikel hat folgende Eigenschaften: eine Id (dies ist eine ganze Zahl zwischen 1 und 10000),
ein Artikel-Name (z.B "Hammer") und die Menge im Lager (z.B. 5).

a) Erstellen Sie eine Klasse `Artikel` mit privaten Attributen für die oben beschriebenen Eigenschaften eines Artikels.

b) Erstellen Sie einen Konstruktor, welcher die initialen Werte für einen Artikel übergeben bekommt.

c) Ergänzen Sie die Klasse mit get/set-Methoden, um auf die Werte der Attribute zuzugreifen.
Die Id soll dabei nicht verändert werden können, d.h. es soll keine set Methode für die Id erstellt werden.

d) Erstellen Sie eine Klasse `ArtikelMain`. Legen Sie in der `main` Methode
folgende drei Instanzen der Klasse `Artikel` an, indem Sie passende Konstruktoren aufrufen:

1. 1001, "Hammer", 5,
2. 2001, "Leisten", 6
3. 2002, "Torx 3-Schrauben", 100

e) Schreiben Sie in der Klasse `Artikel` eine Methode `public void print() { ... }`,
welche eine Artikel-Instanz auf der Konsole ausgibt. Die Ausgabe soll ungefähr so aussehen:

```
Artikel{id=1001,name=Hammer,menge=6}
```

Erweitern Sie die `main` Methode in der Klasse `ArtikelMain` um die Ausgabe der drei Artikel-Instanzen.

## Aufgabe 9.2 - Hausaufgabe

Erweitern Sie die Klasse Artikel aus Aufgabe 7.1.

a) Überprüfen Sie beim Setzen der Werte für Menge und Id, dass korrekte Werte übergeben werden.
Setzen Sie die Werte nur dann, wenn sie korrekt sind. Anderenfalls sollen die Werte nicht gesetzt werden.

b) Erstellen Sie einen Konstruktor, der nur die Id und den Namen übergeben bekommt.
Die Menge soll in diesem Fall auf 1 gesetzt werden.

## Aufgabe 9.3 - Hausaufgabe

a) Erstellen Sie eine Klasse `Lager`. Die Klasse soll ein Lager repräsentieren, welches 100 Fächer hat.
Die Klasse Lager soll ein privates Attribut `artikel` besitzen, welches ein Array von `Artikel` aus Aufgabe 7.1 ist.
Dieses Array soll im Konstruktor initialisiert werden.

b) Erstellen Sie die Methode `public boolean addArtikel(int position, Artikel artikel) { ... }` in der Klasse `Lager`
um einen Artikel dem Lager in Fach `i` hinzuzufügen.
Falls das Fach `i` belegt ist, soll der Artikel nicht hinzugefügt werden, und `false`zurück gegeben werden,
andernfalls soll der Artikel hinzugefügt werden und `true` zurückgegeben werden.

c) Erstellen Sie eine Methode `public boolean checkArtikel(int id, int anzahl)`, die überprüft,
ob der Artikel mit der Id `id` im Lager mindestens `anzahl` vorhanden ist.

d) Testen Sie die Methoden aus a), b) und c) indem Sie in der Klasse `ArtikelMain`

* eine Instanz von Lager erstellen,
* die drei in Aufgabe 9.1 beschriebenen Artikel dort einlagern, und
* überprüfen, ob jeweils 6 Einheiten eingelagert sind.

## Aufgabe 9.4 - Hausaufgabe

Hinweis: Erstellen Sie alle Klassen aus dieser Aufgabe in einem
Unter-Package `exercise09.produkt`.

Betrachten Sie folgende Klasse:

```
public class Produkt {

    private int nummer;
    private double preis;

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }
}
```

Erstellen Sie eine Klasse `Produkt` und kopieren den oben gegebenen Code
von `Produkt`. Legen Sie eine weitere Klasse `ProduktMain` mit einer
`main()`-Methode an.

Erzeugen Sie 5 Produkt-Instanzen mit unterschiedlichen Nummern und Preisen.
Sie dürfen dafür nur den default-Konstruktor und die setter-Methoden verwenden.
Nehmen Sie als Variablen-Namen eine sinnvolle Produktbeschreibung, z.B.
`Produkt kaugummis = ...` und setzen einen sinnvollen Preis (in Euro).

b) Erstellen Sie eine weitere Klasse `Auftrag`. `Auftrag` hat 2 private
Attribute:

```
private Produkt produkt;
private int menge;
```

Darin wird jeweils das bestellte Produkt sowie die bestellte Menge gespeichert.
Implementieren Sie für Auftrag einen geeigneten Konstruktor sowie
getProdukt-, getMenge-, setProdukt- und setMenge-Methoden nach demselben Muster
wie in `Produkt`. Legen Sie in Ihrer `main`-Methode für jeden der fünf Produkte
aus a) einen Auftrag mit einer Stückzahl größer 0 an.

c) Implementieren Sie in Ihrer Klasse `Main` eine statische Methode:

```
public static double getGesamtwert(Auftrag[] auftraege) { ... }
```

Diese soll die Summe aller einzelnen Auftragswerte (Menge *
Produktpreis) liefern. Testen Sie die Methode in Main, indem Sie alle Ihre
Aufträge einem Array vom Typ `Auftrag[]` hinzufügen und die Methode mit diesem
Array aufrufen.

