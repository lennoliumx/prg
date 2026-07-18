package code12.h_cleanup;

import java.util.Scanner;

public class Main {

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

    AddressBook addressBook = new AddressBook();

    boolean done = false;
    while (!done) {
      printMenu();
      int choice = scanner.nextInt();

      switch (choice) {
        case 1 -> addressBook.addAddress(scanner);
        case 2 -> addressBook.printAll();
        case 9 -> done = true;
        default -> System.out.println("Eingabefehler");
      }
    }

    scanner.close();
    System.out.println("Programm beendet.");
  }
}
