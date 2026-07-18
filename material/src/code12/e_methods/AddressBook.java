package code12.e_methods;

import java.util.Scanner;

public class AddressBook {

  // --------------------------------------------------------
  // Print all addresses
  // --------------------------------------------------------
  public static void printAll(Address[] addresses) {
    System.out.println("----- Alle Adressen -----");

    for (int i = 0; i < addresses.length; i++) {
      if (addresses[i] != null) {
        addresses[i].printAddress();
        System.out.println(addresses[i]);
      }
    }
  }

  public static void umzug(Scanner sc, Address[] addresses) {
    System.out.print("Welcher Eintrag soll umgezogen werden? : ");
    // 1.
    int index = sc.nextInt();
    // 2.
    System.out.print("Straße: ");
    String street = sc.next();

    System.out.print("Stadt: ");
    String city = sc.next();

    System.out.print("PLZ: ");
    int postcode = sc.nextInt();
    // 3.
    addresses[index].setAddress(street, postcode, city);
  }


  // --------------------------------------------------------
  // Add a new address via Scanner
  // --------------------------------------------------------
  public static void addAddress(Scanner sc, Address[] addresses) {

    int index = 0;

    // find first free entry using while loop
    while (index < addresses.length && addresses[index] != null) {
      index++;
    }

    if (index == addresses.length) {
      System.out.println("Adressbuch ist voll!");
      return;
    }

    System.out.print("Name: ");
    String name = sc.next();

    System.out.print("Straße: ");
    String street = sc.next();

    System.out.print("Stadt: ");
    String city = sc.next();

    System.out.print("PLZ: ");
    int postcode = sc.nextInt();

    System.out.print("Favorit (true/false): ");
    boolean favorite = sc.nextBoolean();

    addresses[index] = new Address(name, street, city, postcode, favorite);

    System.out.println("Adresse unter Index " + index + " gespeichert.");
  }

  // --------------------------------------------------------
  // Print menu
  // --------------------------------------------------------
  public static void printMenu() {
    System.out.println("\n========= ADRESSBUCH =========");
    System.out.println("1 -> Neue Adresse eingeben");
    System.out.println("2 -> Alle Adressen anzeigen");
    System.out.println("3 -> Umzug");
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

    Address[] addresses = new Address[MAX];

    boolean done = false;

    while (!done) {
      printMenu();
      int choice = scanner.nextInt();

      switch (choice) {
        case 1 -> addAddress(scanner, addresses);
        case 2 -> printAll(addresses);
        case 3 -> umzug(scanner, addresses);
        case 9 -> done = true;
        default -> System.out.println("Eingabefehler");
      }
    }

    scanner.close();
    System.out.println("Programm beendet.");
  }
}
