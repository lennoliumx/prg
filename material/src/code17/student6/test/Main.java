package code17.student6.test;

import code17.student6.HTWGStudent;

public class Main {
  public static void main(String[] args) {
    System.out.println("Max (als Person):");
    Person max = new Person("Max Mustermann", "max@example.org");
    System.out.println(max);
    System.out.println(max.hasValidEmail());
    System.out.println();
    System.out.println("Max (als HTWGStudent):");
    HTWGStudent maxStudent = new HTWGStudent("Max Mustermann", "max@example.org", -1);
    System.out.println(maxStudent);
    System.out.println(maxStudent.hasValidEmail());
    System.out.println();
    System.out.println("Beate (als HTWGStudent):");
    HTWGStudent beate = new HTWGStudent("Beate Beispiel", "be123bei@htwg-konstanz.de", 123456);
    System.out.println(beate);
    System.out.println(beate.hasValidEmail());
  }
}
