package code23;

public class FactorialOverflow {

  static int factorial(int n) {
    return factorial(n);
//        return n * factorial(n - 1);
  }

  public static void main(String[] args) {
    System.out.println(factorial(5));
  }
}
