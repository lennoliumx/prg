package code15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PlayerDatabaseArray {
  // Speichert die Spieler aus der Datei in einem Array
  private final Player[] players = new Player[2000];
  // Anzahl der Spieler die aktuell im Array abgespeichert sind
  // Soll ein neuer Spieler hinzugefügt werden, dann an die Stelle count
  private int countPlayer = 0;

  public void readFile(String fileName) throws FileNotFoundException {
    File playerFile = new File(fileName);
    // Lese die Spieler aus der Datei ein
    // Jeder Spieler ist in einer Zeile, deswegen "\n" als Separator
    Scanner scanner = new Scanner(playerFile);
    scanner.useDelimiter("\n");
    // Erste Zeile enthält Definition der Spalten, soll beim Einlesen ignoriert werden
    scanner.nextLine();
    // Jetzt Einlesen, der Spieler, Zeile für Zeile
    while (scanner.hasNextLine()) {
      String lineToParse = scanner.nextLine();
      // Jede Eigenschaft eines Spielers ist durch ein Tab getrennt, deswegen "\t" als Separator
      String[] columns = lineToParse.split("\t");
      String country = columns[1];
      String name = columns[3];
      String team = columns[8];

      // Erzeuge Spieler und speichere ihn in Array
      Player player = new Player(name, team, country);
      addPlayer(player);
    }
  }

  private void addPlayer(Player player) {
    players[countPlayer] = player;
    countPlayer++;
  }

  public Player[] searchVereinForEach(String searchString) {
    Player[] result = new Player[1000];
    int count = 0;
    for (Player p : players) {
      if (p != null && p.getTeam().contains(searchString)) {
        result[count++] = p;
      }
    }
    return result;
  }

  public Player[] searchVerein(String searchString) {
    Player[] result = new Player[1000];
    int count = 0;
    for (int i = 0; i < countPlayer; i++) {
      if (players[i].getTeam().contains(searchString)) {
        result[count++] = players[i];
      }
    }
    return result;
  }
}