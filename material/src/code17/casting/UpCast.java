package code17.casting;

import code17.student7.HTWGStudent;
import code17.student7.Person;
import code17.student7.Student;

public class UpCast {

  public static void main(String[] args) {
    Student student = new Student("name", "email", 123);
    Person person1 = student;

    // oder direkt
    Person person2 = new Student("name", "email", 123);

    // weiteres Beispiel:
    Student student2 = new HTWGStudent("name", "email", 123);

    // mehrere Ebenen
    Person person3 = new HTWGStudent("name", "email", 123);

    // umgekehrt geht es nicht: Compiler-Fehler
//        Student studentWrong = new Person("name", "email");
  }
}
