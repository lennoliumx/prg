package code12.b_primitive;

import java.util.Scanner;

public class AddressBookPrimitive {

  // --------------------------------------------------------
  // Add a new address
  // --------------------------------------------------------
  public static void addAddress(Scanner sc,
                                String[] name,
                                String[] street,
                                String[] city,
                                int[] postcode) {

    int index = 0;
    while (index < name.length && name[index] != null) {
      index++;
    }
    if (index == name.length) {
      System.out.println("Adressbuch ist voll!");
      return;
    }
    System.out.print("Name: ");
    name[index] = sc.next();
    System.out.print("Straße: ");
    street[index] = sc.next();
    System.out.print("Stadt: ");
    city[index] = sc.next();
    System.out.print("PLZ: ");
    postcode[index] = sc.nextInt();
    System.out.println("Adresse wurde unter Index " + index + " gespeichert.");
  }

  // --------------------------------------------------------
  // Print single address
  // --------------------------------------------------------
  public static void printAddress(String name,
                                  String street,
                                  String city,
                                  int postcode) {
    System.out.printf("%s wohnt in %s, %d %s %s\n", name, street, postcode, city);
  }

  // --------------------------------------------------------
  // Print all addresses
  // --------------------------------------------------------
  public static void printAll(String[] name,
                              String[] street,
                              String[] city,
                              int[] postcode) {

    System.out.println("----- Alle Adressen -----");
    for (int i = 0; i < name.length; i++) {
      if (name[i] == null) {
        System.out.println("Kein Eintrag an Position " + i);
      } else {
        printAddress(name[i], street[i], city[i], postcode[i]);
      }
    }
  }

  // --------------------------------------------------------
  // Print menu
  // --------------------------------------------------------
  public static void printMenu() {
    System.out.println("\n========= ADRESSBUCH =========");
    System.out.println("1 -> Neue Adresse eingeben");
    System.out.println("2 -> Alle Adressen anzeigen");
    System.out.println("9 -> Programm beenden");
    System.out.print("Auswahl: ");
  }

  // --------------------------------------------------------
  // MAIN METHOD
  // --------------------------------------------------------
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.useDelimiter("\n");

    final int MAX = 20;

    // Declare all data arrays HERE (not static)
    String[] name = new String[MAX];
    String[] street = new String[MAX];
    String[] city = new String[MAX];
    int[] postcode = new int[MAX];

    boolean done = false;

    while (!done) {
      printMenu();
      int choice = scanner.nextInt();

      switch (choice) {
        case 1 -> addAddress(scanner, name, street, city, postcode);
        case 2 -> printAll(name, street, city, postcode);
        case 9 -> done = true;
        default -> System.out.println("Eingabefehler");
      }
    }

    scanner.close();
    System.out.println("Programm beendet.");
  }
}
