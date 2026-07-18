package code18;


import java.io.IOException;
import java.util.Scanner;

public class Search {

  static void main(String[] args) throws IOException {
    Scanner eingabe = new Scanner(System.in);
    Database database = new Database();
    StaffReader staffReader = new StaffReader();
    staffReader.readFile(database, "src/code18/wm2026_nationalteam_staff_numbered.csv");
    PlayerReader playerReader = new PlayerReader();
    playerReader.readFile(database, "src/code18/wm2026_players.csv");

    boolean repeat = true;
    while (repeat) {
      System.out.print("Name? ");
      String name = eingabe.nextLine();
      if (name.length() == 0) {
        break;
      }
      database.searchPerson(name);
    }
  }
}
