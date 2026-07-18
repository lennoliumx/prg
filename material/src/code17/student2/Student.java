package code17.student2;

public class Student extends Person {
  public int mnr;

  public boolean hasValidMnr() {
    return this.mnr > 0;
  }
}
