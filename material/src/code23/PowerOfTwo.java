package code23;

public class PowerOfTwo {

  static int powerOfTwoTo(int n) {
    if (n < 0) {
      throw new IllegalArgumentException("n must be zero or positive");
    }
    if (n == 0) {
      return 1;
    }
    // "tail-recursive"
    return 2 * powerOfTwoTo(n - 1);
  }

  public static void main(String[] args) {
    System.out.println(powerOfTwoTo(10));
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(powerOfTwoTo(i));
//        }
//        System.out.println(1 << 10);
  }
}
