package code23;

public class TransportOptimiert {

  static void transportiere(int k, String startLager, String zielLager, String ausweichLager) {
    if (k == 0) {
      return;
    }
    transportiere(k - 1, startLager, ausweichLager, zielLager);
    System.out.printf("Transportiere Ware von %s nach %s%n", startLager, zielLager);
    transportiere(k - 1, ausweichLager, zielLager, startLager);
  }

  public static void main(String[] args) {
    transportiere(4, "Lager A", "Lager B", "Lager C");
  }
}
