package code23;

public class Transport {

  static void transportiere(int k, String startLager, String zielLager, String ausweichLager) {
    if (k == 1) {
      System.out.printf("Transportiere oberste Ware von %s nach %s%n", startLager, zielLager);
      return;
    }
    transportiere(k - 1, startLager, ausweichLager, zielLager);
    System.out.printf("Transportiere oberste Ware von %s nach %s%n", startLager, zielLager);
    transportiere(k - 1, ausweichLager, zielLager, startLager);
  }

  public static void main(String[] args) {
//        transportiere(3, "Lager 1", "Lager 3", "Lager 2");
    transportiere(5, "Turm A", "Turm C", "Turm B");
  }
}
