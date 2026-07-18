package code20;

public class DivisionBy0 {

  public static int divide(int a, int b) {
    if (b == 0) {
      throw new IllegalArgumentException("b must not be 0");
    }
    return a / b;
  }

  public static void main(String[] args) {
    System.out.println(divide(10, 5));
    System.out.println(divide(10, 0));
  }
}
