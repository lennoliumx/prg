package code14;

import java.util.Arrays;

public class ParameterPassingIntArrayMorePrinln {

  public static void doSomething(int[] arrayParam) {
    System.out.println("    arrayParam in method before: " + Arrays.toString(arrayParam));
    arrayParam[1] = 11;
    System.out.println("    arrayParam in method after: " + Arrays.toString(arrayParam));
  }

  public static void main(String[] args) {
    int[] arrayMain = new int[]{42, 43};
    System.out.println("arrayMain in main before method call: " + Arrays.toString(arrayMain));
    doSomething(arrayMain);
    System.out.println("arrayMain in main after method call: " + Arrays.toString(arrayMain));
  }
}
