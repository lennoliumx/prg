package code17.gettersetter_inheritance;

public class Student extends Person {
  private int mnr;

  public Student(String name, String email, int mnr) {
    super(name, email);
    this.mnr = mnr;
  }

  public int getMnr() {
    return this.mnr;
  }

  public void setMnr(int mnr) {
    this.mnr = mnr;
  }

  @Override
  public String toString() {
    return "Student{" +
            // hier können wir direkt auf die Attribute
            // der Oberklasse zugreifen,
            // weil sie protected sind
            "name='" + this.name + '\'' +
            ", email='" + this.email + '\'' +
            ", mnr=" + this.mnr +
            '}';
  }
}