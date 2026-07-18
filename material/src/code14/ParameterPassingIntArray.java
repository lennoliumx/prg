package code14;

import java.util.Arrays;

public class ParameterPassingIntArray {

  public static void doSomething(int[] arrayParam) {
    arrayParam[1] = 11;
  }

  public static void main(String[] args) {
    int[] arrayMain = new int[]{42, 43};
    doSomething(arrayMain);
    System.out.println(Arrays.toString(arrayMain));
  }
}
