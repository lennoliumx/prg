void main() {

  Scanner scanner = new Scanner(System.in);
  scanner.useDelimiter("\n");

  // Für alle Stunden zusammen ein Array
  String[] appointments = new String[24];
  for (int hour = 0; hour < 24; hour++) {
    appointments[hour] = "";
  }

  // Hauptschleife
  boolean done = false;
  while (!done) {
    // Auswahlmenü
    System.out.println("1 = Neuer Eintrag");
    System.out.println("2 = Termine ausgeben");
    System.out.println("3 = Beenden");
    int choice = scanner.nextInt();

    // Fallunterscheidung
    switch (choice) {
      case 1 -> { // Neuer Eintrag
        System.out.print("Wieviel Uhr? ");
        int hourInput = scanner.nextInt();
        System.out.print("Termin? ");
        String appointment = scanner.next();
        appointments[hourInput] = appointment;
      }
      case 2 -> // Termine ausgeben
        // ???Elementzugriff???
              System.out.println("------------");
      case 3 -> // Beenden
              done = true;
      default -> // Falsche Eingabe
              System.out.println("Eingabefehler");
    }
  }
  scanner.close();

}