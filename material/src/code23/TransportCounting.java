package code23;

public class TransportCounting {

  static int counter = 0;

  static void transportiere(int k, String startLager, String zielLager, String ausweichLager) {
    if (k == 1) {
      //System.out.printf("Transportiere Ware von %s nach %s%n", startLager, zielLager);
      counter++;
      return;
    }
    transportiere(k - 1, startLager, ausweichLager, zielLager);
    //System.out.printf("Transportiere Ware von %s nach %s%n", startLager, zielLager);
    counter++;
    transportiere(k - 1, ausweichLager, zielLager, startLager);
  }

  public static void main(String[] args) {
    for (int k = 1; k <= 20; k++) {
      counter = 0;
      transportiere(k, "Lager A", "Lager B", "Lager C");
      System.out.println(k + ": " + counter);
    }
  }
}
