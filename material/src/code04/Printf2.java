void main() {
  double pi = Math.PI;
  System.out.println(pi);
  System.out.printf("Pi with 10 decimal places: %.10f%n", pi);
  System.out.printf("Pi with  4 decimal places: %.4f%n", pi);
  System.out.println();

  String name = "Alex";
  int age = 27;
  System.out.printf("%10s%n", name);
  System.out.printf("%10d%n", age);
  System.out.printf("%13.2f%n", pi);

  System.out.println();
  double balanceInEuros = 1234.2;
  System.out.printf("Balance: %+,.2f%n", balanceInEuros);
}
