package code20.gettersetter;

public class Main {

  public static void main(String[] args) {
    Address address = new Address(78462, "Konstanz");
    System.out.println(address.getPlz());
    System.out.println(address.getCity());

    address.setPlz(78466);
    System.out.println(address.getPlz());
    System.out.println(address.getCity());

//        address.setPlz(123123123);
//        address.setCity(null);
//        address.setCity("");

//        Address address2 = new Address(12378465, "Konstanz");
//        Address address3 = new Address(78465, null);
//        Address address4 = new Address(78465, "");
  }
}
