void main() {
  double x, y;

  Scanner scanner = new Scanner(System.in);
  System.out.print("x: ");
  x = scanner.nextDouble();

  y = x;
  if (x < 0.0) {
    y = -x;
  }
  System.out.println("Der Betrag von " + x + " ist " + y);

  scanner.close();
}