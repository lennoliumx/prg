package code14;

import java.util.Arrays;

public class StringsAreImmutable {

  public static void main(String[] args) {
    String s1 = "Hallo";
    String s2 = s1 + "!";
    String s3 = s1.substring(1);
    System.out.println("Auf diese Zeile einen Breakpoint setzen und Speicher im Debugger ansehen!");
    // Man sieht dann, dass es drei verschiedene Speicherbereiche sind. Über String-Methoden
    // kann man den Inhalt einer String-Instanz nicht verändern.

    // Nicht mal das funktioniert nicht
    char[] chars = s1.toCharArray();
    chars[0] = 'B';
    System.out.println(s1);
    System.out.println(Arrays.toString(chars));
  }
}
