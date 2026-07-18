package code12.c_basic;

public class Main2 {

  public static void main(String[] args) {
    Address beate;
    beate = new Address();

    beate.name = "Beate Beispiel";
    beate.street = "Lindenstr. 11";
    beate.city = "Konstanz";
    beate.postcode = 78464;

    printAddress(beate);

    Address max = new Address();
    max.name = "Max Muster";
    max.street = "Lindenstr. 12";
    max.postcode = 78464;
    max.city = "Konstanz";

    printAddress(max);
  }

  public static void printAddress(Address address) {
    System.out.printf("%s wohnt in %s, %d %s",
            address.name, address.street, address.postcode, address.city);
    System.out.println(".");
  }
}
