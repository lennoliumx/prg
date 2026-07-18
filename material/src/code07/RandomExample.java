package code07;

public class RandomExample {

  public static void main(String[] args) {
    final int MAX = 100;
    // Wollen MAX viele zufällige Kommazahlen zwischen 0 und 1 ausgeben (1 nicht inklusive)
    int counter = 0;
    while (counter < MAX) {
      System.out.printf("%d: %f |", counter, Math.random());
      counter++;
    }
    System.out.println();
    // Wollen MAX viele zufällige Kommazahlen zwischen 0 und 10 ausgeben (10 nicht inklusive)
    for (int i = 0; i < MAX; i++) {
      double random = Math.random() * 10;
      System.out.printf("%d: %f |", i, random);
    }
    System.out.println();
    // Wollen MAX viele zufällige ganze Zahlen zwischen 0 und 10 ausgeben (10 nicht inklusive,
    // also zwischen 0 und 9)
    for (int i = 0; i < MAX; i++) {
      int random = (int) (Math.random() * 10);
      System.out.printf("%d: %d |", i, random);
    }
    System.out.println();
    // Wollen MAX viele zufällige ganze Zahlen zwischen -5 und 5 ausgeben (5 nicht inklusive,
    // also zwischen -5 und +4)
    for (int i = 0; i < MAX; i++) {
      int random = ((int) (Math.random() * 10)) - 5;
      System.out.printf("%d: %d |", i, random);
    }
    System.out.println();
    // Wollen mit Wahrscheinlichkeit 0.5 Kopf oder Zahl ausgeben
    System.out.print("Ich werfe eine Münze. Ergebnis ist ");
    if (Math.random() < 0.5) {
      System.out.println("Kopf.");
    } else {
      System.out.println("Zahl.");
    }
  }
}
