package code17.casting;

import code17.student7.HTWGStudent;
import code17.student7.Person;
import code17.student7.Student;

public class ValidEmail {

  public static void main(String[] args) {
    Person max = new Person("Max Muster", "max@example.org");
    Person alex = new Person("Alex Schwarz", "alexexample.org");
    Student beate = new Student("Beate Beispiel", "bbeisp123@uni-konstanz.de", 123456);
    HTWGStudent chris = new HTWGStudent("Chris Potter", "ch321pot@htwg-konstanz.de", 654322);

    Person[] people = {max, alex, beate, chris};
    boolean valid = true;
    for (Person person : people) {
      System.out.println(person.name + ": " + person.hasValidEmail());
      valid = valid && person.hasValidEmail();
      // Alternativ:
//            if (!person.hasValidEmail()) {
//                valid = false;
//                break;
//            }
    }
    System.out.println("Alle E-Mail-Adressen sind gültig: " + valid);
  }
}
