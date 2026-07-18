void main() {
  // Name, Alter, Note einlesen und Zertifikat ausgeben
  Scanner scanner = new Scanner(System.in); // Scanner wird initialisiert
  // Wenn man das weglässt, kann man keinen Namen mit Leerzeichen eingeben,
  // weil das für den Scanner dann schon ein neues "Token" ist
  scanner.useDelimiter("\n");
  // deutsche Eingabe, also Kommazahlen mit ","
  scanner.useLocale(Locale.GERMANY);

  System.out.println("Zertifikatsgenerator");
  System.out.println("====================");
  System.out.println();
  System.out.print("Bitte Name eingeben: ");
  String name = scanner.next();
  System.out.print("Bitte Alter eingeben: ");
  int age = scanner.nextInt();
  System.out.print("Bitte Note eingeben: ");
  double grade = scanner.nextDouble();

  System.out.printf("""
          ===============================================
          EPR-Scanner-Zertifikat
          
          Hiermit wird 
          -= %s (Alter %d) =- 
          bestätigt, dass er/sie den Umgang mit Scanner 
          -= mit der Note %.1f =- 
          beherrscht.
          ===============================================
          """, name, age, grade);

  scanner.close();
}
