package code23;

public class FibonacciRec {

  public static int fibonacci(int n) {
    if (n < 1) {
      throw new IllegalArgumentException("n must be 1 or greater");
    }
    if (n == 1 || n == 2) {
      return 1;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  public static void main(String[] args) {
    for (int i = 1; i <= 46; i++) {
      System.out.printf("fibonacci(%d) = %d%n", i, fibonacci(i));
    }
  }
}
