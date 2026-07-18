package code14;

public class NullPointer6ZusatzBeispiel {

  public static void main(String[] args) {
    Address addresse1 = null;
    gibNameAusVon(addresse1);

    Address addresse2 = new Address();
    gibNameAusVon(addresse2);

    Address addresse3 = new Address();
    addresse3.name = "";
    gibNameAusVon(addresse3);

    Address addresse4 = new Address();
    addresse4.name = "Johannes Schneider";
    gibNameAusVon(addresse4);

    System.out.println();
    gibErstenBuchstabenDesNamensAusVon(addresse1);
    gibErstenBuchstabenDesNamensAusVon(addresse2);
    gibErstenBuchstabenDesNamensAusVon(addresse3);
    gibErstenBuchstabenDesNamensAusVon(addresse4);
  }

  private static void gibNameAusVon(Address address) {
    // Hier keine NullPointerException, weil Aussage B nur ausgewertet wird,
    // wenn Aussage A true ist, also address != null ist!
    //
    // Aussage A       UND      Aussage B
    if (address != null && address.name != null) {
      System.out.print("Name: ");
      System.out.println(address.name);
    } else {
      System.out.println("Name ist nicht definiert.");
    }
  }

  private static void gibErstenBuchstabenDesNamensAusVon(Address address) {
    // Aussage A       UND      Aussage B       UND      Aussage C
    if (address != null && address.name != null && address.name.length() >= 1) {
      System.out.println("Erster Buchstabe des Namens: " + address.name.charAt(0));
    } else {
      System.out.println("Erster Buchstabe des Namens kann nicht ausgegeben werden.");
    }
  }
}
