package code17.wc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Database {

  List<NationalTeam> teams = new ArrayList<>();

  public void readPlayerFile(String fileName) throws FileNotFoundException {
    File playerFile = new File(fileName);
    Scanner scanner = new Scanner(playerFile);
    scanner.useDelimiter("\n");
    // Erste Zeile enthält Definition der Spalten, soll beim Einlesen ignoriert werden
    scanner.nextLine();
    // Jetzt Einlesen, der Spieler, Zeile für Zeile
    String lastTeamName = "";
    NationalTeam team = null;
    while (scanner.hasNextLine()) {
      String lineToParse = scanner.nextLine();
      // Jede Eigenschaft eines Spielers ist durch ein Tab getrennt, deswegen "\t" als Separator
      String[] columns = lineToParse.split("\t");
      String country = columns[1];
      if (!country.equals(lastTeamName)) {
        lastTeamName = country;
        team = new NationalTeam(country);
        teams.add(team);
      }

      Position position = Position.valueOf(columns[2]);
      String name = columns[3];
      Player player = new Player(name, team, position);
      team.addPlayer(Integer.valueOf(columns[0]), player);
    }
  }

  public void readStaffFile(String fileName) throws FileNotFoundException {
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
      NationalTeam team = searchTeam(country);
      if (team != null) {
        Rolle rolle = Rolle.fromLabel(columns[4]);
        String name = columns[2];
        Staff staff = new Staff(name, team, rolle);
        team.addStaff(Integer.valueOf(columns[0]), staff);
      } else {
        System.out.println("Unknown team: " + country);
      }
    }
  }

  NationalTeam searchTeam(String name) {
    for (NationalTeam team : teams) {
      if (team.getCountry().toLowerCase().equals(name.toLowerCase())) {
        return team;
      }
    }
    return null;
  }

  public Person searchPerson(String name) {
    for (NationalTeam team : teams) {
      Person result = team.searchMember(name);
      if (result != null) {
        return result;
      }
    }
    return null;
  }
}