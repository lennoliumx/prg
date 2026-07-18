void main() {
  Scanner scanner = new Scanner(System.in);
  scanner.useDelimiter("\n");

  // Hauptschleife
  String[] appointments = createAppointments();
  boolean done = false;
  while (!done) {
    printMenu();
    int choice = scanner.nextInt();
    switch (choice) {
      case 1 -> neuerEintrag(scanner, appointments);
      case 2 -> print(appointments);
      case 3 -> speichern(scanner, appointments);
      case 4 -> laden(scanner, appointments);
      case 9 -> done = true;
      default -> System.out.println("Eingabefehler");
    }
  }
  scanner.close();
}

String[] createAppointments() {
  String appointments[] = new String[24];
  for (int hour = 0; hour < appointments.length; hour++) {
    appointments[hour] = "";
  }
  return appointments;
}

void printMenu() {
  System.out.println("1 = Neuer Eintrag");
  System.out.println("2 = Termine ausgeben");
  System.out.println("3 = Speichern");
  System.out.println("4 = Laden");
  System.out.println("9 = Beenden");
}

void neuerEintrag(Scanner scanner, String[] appointments) {
  System.out.print("Wieviel Uhr? ");
  int hourInput = scanner.nextInt();
  if (hourInput < 0 || hourInput >= appointments.length) {
    System.out.println("Ungültige Eingabe");
  } else {
    System.out.print("Termin? ");
    String appointment = scanner.next();
    appointments[hourInput] = appointment;
  }
}

void speichern(Scanner scanner, String[] appointments) {
  // Wo soll abgespeiche werden
  System.out.print("Daeiname? ");
  String dateiname = scanner.next();
  // Ausgabe erstellen
  String output = "";
  for (String appointment : appointments) {
    output += appointment + "\n";
  }
  // In Datei schreiben
  Path path = Paths.get(dateiname);
  try {
    Files.writeString(path, output);
  } catch (IOException ioException) {
    System.out.println("Fehler beim Schreiben der Datei!");
  }
}

void laden(Scanner scanner, String[] appointments) {
  // Wo soll abgespeiche werden
  System.out.print("Daeiname? ");
  String dateiname = scanner.next();
  // Ausgabe erstellen
  try {
    Path file = Paths.get(dateiname);
    Scanner fileScanner = new Scanner(file, "UTF-8");
    for (int i = 0; i < appointments.length; i++) {
      appointments[i] = fileScanner.nextLine();
    }
  } catch (IOException ioException) {
    System.out.println("Fehler beim Schreiben der Datei!");
  }
}


void print(String[] appointments) {
  for (int hour = 0; hour < appointments.length; hour++) {
    System.out.printf("%2dh: %s%n", hour, appointments[hour]);
  }
  System.out.println("------------");
}