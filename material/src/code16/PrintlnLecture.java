package code16;

public class PrintlnLecture {

  public static void println(String... strings) {
    if (strings == null) {
      return;
    }
    for (String string : strings) {
      System.out.print(string);
      System.out.print(" ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    println();
    println(null);
    println("Hallo");
    println("Hallo", "Welt");
    println("Hallo", "Welt", "!");
    println(new String[]{"Das", "sind", "alles", "Wörter"});
  }
}
