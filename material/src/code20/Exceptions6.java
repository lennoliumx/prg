package code20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Exceptions6 {

  // Wollen die ersten 100 Zeichen einer Datei ausgeben
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Hier umfasst der try-Block fast den gesamten Code
    try {
      System.out.print("Dateiname? ");
      String fileName = scanner.nextLine();

      String content = Files.readString(Paths.get(fileName));
      if (content.length() > 100) {
        System.out.println(content.substring(0, 100) + "...");
      } else {
        System.out.println(content);
      }
    } catch (IOException e) {
      // Bei einem Feher wird mit Fehlermeldung gestoppt (return beendet main)
      System.out.println("Ein Fehler ist beim Öffnen der Datei aufgetreten.");
      System.out.println("Fehlermeldung: " + e.getMessage());
      e.printStackTrace();
      return;
    } finally {
      // Dieser Block wird immer ausgeführt, egal ob ein Fehler auftritt oder nicht.
      System.out.println("Scanner wird geschlossen.");
      scanner.close();
    }
    System.out.println("Programm wurde ohne Fehler beendet.");
  }
}
