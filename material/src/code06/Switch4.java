void main() {
  java.util.Scanner scanner = new java.util.Scanner(System.in);
  System.out.print("Geben Sie ein Ergebnis +/-/o ein: ");
  char result = scanner.next().charAt(0);
  String ergebnis = switch (result) {
    case '+' -> "gutes Ergebnis";
    case '-' -> {
      System.out.println("Psst: Niemandem verraten!");
      yield "schlechtes Ergebnis";
    }
    case 'o' -> "So-la-la-Ergebnis";
    default -> "unbekanntes Ergebnis";
  };
  System.out.println("Wert der Variable 'ergebnis': " + ergebnis);
  System.out.println("Switch fertig.");
}
