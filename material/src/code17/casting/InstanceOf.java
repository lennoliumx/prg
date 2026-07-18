package code17.casting;

import code17.student7.Person;
import code17.student7.Student;

public class InstanceOf {

  public static void main(String[] args) {
    Person person = new Person("name", "email");
//        Person person = new Student("name", "email", 123);
//        Person person = new HTWGStudent("name", "email", 456);

//        System.out.println(person.mnr);

    if (person instanceof Student) {
      Student student = (Student) person;
      System.out.println(student.mnr);
    }
  }
}
