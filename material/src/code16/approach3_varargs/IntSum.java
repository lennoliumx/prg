package code16.approach3_varargs;

public class IntSum {

  public static int sumUp(int... values) {
    int sum = 0;
    for (int a : values) {
      sum = sum + a;
    }
    return sum;
  }

//        System.out.println(values.length);
//        if (values.length >= 3) {
//            System.out.println("Der dritte Wert ist " + values[2]);
//        }
}