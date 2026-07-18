package code15.maut;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Scanner;

public class KennzeichenCheckCommandLine {

  public static void main(String[] args) {
    try {
      // Get Filename from Command Line
      if (args.length != 3) {
        System.err.println("Fehlerhaft Anzahl von Paramater: <maut-datei> <check-datei> <ausgabe-datei>");
        System.exit(1);
      } else {

        Path mautFile = Path.of(args[0]);
        Path checkFile = Path.of(args[1]);
        Path outFile = Path.of(args[2]);

        // Read Maut Files
        Scanner scannerMautFile = new Scanner(mautFile).useDelimiter("\n");
        HashMap<String, String> registrierteKennzeichen = new HashMap<>();
        while (scannerMautFile.hasNextLine()) {
          String line = scannerMautFile.nextLine();
          registrierteKennzeichen.put(line, "bezahlt");
        }
        // Read Check File
        Scanner scannerCheckFile = new Scanner(checkFile).useDelimiter("\n");
        System.out.println("Start Checking.....");
        StringBuilder output = new StringBuilder();
        while (scannerCheckFile.hasNextLine()) {
          String line = scannerCheckFile.nextLine();
          if (!registrierteKennzeichen.containsKey(line)) {
            output.append(line).append("\n");
          }
        }
        // Write result
        Files.writeString(outFile, output);
      }
    } catch (IOException ioException) {
      System.err.printf("Fehler beim Lesen der Datei: %s. Beende Programm", ioException.getMessage());
    }
  }
}
