package code17.student7;

public class HTWGStudent extends Student {

  public HTWGStudent(String name, String email, int mnr) {
    super(name, email, mnr);
  }

  public boolean hasValidEmail() {
    return super.hasValidEmail()
            && this.email.endsWith("htwg-konstanz.de");
  }

  @Override
  public String toString() {
    return "HTWGStudent{" +
            "mnr=" + mnr +
            ", name='" + name + '\'' +
            ", email='" + email + '\'' +
            '}';
  }
}
