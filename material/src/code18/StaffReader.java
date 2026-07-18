package code18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StaffReader {
  public void readFile(Database database, String fileName) throws FileNotFoundException {
    File playerFile = new File(fileName);
    Scanner scanner = new Scanner(playerFile);
    scanner.useDelimiter("\n");
    // Erste Zeile enthält Definition der Spalten, soll beim Einlesen ignoriert werden
    scanner.nextLine();
    while (scanner.hasNextLine()) {
      String lineToParse = scanner.nextLine();
      // Jede Eigenschaft eines Spielers ist durch ein Tab getrennt, deswegen "\t" als Separator
      String[] columns = lineToParse.split(";");
      String country = columns[1];
      NationalTeam team = database.searchTeam(country);
      if (team == null) {
        team = new NationalTeam(country);
        database.addTeam(team);
      }
      Rolle rolle = Rolle.fromLabel(columns[4]);
      String name = columns[2];
      Staff staff = new Staff(name, team, rolle);
      database.addPerson(staff);
    }
  }
}
