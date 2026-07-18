package code23;

public class FactorialIterative {

  static int factorial(int n) {
    // factorial(n) = 1 * 2 * 3 * ... * n
    int result = 1;
    for (int i = 1; i <= n; i++) {
      result = result * i;
    }
    return result;
  }

  public static void main(String[] args) {
//        System.out.println(factorial(5));
    for (int i = 1; i <= 10; i++) {
      System.out.printf("%d! ist %d%n", i, factorial(i));
    }
  }
}
