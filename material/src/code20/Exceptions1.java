package code20;

import java.util.Scanner;

public class Exceptions1 {

  // Ziel: Wollen die ersten 100 Zeichen einer Datei ausgeben
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Dateiname? ");
    String fileName = scanner.nextLine();
    scanner.close();

    // readString kann eine IOException werfen. Was tun?
//        String content = Files.readString(Paths.get(fileName));
  }
}
