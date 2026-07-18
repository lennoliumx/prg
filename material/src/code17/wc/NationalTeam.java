package code17.wc;

import java.util.ArrayList;
import java.util.List;

public class NationalTeam {
  private String country;
  private Player[] player;
  private Staff[] staff;
  private List<Person> members = new ArrayList<>();

  public NationalTeam(String country) {
    this.country = country;
    this.player = new Player[26];
    this.staff = new Staff[30];
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public void addPlayer(int position, Player player) {
    if (position >= 0 && position < 27) {
      this.player[position - 1] = player;
    }
    members.add(player);
  }

  public void addStaff(int pos, Staff member) {
    if (pos > 0 && pos <= 30) {
      staff[pos] = member;
    }
    members.add(member);
  }

  public Person searchMember(String name) {
    for (Person p : members) {
      if (p != null && p.getName().toLowerCase().contains(name.toLowerCase())) {
        return p;
      }
    }
    return null;
  }

  @Override
  public String toString() {
    return "NationalTeam: " + country + '\n';
  }
}
