package code15.generator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckFileGenerator {

  public static void main(String[] args) {
    try {
      Path mautFile = Path.of("src/code15/maut/kennzeichen.txt");
      Path outFile = Path.of("src/code15/maut/check.txt");
      final int COUNT = 5_000;
      final int FRAUD_RATE = 100;

      // Read Files
      Scanner scanner = new Scanner(mautFile).useDelimiter("\n");
      ArrayList<String> registrierteKennzeichen = new ArrayList<>();
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        registrierteKennzeichen.add(line);
      }

      // Generrate Loop
      StringBuilder output = new StringBuilder();
      for (int i = 0; i < COUNT; i++) {
        boolean fraud = (Math.random() * FRAUD_RATE < 1);
        if (fraud) {
          output.append(KennzeichenGenerator.randomPlate()).append("\n");
        } else {
          int randomIndex = (int) (Math.random() * registrierteKennzeichen.size());
          output.append(registrierteKennzeichen.get(randomIndex)).append("\n");
        }
      }
      Files.writeString(outFile, output);
    } catch (IOException ioException) {
      System.err.printf("Fehler beim Lesen der Datei: %s. Beende Programm", ioException.getMessage());
    }
  }
}
