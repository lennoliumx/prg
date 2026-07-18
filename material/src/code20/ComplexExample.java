package code20;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.Scanner;

public class ComplexExample {

  // In dieser Methode wird eine NullPointerException geworfen.
  // Da es sich dabei um eine unchecked Exception (RuntimeException)
  // handelt, muss sie nicht in der Methodendeklaration angegeben werden
  // und auch in getBirthYearOfFirstComposer behandelt werden,
  // wo sie aufgerufen wird
  static void checkNotNull(String string) {
    if (string == null) {
      throw new NullPointerException("string must not be null");
    }
  }

  // Diese Methode liest die erste Zeile einer Datei mit dem Scanner.
  // Der finally-Block stellt sicher, dass der Scanner auf jeden Fall
  // geschlossen wird.
  // Wie man sieht, geht auch try ohne catch nur mit finally.
  // Die IOException, die bei new Scanner(...) auftreten kann,
  // wird über die Methodendeklaration ("throws IOException") an
  // den Aufrufer der Methode weitergeleitet
  static String readFirstLineOfFile(String fileName) throws IOException {
    Scanner scanner = null;
    try {
      scanner = new Scanner(Paths.get(fileName), StandardCharsets.UTF_8);
      String firstLine = scanner.nextLine();
      return firstLine;
    } finally {
      System.out.println("scanner wird geschlossen");
      if (scanner != null) {
        scanner.close();
      }
    }
  }

  // Hier wird das Geburtsjahr aus einem Eintrag herausgelesen (eine Zeile)
  // Falls das Format nicht stimmt, wird eine ParseException geworfen.
  // Da ParseException eine checked Exception ist, muss sie in der
  // Methodendeklaration angegeben werden ("throws ParseException").
  static int getBirthYear(String composerEntry) throws ParseException {
    Scanner scanner = new Scanner(composerEntry).useDelimiter(";");
    if (!scanner.hasNextInt()) {
      throw new ParseException("Could not parse composerEntry", 0);
    }
    return scanner.nextInt();
  }

  // Diese Methode benutzt nacheinander die obigen Methoden.
  // Es können die beiden checked Exceptions "IOException" und "ParseException"
  // auftreten, die über die Methodendeklaration weitergeworfen werden.
  static int getBirthYearOfFirstComposer(String fileName) throws IOException, ParseException {
    checkNotNull(fileName);
    String firstEntry = readFirstLineOfFile(fileName);
    int birthYear = getBirthYear(firstEntry);
    return birthYear;
  }

  // Hier wird getBirthYearOfFirstComposer getestet. Testen Sie auch
  // die beiden auskommentierten Aufrufe!
  public static void main(String[] args) {
    int birthYearOfFirstComposer = -1;
    try {
      birthYearOfFirstComposer = getBirthYearOfFirstComposer(null);
//            birthYearOfFirstComposer = getBirthYearOfFirstComposer("composers_wrong.csv");
//            birthYearOfFirstComposer = getBirthYearOfFirstComposer("composers.csv");
      System.out.println(birthYearOfFirstComposer);
    } catch (IOException e) {
      System.out.println("Dateifehler");
      e.printStackTrace();
    } catch (ParseException e) {
      System.out.println("Dateiinhalt ungültig");
      e.printStackTrace();
    }
    System.out.println("Geburtsjahr des ersten Komponisten: " + birthYearOfFirstComposer);
  }
}
