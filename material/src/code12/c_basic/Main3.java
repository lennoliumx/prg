package code12.c_basic;

public class Main3 {

  public static void main(String[] args) {
    Address random1 = createRandomAddress();
    printAddress(random1);
    Address random2 = createRandomAddress();
    printAddress(random2);
    for (int i = 0; i < 8; i++) {
      printAddress(createRandomAddress());
    }
  }

  private static void printAddress(Address address) {
    System.out.printf("%s wohnt in %s, %05d %s",
            address.name, address.street, address.postcode, address.city);
    System.out.println(".");
  }

  public static Address createRandomAddress() {
    Address address = new Address();
    address.name = Math.random() < 0.5 ? "Max" : "Beate";
    address.street = Math.random() < 0.5 ? "Hauptstraße " : "Hintergasse ";
    address.street += (int) (Math.random() * 20) + 1;
    address.city = Math.random() < 0.5 ? "Neustadt" : "Zufallsdorf";
    address.postcode = (int) (Math.random() * 100000);
    return address;
  }

}
