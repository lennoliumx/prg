package code17.wc;

public class Person {
  protected String name;
  protected NationalTeam team;

  public Person(String name, NationalTeam team) {
    this.name = name;
    this.team = team;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NationalTeam getTeam() {
    return team;
  }

  public void setTeam(NationalTeam team) {
    this.team = team;
  }

  public String niceString() {
    return this.name + "(" + this.getTeam().getCountry() + ")";
  }
}
