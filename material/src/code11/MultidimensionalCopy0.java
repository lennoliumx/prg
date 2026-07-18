void main() {
  String[][] oldCalendar = new String[31][24];
  oldCalendar[4 - 1][14] = "Vorlesung"; // 4. Tag, 14 Uhr

  String[][] newCalendar = null; //??? (Kopie erstellen)

  newCalendar[4 - 1][14] = "Seminar";

  // erwartete Ausgabe: Vorlesung
  System.out.println(oldCalendar[4 - 1][14]);

  // erwartete Ausgabe: Seminar
  System.out.println(newCalendar[4 - 1][14]);
}
