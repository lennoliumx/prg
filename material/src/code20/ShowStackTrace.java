package code20;

public class ShowStackTrace {

  public static void main(String[] args) {
    someMethod();
  }

  private static void someMethod() {
    someOtherMethod();
  }

  public static void someOtherMethod() {
    // Zu Demonstrationszwecken wird hier eine Exception erzeugt,
    // aber nicht geworfen. Das ist unüblich. In den meisten
    // Fällen erzeugt man Exceptions direkt an der Stelle,
    // an der sie geworfen werden, z.B. throw new Exception("Error!");
    Exception e = new IllegalArgumentException("Ein Fehler ist aufgetreten!");
    System.out.println(e.getMessage());
    e.printStackTrace();
  }

}
