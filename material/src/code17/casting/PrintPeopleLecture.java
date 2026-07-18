package code17.casting;

import code17.student7.HTWGStudent;
import code17.student7.Person;
import code17.student7.Student;

public class PrintPeopleLecture {

  public static void main(String[] args) {
    Person max = new Person("Max Muster", "max@example.org");
    Person alex = new Person("Alex Schwarz", "alex@example.org");
    Student beate = new Student("Beate Beispiel", "bbeisp123@uni-konstanz.de", 123456);
    HTWGStudent chris = new HTWGStudent("Chris Potter", "ch321pot@htwg-konstanz.de", 654322);

    Person[] people = {max, alex, beate, chris};
    for (Person person : people) {
      System.out.print(person.name);
      // person instanceof Student ist auch "true"
      // für HTWGStudent-Instanzen! (siehe Ausgabe von Chris)
      if (person instanceof Student) {
        Student student = (Student) person;
        System.out.println(" (" + student.mnr + ")");
      } else {
        System.out.println();
      }
    }
  }
}
