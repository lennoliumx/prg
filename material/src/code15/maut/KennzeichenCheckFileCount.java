package code15.maut;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Scanner;

public class KennzeichenCheckFileCount {

  public static void main(String[] args) {
    try {
      Path mautFile = Path.of("src/code22/maut/kennzeichen.txt");
      Path checkFile = Path.of("src/code22/maut/check2.txt");

      // Read Maut Files
      Scanner scannerMautFile = new Scanner(mautFile).useDelimiter("\n");
      HashMap<String, Integer> registrierteKennzeichen = new HashMap<>();
      while (scannerMautFile.hasNextLine()) {
        String line = scannerMautFile.nextLine();
        registrierteKennzeichen.put(line, 0);
      }
      // Read Check File
      Scanner scannerCheckFile = new Scanner(checkFile).useDelimiter("\n");
      long start = System.nanoTime();
      System.out.println("Start Checking.....");
      while (scannerCheckFile.hasNextLine()) {
        String line = scannerCheckFile.nextLine();
        Integer count = registrierteKennzeichen.get(line);
        if (count != null) {
          registrierteKennzeichen.put(line, count + 1);
        } else {
          System.out.println("Keine Maut bezahlt: " + line);
        }
      }
      // Gebe alle Kennzeichen aus, die mehr als einmal vorkommen
      for (String kennzeichen : registrierteKennzeichen.keySet()) {
        if (registrierteKennzeichen.get(kennzeichen) > 0) {
          System.out.println(kennzeichen + " " + registrierteKennzeichen.get(kennzeichen));
        }
      }
    } catch (IOException ioException) {
      System.err.printf("Fehler beim Lesen der Datei: %s. Beende Programm", ioException.getMessage());
    }
  }
}
