package code15.maut;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class KennzeichenCheckFileList {

  public static void main(String[] args) {
    try {
      Path mautFile = Path.of("src/code22/maut/kennzeichen.txt");
      Path checkFile = Path.of("src/code22/maut/check.txt");

      // Read Maut Files
      Scanner scannerMautFile = new Scanner(mautFile).useDelimiter("\n");
      ArrayList<String> registrierteKennzeichen = new ArrayList<>();
      while (scannerMautFile.hasNextLine()) {
        String line = scannerMautFile.nextLine();
        registrierteKennzeichen.add(line);
      }
      // Read Check File
      Scanner scannerCheckFile = new Scanner(checkFile).useDelimiter("\n");
      System.out.println("Start Checking.....");
      while (scannerCheckFile.hasNextLine()) {
        String line = scannerCheckFile.nextLine();
        boolean found = registrierteKennzeichen.contains(line);
        if (!found) {
          System.out.println("Keine Maut bezahlt: " + line);
        }
      }
    } catch (IOException ioException) {
      System.err.printf("Fehler beim Lesen der Datei: %s. Beende Programm", ioException.getMessage());
    }
  }

}
