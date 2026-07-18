package code17.student1;

public class Main {
  public static void main(String[] args) {
    Person max = new Person();
    max.name = "Max";
    max.email = "max@example.org";
    // Compiler-Fehler
//        max.mnr = 123456;

    Student beate = new Student();
    beate.name = "Beate";
    beate.email = "beate@example.org";
    beate.mnr = 123456;
  }
}
