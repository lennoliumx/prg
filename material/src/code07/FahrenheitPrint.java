void main() {
  printFahrenheitToCelsius(68, "detroit");
  printFahrenheitToCelsius(58, "chicago");
  printFahrenheitToCelsius(81, "atlanta");
}

void printFahrenheitToCelsius(int fahrenheit, String city) {
  double celsius = (fahrenheit - 32) * 5.0 / 9.0;
  System.out.printf("%s: = %d F / %.1f C%n", city, fahrenheit, celsius);
}