package code23;

public class Factorial {

  static int factorial(int n) {
    if (n == 1) {
      return 1;
    }
    return factorial(n - 1) * n;
  }

  public static void main(String[] args) {
    System.out.println(factorial(5));
//        for (int i = 1; i <= 10; i++) {
//            System.out.printf("%d! ist %d%n", i, factorial(i));
//        }
  }
}
