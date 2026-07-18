package code20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Exceptions2a {

  // Wollen die ersten 100 Zeichen einer Datei ausgeben
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Dateiname? ");
    String fileName = scanner.nextLine();
    scanner.close();

    // readString kann eine IOException werfen. Wir deklarieren die Exception
    // über "throws IOException" an der Main-Methode, damit wird sie weiter
    // nach außen geworfen
    String content = Files.readString(Paths.get(fileName));

    // Ausgabe der ersten 100 Zeichen gefolgt von "..." oder eben des
    // kompletten Inhalts, wenn die Datei kürzer ist.
    if (content.length() > 100) {
      System.out.println(content.substring(0, 100) + "...");
    } else {
      System.out.println(content);
    }
  }
}
