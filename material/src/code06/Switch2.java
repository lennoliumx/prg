void main() {
  java.util.Scanner scanner = new java.util.Scanner(System.in);
  System.out.print("Geben Sie ein Ergebnis +/-/o ein: ");
  char result = scanner.next().charAt(0);
  switch (result) {
    case '+' -> System.out.println("gutes Ergebnis");
    case '-' -> System.out.println("schlechtes Ergebnis");
    case 'o' -> System.out.println("So-la-la-Ergebnis");
    default -> System.out.println("unbekanntes Ergebnis");
  }
  System.out.println("Switch fertig.");
}
