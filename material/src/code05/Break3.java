void main() {
  Scanner scanner = new Scanner(System.in);

  while (true) {
    System.out.println();
    System.out.println("Durch welche Zahl soll 100 geteilt werden? ('e' zum Beenden)");
    String input = scanner.next();
    if (input.equals("e")) {
      break;
    }
    double divisor = Double.parseDouble(input);
    if (divisor == 0) {
      System.out.println("Durch 0 teilen? Nicht mit mir!");
      continue;
    }
    System.out.printf("100 geteilt durch %.2f ist %.2f%n", divisor, 100 / divisor);
  }
  System.out.println("Auf Wiedersehen!");

  scanner.close();
}

