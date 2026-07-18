package code17.casting;

import code17.student7.Person;
import code17.student7.Student;

public class DownCast {

  public static void main(String[] args) {
    // klappt:
    Person person1 = new Student("name", "email", 123);
    // geht nicht:
//        System.out.println(person1.mnr);
    Student student1 = (Student) person1;
    // hier geht es:
    System.out.println(student1.mnr);
    // klappt nicht (1):
    Person person2 = new Person("name", "email");
    // Fehler zur Laufzeit
    Student student2 = (Student) person2;

    // klappt nicht (2)
    Student student3 = new Student("name", "email", 123);
    // Fehler zur Compile-Zeit:
//        String string = (String) student3;
  }
}
