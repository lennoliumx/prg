void main() {
  // Eingabe
  // Magische Zeile
  Scanner scanner = new Scanner(System.in);
  System.out.print("Gib bitte deinen Name ein: ");
  // weise die nächste Tastatureingabe dem String name zu
  String name = scanner.next();
  System.out.print("Gib bitte dein Alter ein: ");
  int alter = scanner.nextInt();
  System.out.print("Für welchen Wochentag? ");
  int wochentag = scanner.nextInt();
  //Keine Verarbeitung
  double preis = 6.5;
  if (alter >= 18) {
    System.out.println("Ich bin ein erwachsener");
    preis = 7.5;
  }
  // Ausgabe
  System.out.printf("Hallo %s, der Eintrittspreis beträgt%5.2f!", name, preis);
}