package code16.approach2_array;

public class IntSum {

  public static int sumUp(int[] values) {
    int sum = 0;
    for (int a : values) {
      sum = sum + a;
    }
    return sum;
  }
}
