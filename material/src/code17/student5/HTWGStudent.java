package code17.student5;

public class HTWGStudent extends Person {
  public int mnr;

  public HTWGStudent(String name, String email, int mnr) {
    super(name, email);
    this.mnr = mnr;
  }

  public boolean hasValidMnr() {
    return this.mnr > 0;
  }

  public boolean hasValidEmail() {
    return this.email != null
            && this.email.contains("@")
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
