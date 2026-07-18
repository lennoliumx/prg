package code18;

import java.util.ArrayList;
import java.util.List;

public class Database {

  private final List<NationalTeam> teams = new ArrayList<>();
  private final List<Person> persons = new ArrayList<>();


  public void addTeam(NationalTeam team) {
    teams.add(team);
  }

  public void addPerson(Person person) {
    persons.add(person);
  }

  public NationalTeam searchTeam(String name) {
    for (NationalTeam team : teams) {
      if (team.getCountry().equalsIgnoreCase(name)) {
        return team;
      }
    }
    return null;
  }

  public void searchPerson(String name) {
    boolean found = false;
    String nameLowerCase = name.toLowerCase();
    for (Person person : persons) {
      if (person.getName().toLowerCase().contains(nameLowerCase)) {
        found = true;
        String output = person.niceString();
        if (person instanceof Player) {
          System.out.println("Spieler: ");
        }
        if (person instanceof Staff) {
          System.out.println("Staff: ");
        }
        System.out.println(output);
      }
    }
    if (!found) {
      System.out.println("Kein Ergebniss!");
    }
  }
}