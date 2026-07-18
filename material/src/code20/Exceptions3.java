package code20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Exceptions3 {

  // Wollen die ersten 100 Zeichen einer Datei ausgeben
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Dateiname? ");
    String fileName = scanner.nextLine();
    scanner.close();

    // readString kann eine IOException werfen. Wir fangen die Exception,
    // geben eine Fehlermeldung aus und beenden die main-Methode (über return)
    String content = null;
    try {
      content = Files.readString(Paths.get(fileName));
      System.out.println("Zugriff hat geklappt!");
    } catch (IOException e) {
      System.out.println("Ein Fehler ist beim Öffnen der Datei '" + fileName +
              "' aufgetreten.");
      System.out.println("Fehlermeldung: " + e.getMessage());
      System.out.print("Stacktrace: ");
      e.printStackTrace();
      return;
    }

    // Ausgabe der ersten 100 Zeichen gefolgt von "..." oder eben des
    // kompletten Inhalts, wenn die Datei kürzer ist.
    if (content.length() > 100) {
      System.out.println(content.substring(0, 100) + "...");
    } else {
      System.out.println(content);
    }

    System.out.println("Programm wurde ohne Fehler beendet.");
  }
}
