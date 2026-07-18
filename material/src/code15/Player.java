package code15;

public class Player {
  private final String name;
  private String team;
  private String country;

  public Player(String name, String team, String country) {
    this.name = name;
    this.team = team;
    this.country = country;
  }

  public String getName() {
    return name;
  }

  public String getTeam() {
    return team;
  }

  public String getCountry() {
    return country;
  }

  public String toString() {
    return String.format("%s: %s (%s)", this.country, this.name, this.team);
  }
}
