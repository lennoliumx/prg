package code14;

public class NullPointer5ZusatzBeispiel {

  public static void main(String[] args) {
    Address addresse1 = null;
    gibInfosAusUeber(addresse1);

    Address addresse2 = new Address();
    gibInfosAusUeber(addresse2);

    Address addresse3 = new Address();
    addresse3.name = "";
    gibInfosAusUeber(addresse3);

    Address addresse4 = new Address();
    addresse4.name = "Johannes Schneider";
    gibInfosAusUeber(addresse4);
//        System.out.println(address.name.charAt(0));
  }

  private static void gibInfosAusUeber(Address address) {
    if (address == null) {
      System.out.println("address ist null");
    } else { /* dann address != null */
      if (address.name == null) {
        System.out.println("address ist initialisiert, aber der Name ist null");
      } else {
        System.out.println(address.name);
        if (address.name.length() > 0) {
          System.out.print("Erster Buchstabe des Namens: ");
          //System.out.println(address.name.charAt(0));
          System.out.println(address.name.substring(0, 1));
        }
      }
    }
  }
}
