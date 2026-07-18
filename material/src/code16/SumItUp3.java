package code16;

import code16.approach3_varargs.IntSum;

public class SumItUp3 {

  public static void main(String[] args) {
    System.out.println(IntSum.sumUp(23, 42));
    System.out.println(IntSum.sumUp(23, 42, 1414));
    System.out.println(IntSum.sumUp(23, 42, 1414, 1418));
    System.out.println(IntSum.sumUp(23, 42, 1414, 1418, -1418, -1414, -23, 0, 0, 6, 7, 8, 8));

    System.out.println(IntSum.sumUp(1));
    System.out.println(IntSum.sumUp());
    System.out.println(IntSum.sumUp(new int[]{1, 2, 3, 19}));
    ;
  }
}
