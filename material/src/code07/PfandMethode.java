// Beispiel für eine Pfandberechnung die das Eingabe-Verarbeitung-Ausgabe Prinzip verdeutlicht.
// Der Benutzer gibt einen Pfandstring ein und das Programm berechnet den Pfand-Betrag.

void main() {
  // Eingabe
  Scanner scanner = new Scanner(System.in);
  System.out.print("Pfand-String? ");
  String eingabe = scanner.nextLine();
  // Verarbeitung
  double betrag = berechneGesamtPfand(eingabe);
  // Ausgabe
  System.out.println("Pfand-Betrag: " + betrag);
}

double berechneGesamtPfand(String eingabe) {
  double betrag = 0.0;
  for (int index = 0; index < eingabe.length(); index++) {
    char c = eingabe.charAt(index);
    double pfand = berechnePfand(c);
    betrag += betrag + pfand;
  }
  return betrag;
}

double berechnePfand(char c) {
  if (c == 'M') {
    return 0.08;
  } else if (c == 'E') {
    return 0.25;
  } else if (c == 'D') {
    return 0.25;
  } else if (c == 'K') {
    return 3;
  } else {
    return 0;
  }
}