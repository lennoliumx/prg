package code16;

public class VarArgsAdvanced {

  public static int sumUp(int a, int b, int... values) {
    int sum = a + b;
    if (values == null) {
      return sum;
    }
    for (int value : values) {
      sum = sum + value;
    }
    return sum;
  }

  public static int sumUp(int a, int b, int c) {
    System.out.println("Dies ist unsere Spezialmethode");
    return a + b + c;
  }

  public static void printWithPrefix(String prefix, double... numbers) {
    if (numbers == null || numbers.length == 0) {
      return;
    }
    for (double number : numbers) {
      System.out.println(prefix + number);
    }
  }
}
