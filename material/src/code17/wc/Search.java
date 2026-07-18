package code17.wc;


import java.io.IOException;
import java.util.Scanner;

public class Search {

  static void main(String[] args) throws IOException {
    Scanner eingabe = new Scanner(System.in);
    Database database = new Database();
    database.readPlayerFile("src/code17/wc/wm2026_players.csv");
    database.readStaffFile("src/code17/wc/wm2026_nationalteam_staff_numbered.csv");
    boolean repeat = true;
    while (repeat) {
      System.out.print("Name? ");
      String name = eingabe.nextLine();
      Person person = database.searchPerson(name);
      if (person != null) {
        if (person instanceof Player) {
          System.out.println("Spieler: ");
        }
        if (person instanceof Staff) {
          System.out.println("Staff: ");
        }
        System.out.println(person.niceString());
      } else {
        System.out.println("Kein Ergebniss!");
      }
    }
  }
}
