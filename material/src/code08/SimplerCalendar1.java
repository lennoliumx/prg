void main() {

  Scanner scanner = new Scanner(System.in);
  scanner.useDelimiter("\n");

  // Für alle Stunden zusammen ein Array
  String[] appointments = new String[24];

  appointments[0] = "";
  appointments[1] = "";
  appointments[2] = "";
  appointments[3] = "";
  appointments[4] = "";
  appointments[5] = "";
  appointments[6] = "";
  appointments[7] = "";
  appointments[8] = "";
  appointments[9] = "";
  appointments[10] = "";
  appointments[11] = "";
  appointments[12] = "";
  appointments[13] = "";
  appointments[14] = "";
  appointments[15] = "";
  appointments[16] = "";
  appointments[17] = "";
  appointments[18] = "";
  appointments[19] = "";
  appointments[20] = "";
  appointments[21] = "";
  appointments[22] = "";
  appointments[23] = "";

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
