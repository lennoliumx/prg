package code20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Exceptions5c {

  private static void printFirst100Chars(String fileName) throws IOException {
    String content = Files.readString(Paths.get(fileName));

    if (content.length() > 100) {
      System.out.print(content.substring(0, 100) + "...");
    } else {
      System.out.println(content);
    }
  }

  public static void main(String[] args) {
    // printFirst100Chars wirft jetzt eine NullPointerException
    // Diese ist eine unchecked exception (erbt von RuntimeException) und
    // muss nicht behandelt werden, kann es aber
    String fileName = null;
    try {
      printFirst100Chars(fileName);
    } catch (NullPointerException e) {
      // WICHTIG: Dieses Beispiel zeigt, dass man auch RuntimeExceptions fangen kann.
      // Eine NullPointerException sollte man jedoch nicht fangen, sondern
      // immer verhindern, dass sie überhaupt auftritt, indem man z.B. überprüft,
      // ob ein Parameter den Wert null hat, bevor man eine Methode aufruft.
      System.out.println("Mensch, man darf printFirst100Chars doch nicht mit null aufrufen!");
    } catch (IOException e) {
      System.out.println("Ein Fehler ist beim Öffnen der Datei aufgetreten.");
      System.out.println("Fehlermeldung: " + e.getMessage());
      System.out.print("Stacktrace: ");
      e.printStackTrace();
    }
  }
}
