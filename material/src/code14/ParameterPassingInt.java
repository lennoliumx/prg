package code14;

public class ParameterPassingInt {

  public static void doSomething(int intParam) {
    intParam = 11;
  }

  public static void main(String[] args) {
    int intMain = 42;
    doSomething(intMain);
    System.out.println(intMain);
  }
}
