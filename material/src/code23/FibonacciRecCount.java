package code23;

public class FibonacciRecCount {

  static final int N = 46;
  static int[] calls = new int[N + 1];

  public static int fibonacci(int n) {
    calls[n]++;
    if (n < 1) {
      throw new IllegalArgumentException("n must be 1 or greater");
    }
    if (n == 1 || n == 2) {
      return 1;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  public static void main(String[] args) {
    fibonacci(N);
    System.out.println();
    for (int i = 1; i <= calls.length - 1; i++) {
      System.out.printf("%2d: %d%n", i, calls[i]);
    }

  }
}
