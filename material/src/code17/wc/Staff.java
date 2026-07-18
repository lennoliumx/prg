package code17.wc;

public class Staff extends Person {
  private Rolle role;

  public Staff(String name, NationalTeam arbeitetFuer, Rolle role) {
    super(name, arbeitetFuer);
    this.role = role;
  }
  public Rolle getRole() {
    return role;
  }

  public void setRole(Rolle role) {
    this.role = role;
  }

  @Override
  public String toString() {
    return "Staff{" +
            "name='" + this.name + '\'' +
            ", arbeitetFuer=" + this.team +
            ", role=" + this.role +
            '}';
  }
}
