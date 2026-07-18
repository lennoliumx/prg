package code23;

public class FibonacciIt {

  public static int fibonacci(int n) {
    if (n < 1) {
      throw new IllegalArgumentException("n must be 1 or greater");
    }
    // kann man auch weglassen:
    if (n == 1 || n == 2) {
      return 1;
    }
    int secondLast = 1;
    int last = 1;
    int current = 1;
    for (int i = 3; i <= n; i++) {
      current = last + secondLast;
      secondLast = last;
      last = current;
    }
    return current;
  }

  public static void main(String[] args) {
    for (int i = 1; i <= 46; i++) {
      System.out.printf("fibunacci(%d) = %d%n", i, fibonacci(i));
    }
  }
}
