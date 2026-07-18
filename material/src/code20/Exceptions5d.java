package code20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Exceptions5d {

  private static void printFirst100Chars(String fileName) throws IOException {
    String content = Files.readString(Paths.get(fileName));

    if (content.length() > 100) {
      System.out.print(content.substring(0, 100) + "...");
    } else {
      System.out.println(content);
    }
  }

  public static void main(String[] args) {
    // Die multi-catch-Schreibweise im catch-Block ist praktisch,
    // wenn man unterschiedliche Exceptions genau gleich behandelt.
    String fileName = "abc.txt";
    try {
      printFirst100Chars(fileName);
    } catch (NullPointerException | IOException e) {
      // WICHTIG: Dieses Beispiel zeigt, wie multi-catch funktioniert.
      // Eine NullPointerException sollte man jedoch nicht fangen, sondern
      // immer verhindern, dass sie überhaupt auftritt, indem man z.B. überprüft,
      // ob ein Parameter den Wert null hat, bevor man eine Methode aufruft.
      System.out.println("Fehlermeldung: " + e.getMessage());
      System.out.print("Stacktrace: ");
      e.printStackTrace();
    }
  }
}
