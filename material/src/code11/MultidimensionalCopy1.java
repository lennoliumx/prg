void main() {
  String[][] oldCalendar = new String[31][24];
  oldCalendar[4 - 1][14] = "Vorlesung"; // 4. Tag, 14 Uhr

  // 1. Versuch: Referenz kopieren
  String[][] newCalendar = oldCalendar;

  newCalendar[4 - 1][14] = "Seminar";

  // erwartete Ausgabe: Vorlesung
  System.out.println(oldCalendar[4 - 1][14]);

  // erwartete Ausgabe: Seminar
  System.out.println(newCalendar[4 - 1][14]);

  // Erklärung:
  // Es wurde nur die Referenz kopiert.
  // Beide Kalender-Arrays zeigen auf dieselbe Speicheradresse:
  System.out.println(oldCalendar == newCalendar);
}
