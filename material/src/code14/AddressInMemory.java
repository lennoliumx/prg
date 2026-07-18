package code14;

public class AddressInMemory {

  public static void main(String[] args) {
    Address address = new Address();
    address.city = "Konstanz";
    address.postcode = 78464;

    Address another = address;

    System.out.println("address: " + address.postcode + " " + address.city);
    System.out.println("another: " + another.postcode + " " + another.city);

    System.out.println("changing address.city to Dettingen...");
    address.city = "Dettingen";

    System.out.println("address: " + address.postcode + " " + address.city);
    System.out.println("another: " + another.postcode + " " + another.city);

    System.out.println("changing another.postcode to 78465...");
    another.postcode = 78465;

    System.out.println("address: " + address.postcode + " " + address.city);
    System.out.println("another: " + another.postcode + " " + another.city);
  }
}
