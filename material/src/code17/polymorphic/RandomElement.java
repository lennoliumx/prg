package code17.polymorphic;

import code17.student7.HTWGStudent;
import code17.student7.Person;
import code17.student7.Student;

public class RandomElement {

  public static void main(String[] args) {

    Person[] people = {
            new Person("Alex Schwarz", "alex@example.org"),
            new Student("Beate Beispiel", "bbeisp123@uni-konstanz.de", 123456),
            new HTWGStudent("Chris Potter", "ch321pot@xxxxx-konstanz.de", 654322)
    };

    // random int between 0 and people.length-1
    int randomIndex = (int) (Math.random() * people.length);
    Person random = people[randomIndex];

    System.out.println(random.toString());
    System.out.println(random.hasValidEmail());
  }
}
