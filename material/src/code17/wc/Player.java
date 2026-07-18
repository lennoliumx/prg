package code17.wc;

public class Player extends Person {

  private Position position;
  private int goals;

  public Player(String name, NationalTeam spieltFuer, Position spieltAuf) {
    super(name, spieltFuer);
    this.position = spieltAuf;
    this.goals = 0;
  }


  public Position getPosition() {
    return position;
  }

  public void setPosition(Position position) {
    this.position = position;
  }

  public void addGoal() {
    this.goals++;
  }

  public String niceString() {
    return super.niceString() + " " + this.position;
  }


  @Override
  public String toString() {
    return "Player{" +
            "name='" + this.name + '\'' +
            ", spieltFuer=" + this.team +
            ", spieltAuf=" + this.position +
            ", goals=" + this.goals +
            '}';
  }
}
