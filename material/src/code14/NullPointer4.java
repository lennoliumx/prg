package code14;

public class NullPointer4 {

  public static void main(String[] args) {
    Address beate = new Address();
    beate.name = "Beate Beispiel";
    beate.street = "Lindenstr. 11";
    beate.city = "Stadt";
    beate.postcode = 78464;
    beate.favorite = true;

    Address max = new Address();
    max.name = "Max Muster";
    max.street = "Lindenstr. 12";
    max.postcode = 87464;
    max.city = "Konstanz";
    max.favorite = false;

    printNeighbourhoudInfo(beate, max);
  }

  private static void printNeighbourhoudInfo(Address a1, Address a2) {
    if (a1 != null && a1.city != null && a2 != null && a1.city.equals(a2.city)) {
      if (a1.street != null && a1.street.equals(a2.street)) {
        System.out.println("Beate und Max wohnen im selben Haus.");
      }
      System.out.println("Beate und Max wohnen in derselben Stadt.");
    } else {
      System.out.println("Beate und Max sind keine Nachbarn.");
    }
  }
}
