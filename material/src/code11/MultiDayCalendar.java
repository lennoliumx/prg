void main() {
  Scanner scanner = new Scanner(System.in)
          .useDelimiter("\n");

  // Vorbereitung für die Ausgabe.
  // Wenn wir das nicht machen, steht überall der Wert null
  String appointments[][] = new String[31][24];
  for (int day = 0; day < appointments.length; day++) {
    for (int hour = 0; hour < appointments[day].length; hour++) {
      appointments[day][hour] = "";
    }
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
        System.out.print("Welcher Tag? (1-31) ");
        int inputDay = scanner.nextInt();
        System.out.print("Wieviel Uhr? (0-23) ");
        int inputHour = scanner.nextInt();
        System.out.print("Termin? ");
        appointments[inputDay - 1][inputHour] = scanner.next();
      }
      case 2 -> { // Termine ausgeben
        System.out.println("Welcher Tag? ");
        int outputDay = scanner.nextInt();
        for (int hour = 0; hour < appointments[outputDay - 1].length; hour++) {
          System.out.format("%2dh: %s%n",
                  hour, appointments[outputDay - 1][hour]);
        }
        System.out.println("------------");
      }
      case 3 -> // Beenden
              done = true;
      default -> // Falsche Eingabe
              System.out.println("Eingabefehler");
    }
  }
}
