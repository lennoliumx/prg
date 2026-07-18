package code16;

import code16.approach2_array.IntSum;

public class SumItUp2 {

  public static void main(String[] args) {
    // Das geht leider nicht:
//        System.out.println(IntSum.sumUp(1, 2, 3));
    int[] values = {1, 2, 3, 4, 5, 6, 7};
    int sum = IntSum.sumUp(values);
    System.out.println(sum);

    System.out.println(IntSum.sumUp(new int[]{23, 42}));
    System.out.println(IntSum.sumUp(new int[]{23, 42, 1414}));
    System.out.println(IntSum.sumUp(new int[]{23, 42, 1414, 1418}));
    System.out.println(IntSum.sumUp(new int[]{23, 42, 1414, 1418, -1418, -1414, -23, 0, 0, 432432}));
  }
}
