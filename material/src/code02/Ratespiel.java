// Beispiel für ein interaktives Programm
// Der Benutzer soll eine Zahl zwischen 0 und 127 erraten.
void main() {
  int geheimeZahl = (int) (Math.random() * 128);

  System.out.println("----------------------------------------------------");
  System.out.println("Erraten Sie eine zufällige Zahl zwischen 0 und 127!");
  System.out.println("----------------------------------------------------");
  Scanner scanner = new Scanner(System.in);
  boolean erraten = false;
  while (!erraten) {
    System.out.print("Nächste Zahl: ");
    int guess = scanner.nextInt();
    if (guess == geheimeZahl) {
      System.out.println("Glückwunsch, Zahl erraten!");
      erraten = true;
    } else if (guess < geheimeZahl) {
      System.out.println("Zahl ist zu klein.");
    } else if (guess > geheimeZahl) {
      System.out.println("Zahl ist zu groß.");
    }
  }
}