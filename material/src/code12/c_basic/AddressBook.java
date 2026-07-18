package code12.c_basic;

import java.util.Scanner;

public class AddressBook {

  // --------------------------------------------------------
  // Print a single address
  // --------------------------------------------------------
  public static void printAddress(Address a) {
    System.out.printf("%s wohnt in %s, %d %s", a.name, a.street, a.postcode, a.city);
  }

  // --------------------------------------------------------
  // Print all addresses
  // --------------------------------------------------------
  public static void printAll(Address[] addresses) {
    System.out.println("----- Alle Adressen -----");
    for (int i = 0; i < addresses.length; i++) {
      if (addresses[i] != null) {
        printAddress(addresses[i]);
      }
    }
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

    Address a = new Address();
    System.out.print("Name: ");
    a.name = sc.next();
    System.out.print("Straße: ");
    a.street = sc.next();
    System.out.print("Stadt: ");
    a.city = sc.next();
    System.out.print("PLZ: ");
    a.postcode = sc.nextInt();

    addresses[index] = a;

    System.out.println("Adresse unter Index " + index + " gespeichert.");
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

    final int MAX_ADDRESSES = 20;
    Address[] addresses = new Address[MAX_ADDRESSES];
    for (int i = 0; i < addresses.length; i++) {
      addresses[i] = new Address();
    }

    boolean done = false;
    while (!done) {
      printMenu();
      int choice = scanner.nextInt();

      switch (choice) {
        case 1 -> addAddress(scanner, addresses);
        case 2 -> printAll(addresses);
        case 9 -> done = true;
        default -> System.out.println("Eingabefehler");
      }
    }

    scanner.close();
    System.out.println("Programm beendet.");
  }
}
