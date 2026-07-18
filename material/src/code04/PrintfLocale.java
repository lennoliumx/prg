void main() {
  System.out.printf("%.4f%n", Math.PI); // 3,1416 auf deutschem System
  System.out.printf(Locale.ENGLISH, "%.4f%n", Math.PI); // 3.1416
  String piWithComma = String.format(Locale.GERMANY, "%.4f", Math.PI); // 3,1416
  String piWithPoint = String.format(Locale.UK, "%.4f", Math.PI); // 3.1416
}
