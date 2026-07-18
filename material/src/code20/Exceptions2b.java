package code20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Exceptions2b {

  // Wollen die ersten 100 Zeichen einer Datei ausgeben
  // Jetzt haben wir dafür eine eigene Methode geschrieben.
  // Diese muss jetzt auch "throws IOException" deklarieren (wegen readString)
  private static void printFirst100Chars(String fileName) throws IOException {
    String content = Files.readString(Paths.get(fileName));

    if (content.length() > 100) {
      System.out.println(content.substring(0, 100) + "...");
    } else {
      System.out.println(content);
    }
  }

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Dateiname? ");
    String fileName = scanner.nextLine();
    scanner.close();

    // wir werfen die Exception weiter nach außen
    printFirst100Chars(fileName);
  }
}
