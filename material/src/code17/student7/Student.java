package code17.student7;

public class Student extends Person {

  public int mnr;

  public Student(String name, String email, int mnr) {
    super(name, email);
    this.mnr = mnr;
  }

  public boolean hasValidMnr() {
    return this.mnr > 0;
  }

  @Override
  public String toString() {
    return "Student{" +
            "mnr=" + mnr +
            ", name='" + name + '\'' +
            ", email='" + email + '\'' +
            '}';
  }
}
