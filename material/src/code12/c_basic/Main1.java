package code12.c_basic;

public class Main1 {

  public static void main(String[] args) {
    Address beate;
    beate = new Address();

    beate.name = "Beate Beispiel";
    beate.street = "Lindenstr. 11";
    beate.city = "Konstanz";
    beate.postcode = 78464;

    System.out.println(beate.name);
    System.out.println(beate.street);
    System.out.println(beate.city);
    System.out.println(beate.postcode);

    System.out.println("Nächste PLZ: " + (beate.postcode + 1));
  }
}
