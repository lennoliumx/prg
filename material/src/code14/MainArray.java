package code14;

public class MainArray {

  public static void main(String[] args) {
    final int MAX_ADDRESSES = 10;
    Address[] addresses = new Address[MAX_ADDRESSES];
    for (int i = 0; i < addresses.length; i++) {
      addresses[i] = new Address();
    }
    addresses[0].name = "Beate Beispiel";
    addresses[0].street = "Lindenstr. 11";
    addresses[0].city = "Konstanz";
    addresses[0].postcode = 78464;
    addresses[0].favorite = false;

    Address max = new Address();
    max.name = "Max Muster";
    max.street = "Lindenstr. 13";
    max.city = "Radolfzell";
    max.postcode = 78464;
    max.favorite = true;

    addresses[1] = max;

    for (Address address : addresses) {
      String favoriteStar = address.favorite ? "★" : "☆";
      System.out.println(favoriteStar + " " + address.name);
      System.out.println(address.street);
      System.out.print(address.postcode);
      System.out.print(" ");
      System.out.println(address.city);
      System.out.println("===============================");
    }
  }
}
