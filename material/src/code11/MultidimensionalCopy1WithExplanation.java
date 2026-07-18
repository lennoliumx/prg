void main() {
  final int DAYS_PER_MONTH = 31;
  final int HOURS_PER_DAY = 24;
  String[][] oldCalendar = new String[DAYS_PER_MONTH][HOURS_PER_DAY];
  System.out.println("Termin in oldCalendar setzen");
  oldCalendar[4 - 1][14] = "Vorlesung";
  System.out.println("oldCalendar, 4. Tag, 14-Uhr-Termin: " + oldCalendar[4 - 1][14]);

  String[][] newCalendar;
  System.out.println("Kalender kopieren: oldCalendar -> new Calendar");

  // 1. Versuch: Feldreferenz zuweisen
  System.out.println("1. Versuch: Feldreferenz zuweisen");
  newCalendar = oldCalendar;

  System.out.println("newCalendar, 4. Tag, 14-Uhr-Termin: " + newCalendar[4 - 1][14]);

  // Nur newCalendar ändern
  System.out.println("Jetzt Termin in newCalendar setzen");
  newCalendar[4 - 1][14] = "Seminar";
  System.out.println("oldCalendar, 4. Tag, 14-Uhr-Termin: " + oldCalendar[4 - 1][14]);
  System.out.println("newCalendar, 4. Tag, 14-Uhr-Termin: " + newCalendar[4 - 1][14]);
}
