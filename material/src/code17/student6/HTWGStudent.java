package code17.student6;

import code17.student6.test.Person;

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
