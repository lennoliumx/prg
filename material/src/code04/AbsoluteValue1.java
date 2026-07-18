void main() {
  double x, y;
  Scanner scanner = new Scanner(System.in);
  scanner.useLocale(Locale.GERMANY);
  System.out.print("x: ");
  x = scanner.nextDouble();

  if (x < 0.0) {
    y = -x;
  } else {
    y = x;
  }
  System.out.println("Der Betrag von " + x + " ist " + y);
//		System.out.printf("Der Betrag von %f ist %f", x, y);
  scanner.close();
}