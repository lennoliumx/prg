package code17.gettersetter;

public class Main {

  public static void main(String[] args) {
    Address address = new Address();
//        address.plz = 78465;
    address.setPlz(78465);
    address.setCity("Konstanz");
    System.out.println(address.getPlz());
    System.out.println(address.getCity());

    address.setPlz(78462);
    System.out.println(address.getPlz());
    System.out.println(address.getCity());

    // Exception:
//        address.setPlz(-1234);
    // Wenn plz public wäre, könnte man einfach einen ungültigen Wert setzen,
    // da es dann keine Möglichkeit gibt, das zu verhindern:
    //address.plz = -1234;
  }
}
