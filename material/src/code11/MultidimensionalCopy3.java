package code11;

public class MultidimensionalCopy3 {

  public static void main(String[] args) {
    String[][] oldCalendar = new String[31][24];
    oldCalendar[4 - 1][14] = "Vorlesung";

    // 3. Versuch: Tiefe Kopie mit Schleife
    String[][] newCalendar = new String[31][24];
    for (int day = 0; day < newCalendar.length; day++) {
      for (int hour = 0; hour < newCalendar[day].length; hour++) {
        newCalendar[day][hour] = oldCalendar[day][hour];
      }
    }

    newCalendar[4 - 1][14] = "Seminar";

    // erwartete Ausgabe: Vorlesung
    System.out.println(oldCalendar[4 - 1][14]);

    // erwartete Ausgabe: Seminar
    System.out.println(newCalendar[4 - 1][14]);

    // Erklärung:
    // Jetzt klappt es! Denn: Das äußere Array wurde geklont,
    // d.h. wir haben hier unterschiedliche Speicheradressen:
    System.out.println(oldCalendar == newCalendar);

    // Und auch die inneren Arrays innerArrayOld und innerArrayNew
    // haben unterschiedliche Speicheradressen, wurde also
    // tief kopiert:
    String[] innerArrayOld = oldCalendar[4 - 1];
    String[] innerArrayNew = newCalendar[4 - 1];
    System.out.println(innerArrayOld == innerArrayNew);
  }
}
