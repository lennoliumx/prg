package code17.casting;

import code17.student7.HTWGStudent;
import code17.student7.Person;
import code17.student7.Student;

public class CountStudents {

  public static void main(String[] args) {
    Person max = new Person("Max Muster", "max@example.org");
    Person alex = new Person("Alex Schwarz", "alex@example.org");
    Student beate = new Student("Beate Beispiel", "bbeisp123@uni-konstanz.de", 123456);
    HTWGStudent chris = new HTWGStudent("Chris Potter", "ch321pot@htwg-konstanz.de", 654322);

    Person[] people = {max, alex, beate, chris};
    int count = 0;
    for (Person person : people) {
      if (person instanceof Student) {
        count++;
        Student student = (Student) person;
        System.out.println(student.mnr);
      }
    }
    System.out.printf("%d students%n", count);
  }
}
