package code17.student3;

public class Student extends Person {
  public int mnr;

  public Student() {
    System.out.println("Student-Konstruktor aufgerufen");
  }

  public boolean hasValidMnr() {
    return this.mnr > 0;
  }
}
