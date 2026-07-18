void main() {
  Scanner scanner = new Scanner(System.in);
  System.out.print("Geben Sie ein Ergebnis +/-/o ein: ");
  char result = scanner.next().charAt(0);
  if (result == '+') {
    System.out.println("gutes Ergebnis");
  } else if (result == '-') {
    System.out.println("schlechtes Ergebnis");
  } else if (result == 'o') {
    System.out.println("So-la-la-Ergebnis");
  } else {
    System.out.println("unbekanntes Ergebnis");
  }
}
