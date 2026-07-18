void main() {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Geben Sie eine ganze Zahl ein:");
  int x = scanner.nextInt();
  if (x == 0)
    System.out.println("x ist gleich 0");
  else
    System.out.println("x ungleich 0, wir dividieren");
  System.out.println("1/x liefert " + 1.0 / x);

  System.out.println("Ende.");
  scanner.close();
}
