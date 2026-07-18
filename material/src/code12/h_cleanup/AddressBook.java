package code12.h_cleanup;

import java.util.Scanner;

public class AddressBook {

  final int MAX = 20;
  private Address[] addresses = new Address[MAX];


  // --------------------------------------------------------
  // Print all addresses
  // --------------------------------------------------------
  public void printAll() {
    System.out.println("----- Alle Adressen -----");

    for (int i = 0; i < addresses.length; i++) {
      if (addresses[i] != null) {
        System.out.println(addresses[i]);
      }
    }
  }

  // --------------------------------------------------------
  // Add a new address via Scanner
  // --------------------------------------------------------
  public void addAddress(Scanner sc) {

    int index = 0;

    // find first free entry using while loop
    while (index < this.addresses.length && this.addresses[index] != null) {
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
}
