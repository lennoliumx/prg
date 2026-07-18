package code20;

public class ErrorCodeAsReferenceParam {

  public static ReturnValue divide(int a, int b) {
    ReturnValue ret = new ReturnValue();
    if (b == 0) {
      ret.error = -1;
    } else {
      ret.value = a / b;
      ret.error = 0;
    }
    return ret;
  }

  public static void main(String[] args) {
    ReturnValue divisionResult = divide(10, 2);
    if (divisionResult.error == 0) {
      System.out.println(divisionResult.value);
    } else {
      System.out.println("Got error code " + divisionResult.error);
      System.out.println("Division by 0 is not allowed.");
    }
  }

}
