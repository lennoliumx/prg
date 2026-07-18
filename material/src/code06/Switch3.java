void main(String[] args) {
  java.util.Scanner scanner = new java.util.Scanner(System.in);
  System.out.print("Geben Sie eine Note ein: ");
  int result = scanner.nextInt();
  switch (result) {
    case 1, 2 -> System.out.println("gutes Ergebnis");
    case 4, 5, 6 -> System.out.println("schlechtes Ergebnis");
    case 3 -> System.out.println("So-la-la-Ergebnis");
    default -> System.out.println("Diese Note kenne ich nicht");
  }
  System.out.println("Switch fertig.");
}
