package code16;

import code16.approach1_overloading.IntSum;

public class SumItUp1 {

  public static void main(String[] args) {
    System.out.println(IntSum.sumUp(23, 42));
    System.out.println(IntSum.sumUp(23, 42, 1414));
    System.out.println(IntSum.sumUp(23, 42, 1414, 1418));
    System.out.println(IntSum.sumUp(23, 42, 1414, 1418, -45));
  }
}
