void main() throws IOException {
  // Das hier kann man ausführen, um sich Informationen über das aktuelle Verzeichnis
  // ausgeben zu lassen, in dem IntelliJ das Programm ausführt. Wie man sieht, ist das
  // der Ordner mit dem Projekt.
//        Path currentDirectory = Paths.get(".");
//        System.out.println(currentDirectory);
//        System.out.println(currentDirectory.toAbsolutePath());

  // Diese Datei wollen wir einlesen.
  Path composersFile = Paths.get("src/code10/composers.csv");
//        System.out.println(composersFile.toAbsolutePath());
//        System.out.println(Files.exists(composersFile));

  // Mit dem Scanner können wir das Stück für Stück tun (z.B. zeilenweise über .nextLine())
  Scanner fileScanner = new Scanner(composersFile, "UTF-8");

  // In dieser Variable zählen wir die Zeilen mit
  int lineNumber = 1;

  // hasNextLine() liefert true zurück, wenn es noch eine Zeile
  // gibt, die wir noch nicht eingelesen haben.
  while (fileScanner.hasNextLine()) {
    String line = fileScanner.nextLine();
    System.out.println(lineNumber + ": " + line);
    lineNumber++;
  }

  // Es ist wichtig, den Scanner zu schließen, da ansonsten die Dateiressourcen
  // nicht richtig freigegeben werden.
  fileScanner.close();
}
