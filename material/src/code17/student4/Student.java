package code17.student4;

public class Student extends Person {
  public int mnr;

  public Student(String name, String email, int mnr) {
    super(name, email);
    System.out.println("Student Konstrauktor aufgerufen");
    this.mnr = mnr;
  }

  public boolean hasValidMnr() {
    return this.mnr > 0;
  }

  @Override
  public String toString() {
    return "Student{" +
            "name='" + this.name + '\'' +
            ", email='" + this.email + '\'' +
            ", mnr=" + this.mnr +
            '}';
  }
}
