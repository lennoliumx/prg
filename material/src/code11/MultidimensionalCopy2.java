void main() {
  String[][] oldCalendar = new String[31][24];
  oldCalendar[4 - 1][14] = "Vorlesung"; // 4. Tag, 14 Uhr

  // 2. Versuch: Flache Kopie
  String[][] newCalendar = oldCalendar.clone();

  // Alternativen
//        String[][] newCalendar = Arrays.copyOf(oldCalendar, oldCalendar.length);
//        String[][] newCalendar = Arrays.copyOfRange(oldCalendar, 0, oldCalendar.length);
//        String[][] newCalendar = new String[31][24];
//        System.arraycopy(oldCalendar, 0, newCalendar, 0, oldCalendar.length);

  newCalendar[4 - 1][14] = "Seminar";

  // erwartete Ausgabe: Vorlesung
  System.out.println(oldCalendar[4 - 1][14]);

  // erwartete Ausgabe: Seminar
  System.out.println(newCalendar[4 - 1][14]);

  // Erklärung:
  // Das äußere Array wurde zwar geklont,
  // d.h. wir haben hier unterschiedliche Speicheradressen:
  System.out.println(oldCalendar == newCalendar);

  // Aber alle inneren Arrays wurden nicht kopiert.
  // innerArrayOld und innerArrayNew haben dieselbe Speicheradresse:
  String[] innerArrayOld = oldCalendar[4 - 1];
  String[] innerArrayNew = newCalendar[4 - 1];
  System.out.println(innerArrayOld == innerArrayNew);
}
