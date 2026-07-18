void main() {
  double preis = 1200.11734;
  double preis2 = 34.11734;
  int menge = -2;
  System.out.println("Preis: " + preis + "€");
  System.out.printf("%d Artikel zum Preis %8.2f €%n", menge, preis);
  System.out.printf("%d Artikel zum Preis %8.2f €", menge, preis2);
  System.out.println();
  System.out.printf("Menge %+d", menge);
}