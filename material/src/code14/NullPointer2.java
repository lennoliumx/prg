package code14;

public class NullPointer2 {

  public static void main(String[] args) {
    Address beate = new Address();
    beate.name = "Beate Beispiel";
    beate.street = "Lindenstr. 11";
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
    // Hinweis: Es gibt verschiedene Städte, die gleich heißen, daher
    // müsste man eigentlich auch noch PLZ-Bereiche mitüberprüfen
    if (a1.city.equals(a2.city)) {
      if (a1.street.equals(a2.street)) {
        System.out.println(a1.name + " und " + a2.name + " wohnen im selben Haus.");
      } else {
        System.out.println(a1.name + " und " + a2.name + " wohnen in derselben Stadt.");
      }
    } else {
      System.out.println(a1.name + " und " + a2.name + " sind keine Nachbarn.");
    }
  }
}
