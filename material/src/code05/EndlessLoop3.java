void main() {
  // Summiere die Zahlen 0, 0.1, 0.2, ..., 0.9 auf
  double sum = 0.0;
  for (double d = 0; d != 1; d = d + 0.1) {
    System.out.println("d = " + d);
    sum = sum + d;
    System.out.printf("sum = %f%n", sum);
  }
  System.out.println("Summe: " + sum);
}