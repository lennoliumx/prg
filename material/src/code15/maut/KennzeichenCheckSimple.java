package code15.maut;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class KennzeichenCheckSimple {

  public static void main(String[] args) {
    try {
      Path mautFile = Path.of("src/code22/maut/kennzeichen.txt");

      // Read Files
      Scanner scanner = new Scanner(mautFile).useDelimiter("\n");
      ArrayList<String> registrierteKennzeichen = new ArrayList<>();
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        registrierteKennzeichen.add(line);
      }

      // Check loop
      Scanner eingabeScanner = new Scanner(System.in);
      boolean loop = true;
      while (loop) {
        System.out.print("Bitte Kennzeichen eingeben: ");
        String eingabe = eingabeScanner.nextLine();
        if (eingabe.equals("exit")) {
          loop = false;
        } else {
          boolean found = false;
          for (String k : registrierteKennzeichen) {
            if (k.equals(eingabe)) {
              found = true;
            }
          }
          if (found) {
            System.out.println("Maut bezahlt");
          } else {
            System.out.println("ACHTUNG: Keine Maut bezahlt: " + eingabe);
          }
        }
      }
    } catch (IOException ioException) {
      System.err.printf("Fehler beim Lesen der Datei: %s. Beende Programm", ioException.getMessage());
    }
  }
}
