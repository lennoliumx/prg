// Etwas umfangreicheres Beispiel für das Eingabe-Verarbeitung-Ausgabe Prinzip.
// In einer Datei befinden sich die täglichen Soll-und Ist-Arbeitszeiten eines Mitarbeiters.
// Aus diesen Daten soll nun eine Monatsabrechnung erstellt werden.
void main() {
  // Eingaben
  Path csvPfad = Path.of("src/code02/oktober2025.csv");
  double stundenlohn = 15;
  // Ausgabevariablen
  double gesamtSoll = 0.0;
  double gesamtIst = 0.0;
  // Verarbeitung
  try (Scanner fileScanner = new Scanner(csvPfad)) {
    while (fileScanner.hasNextLine()) {
      // Incrementelles Lesen der Eingabe Zeile für Zeile
      String line = fileScanner.nextLine();
      String[] fields = line.split(";");
      // Erstes Feld: Datum (lesen, aber nicht nutzen)
      String datum = fields[0];
      // Zweites Feld: Sollstunden
      double soll = Double.valueOf(fields[1]);
      // Drittes Feld: Iststunden
      double ist = Double.valueOf(fields[2]);

      gesamtSoll += soll;
      gesamtIst += ist;
    }
  } catch (IOException e) {
    System.out.println("Fehler beim Lesen der Datei: " + e.getMessage());
    return;
  }
  double differenz = gesamtIst - gesamtSoll;
  double lohn = gesamtIst * stundenlohn;

  // Ausgabe
  System.out.println("----- Gesamtergebnis -----");
  System.out.printf("Gesamt-Sollstunden: %.2f%n", gesamtSoll);
  System.out.printf("Gesamt-Iststunden:  %.2f%n", gesamtIst);
  System.out.printf("Über-/Minusstunden: %.2f%n", differenz);
  System.out.printf("Gesamtlohn:         %.2f EUR%n", lohn);
}

