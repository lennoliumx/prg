// Beispiel für eine Pfandberechnung die das Eingabe-Verarbeitung-Ausgabe Prinzip verdeutlicht.
// Der Benutzer gibt einen Pfandstring ein und das Programm berechnet den Pfand-Betrag.

void main() {
  // Eingabe
  Scanner scanner = new Scanner(System.in);
  System.out.print("Pfand-String? ");
  String eingabe = scanner.nextLine();

  // Verarbeitung
  double betrag = 0.0;
  for (int index = 0; index < eingabe.length(); index++) {
    char c = eingabe.charAt(index);
    if (c == 'M') {
      betrag += 0.08;
    } else if (c == 'E') {
      betrag += 0.25;
    } else if (c == 'D') {
      betrag += 0.25;
    } else if (c == 'K') {
      betrag += 3;
    } else {
      System.out.println("Unbekanntes Zeichen: " + c);
    }
  }

  // Ausgabe
  System.out.println("Pfand-Betrag: " + betrag);
}
