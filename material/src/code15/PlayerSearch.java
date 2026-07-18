package code15;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class PlayerSearch {

  public static void main(String[] args) throws IOException {
    Scanner eingabe = new Scanner(System.in);
    System.out.print("Dateiname (src/code15/WorldCup2026.csv)?");
    String fname = eingabe.nextLine();
    if (fname.length() == 0) {
      fname = "src/code15/WorldCup2026.csv";
    }
    PlayerDatabaseArray playerDatabase = new PlayerDatabaseArray();
    //PlayerDatabaseList playerDatabase = new PlayerDatabaseList();
    playerDatabase.readFile(fname);
    boolean repeat = true;
    while (repeat) {
      System.out.print("Verein? ");
      String verein = eingabe.nextLine();
      if (verein.length() == 0) break;
      Player[] spielerVerein = playerDatabase.searchVerein(verein);
      for (Player spieler : spielerVerein) {
        if (spieler != null) {
          System.out.println("Spieler: " + spieler);
        }
      }
    }
  }
}
