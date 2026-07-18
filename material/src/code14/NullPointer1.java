package code14;

public class NullPointer1 {

  public static void main(String[] args) {
    String string = null;
    // NullPointerException:
//        System.out.println(string.substring(1));

    Address address = null;
    System.out.println(address); // Ausgabe null
    // NullPointerException:
//        System.out.println(address.name); // Zugriff auf null.name nicht möglich

    Address address2 = new Address();
    // NullpointerException, weil name als default-Wert null hat
    System.out.println(address2.name.substring(0, 1)); // erster Buchstabe
  }
}
