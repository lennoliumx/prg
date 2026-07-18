int max(int a, int b) {
  if (a >= b) {
    return a;
  }
  return b;
}

int abs(int n) {
  return n >= 0 ? n : -n;
}

boolean isDivisibleBy2(int n) {
  return n % 2 == 0;
}

int min(int a, int b) {
  System.out.println("Aufruf int-Variante");
  return a <= b ? a : b;
}

double min(double a, double b) {
  System.out.println("Aufruf double-Variante");
  return a < b ? a : b;
}

void main() {
  System.out.println(min(1, 1));
  System.out.println();
  System.out.println(min(1.0, 1.0));
  System.out.println();
  System.out.println(min(1, 1.0));
  System.out.println();
  int n = 20;
  if (isDivisibleBy2(n)) {
    System.out.println("n ist gerade!");
  }
}

