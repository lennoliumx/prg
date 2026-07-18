void main() {
  double x, y;
  Scanner scanner = new Scanner(System.in);
  System.out.print("x: ");
  x = scanner.nextDouble();

  y = (x < 0.0) ? -x : x;
  System.out.println("Der Betrag von " + x + " ist " + y);

  scanner.close();
}