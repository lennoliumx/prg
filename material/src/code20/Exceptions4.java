package code20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Exceptions4 {

  // Wollen die ersten 100 Zeichen einer Datei ausgeben
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Dateiname? ");
    String fileName = scanner.nextLine();
    scanner.close();

    String content = null;
    try {
      content = Files.readString(Paths.get(fileName));
    } catch (IOException e) {
      // Einfach nichts tun oder auch Loggen der Exception ohne weitere
      // Schritte (z.B. Programmabbruch) führt zu Fehlern im weiteren
      // Programmablauf, die sich nur schwer nachvollziehen lassen
//            e.printStackTrace();
    }

    // Hier fliegt nämlich jetzt eine NullPointerException, mit der man nicht rechnet:
    if (content.length() > 100) {
      System.out.print(content.substring(0, 100) + "...");
    } else {
      System.out.println(content);
    }
  }
}
