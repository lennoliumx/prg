package code20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Exceptions3RepeatInput {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    boolean error = false;
    String content = null;

    do {
      System.out.print("Dateiname? ");
      String fileName = scanner.nextLine();

      try {
        content = Files.readString(Paths.get(fileName));
        error = false;
      } catch (IOException e) {
        System.out.println("Error: File does not exist. Please enter another filename.");
        error = true;
      }
    } while (error);

    // Ausgabe der ersten 100 Zeichen gefolgt von "..." oder eben des
    // kompletten Inhalts, wenn die Datei kürzer ist.
    if (content.length() > 100) {
      System.out.print(content.substring(0, 100) + "...");
    } else {
      System.out.println(content);
    }

    scanner.close();
  }
}
