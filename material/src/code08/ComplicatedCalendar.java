void main() {
  java.util.Scanner scanner = new java.util.Scanner(System.in)
          .useDelimiter("\n"); // damit Eingabe-Strings nicht nach Leerzeichen abgeschnitten werden

  // Fuer jede Stunde eine neue Variable
  String appointment00 = "";
  String appointment01 = "";
  String appointment02 = "";
  String appointment03 = "";
  String appointment04 = "";
  String appointment05 = "";
  String appointment06 = "";
  String appointment07 = "";
  String appointment08 = "";
  String appointment09 = "";
  String appointment10 = "";
  String appointment11 = "";
  String appointment12 = "";
  String appointment13 = "";
  String appointment14 = "";
  String appointment15 = "";
  String appointment16 = "";
  String appointment17 = "";
  String appointment18 = "";
  String appointment19 = "";
  String appointment20 = "";
  String appointment21 = "";
  String appointment22 = "";
  String appointment23 = "";

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
        switch (hourInput) {
          case 0 -> appointment00 = appointment;
          case 1 -> appointment01 = appointment;
          case 2 -> appointment02 = appointment;
          case 3 -> appointment03 = appointment;
          case 4 -> appointment04 = appointment;
          case 5 -> appointment05 = appointment;
          case 6 -> appointment06 = appointment;
          case 7 -> appointment07 = appointment;
          case 8 -> appointment08 = appointment;
          case 9 -> appointment09 = appointment;
          case 10 -> appointment10 = appointment;
          case 11 -> appointment11 = appointment;
          case 12 -> appointment12 = appointment;
          case 13 -> appointment13 = appointment;
          case 14 -> appointment14 = appointment;
          case 15 -> appointment15 = appointment;
          case 16 -> appointment16 = appointment;
          case 17 -> appointment17 = appointment;
          case 18 -> appointment18 = appointment;
          case 19 -> appointment19 = appointment;
          case 20 -> appointment20 = appointment;
          case 21 -> appointment21 = appointment;
          case 22 -> appointment22 = appointment;
          case 23 -> appointment23 = appointment;
        }
      }
      case 2 -> { // Termine ausgeben
        System.out.println(" 0h: " + appointment00);
        System.out.println(" 1h: " + appointment01);
        System.out.println(" 2h: " + appointment02);
        System.out.println(" 3h: " + appointment03);
        System.out.println(" 4h: " + appointment04);
        System.out.println(" 5h: " + appointment05);
        System.out.println(" 6h: " + appointment06);
        System.out.println(" 7h: " + appointment07);
        System.out.println(" 8h: " + appointment08);
        System.out.println(" 9h: " + appointment09);
        System.out.println("10h: " + appointment10);
        System.out.println("11h: " + appointment11);
        System.out.println("12h: " + appointment12);
        System.out.println("13h: " + appointment13);
        System.out.println("14h: " + appointment14);
        System.out.println("15h: " + appointment15);
        System.out.println("16h: " + appointment16);
        System.out.println("17h: " + appointment17);
        System.out.println("18h: " + appointment18);
        System.out.println("19h: " + appointment19);
        System.out.println("20h: " + appointment20);
        System.out.println("21h: " + appointment21);
        System.out.println("22h: " + appointment22);
        System.out.println("23h: " + appointment23);
        System.out.println("------------");
      }
      case 3 -> // Beenden
              done = true;
      default -> // Falsche Eingabe
              System.out.println("Eingabefehler");
    }
  }
  scanner.close();
}