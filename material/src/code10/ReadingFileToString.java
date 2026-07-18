void main(String[] args) throws IOException {
  Path composersFile = Paths.get("./src/code11/composers.csv");
  String content = Files.readString(composersFile, StandardCharsets.UTF_8);
  // Jetzt steht in content der gesamte Dateiinhalt
  System.out.println(content);

  // Wir können in dem String jetzt z.B. suchen, ob "Bach" vorkommt:
  System.out.println("Die Datei enthält 'Bach': " + content.contains("Bach"));

  // Außerdem kann man den ganzen String in einzelne Zeilen zerlegen, indem man
  // ihn anhand des Zeilenumbruchs (Sonderzeichen '\n') aufsplittet:
  String[] lines = content.split("\n");
  System.out.println("3. Zeile: " + lines[2]);

  // Übungsaufgabe für Sie: Kopieren Sie ReadingFiles3 zu ReadingFiles4 und schreiben
  // Sie den Code in ReadingFiles4 so um, dass der Zeilen-Scanner durch Einlesen
  // des gesamten Inhalts und Aufteilen über .split("\n") ersetzt wird.
}
