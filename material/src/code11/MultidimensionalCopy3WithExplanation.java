package code11;

public class MultidimensionalCopy3WithExplanation {

  public static void main(String[] args) {
    final int DAYS_PER_MONTH = 31;
    final int HOURS_PER_DAY = 24;
    String[][] oldCalendar = new String[DAYS_PER_MONTH][HOURS_PER_DAY];
    System.out.println("Termin in oldCalendar setzen");
    oldCalendar[4 - 1][14] = "Vorlesung";
    System.out.println("oldCalendar, 4. Tag, 14-Uhr-Termin: " + oldCalendar[4 - 1][14]);

    String[][] newCalendar = new String[31][24];
    System.out.println("Kalender kopieren: oldCalendar -> new Calendar");

    // 3. Versuch: Tiefe Kopie mit Schleife
    System.out.println("3. Versuch: Tiefe Kopie mit Schleife");
    for (int day = 0; day < newCalendar.length; day++) {
      for (int hour = 0; hour < newCalendar[day].length; hour++) {
        newCalendar[day][hour] = oldCalendar[day][hour];
      }
    }

    System.out.println("newCalendar, 4. Tag, 14-Uhr-Termin: " + newCalendar[4 - 1][14]);

    // Nur newCalendar ändern
    System.out.println("Jetzt Termin in newCalendar setzen");
    newCalendar[4 - 1][14] = "Seminar";
    System.out.println("oldCalendar, 4. Tag, 14-Uhr-Termin: " + oldCalendar[4 - 1][14]);
    System.out.println("newCalendar, 4. Tag, 14-Uhr-Termin: " + newCalendar[4 - 1][14]);
  }
}
