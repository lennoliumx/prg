package code20;

public class DivisionBy0Integrated {

  public static int divide(int a, int b) {
    if (b != 0) {
      return a / b;
    } else {
      return -2147483648; // = Integer.MIN_VALUE;
    }
  }

  public static void main(String[] args) {
    System.out.println(divide(10, 5));
    System.out.println(divide(10, 0));
  }
}
