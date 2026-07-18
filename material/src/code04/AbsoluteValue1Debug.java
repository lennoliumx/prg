void main() {
  double x, y;
  Scanner scanner = new Scanner(System.in);
  scanner.useLocale(Locale.ENGLISH);
  System.out.print("x: ");
  x = scanner.nextDouble();

  if (x < 0.0) {
    System.out.printf("Fall x < 0 mit x: %f%n", x);
    y = -x;
  } else {
    System.out.printf("Fall else mit x: %f%n", x);
    y = x;
  }

  System.out.println("Der Betrag von " + x + " ist " + y);
//		System.out.printf("Der Betrag von %f ist %f", x, y);
  scanner.close();
}