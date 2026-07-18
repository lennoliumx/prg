void main() {
  String greeting = "Hello";
  String text = greeting + " " + "world!";
  System.out.println(text);
  System.out.println("Hallo " +
          "Welt!");
  boolean isEmpty = false;
  System.out.println("Wert von isEmpty: " + isEmpty);

  int favoriteNumber = 42;
  int andereZahl = 43;
  String output = favoriteNumber + " ist meine Lieblingszahl!";
  System.out.println(output);
  System.out.println(" " + favoriteNumber + andereZahl);

  String longText = "Dies ist ein ziemlich langer Text, den man nicht gut lesen kann, wenn man ihn in nur einer einzigen Zeile darstellt. Daher sollte man ihn auf mehrere Zeilen verteilen.";

  String longTextWrapped = "Dies ist ein ziemlich langer Text, den man " +
          "nicht gut lesen kann, wenn man ihn in nur einer einzigen Zeile " +
          "darstellt. Daher sollte man ihn auf mehrere Zeilen verteilen.";
  System.out.println(longText);
  System.out.println(longTextWrapped);
}
