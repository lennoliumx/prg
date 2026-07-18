void main() {
  boolean eingabe = true;
  Scanner scanner = new Scanner(System.in);
  while (eingabe) {
    System.out.print("Wochentag: ");
    int wochentag = scanner.nextInt();
    double entrittspreis = berechneEintrittspreis(wochentag);
    if (entrittspreis > 0) {
      System.out.printf("Eintrittspreis: %.2f\n", entrittspreis);
    } else {
      System.out.println("Ungültiger Wochentag");
    }
    System.out.print("Weiterer Eingabe J/N? ");
    String weiter = scanner.next();
    eingabe = weiter.toLowerCase().equals("j");
  }
}

double berechneEintrittspreis(int wochentag) {
  double result;
  switch (wochentag) {
    case 0 -> result = 4;
    case 1, 2 -> result = 5;
    case 3 -> result = 6;
    case 4 -> result = 4;
    case 5 -> result = 8;
    case 6 -> result = 10;
    default -> result = -1;
  }
  return result;
}
