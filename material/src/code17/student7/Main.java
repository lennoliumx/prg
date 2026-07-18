package code17.student7;

public class Main {
  public static void main(String[] args) {
    System.out.println("Max (als Person):");
    Person max = new Person("Max Mustermann", "max@example.org");
    System.out.println(max);
    System.out.println(max.hasValidEmail());
    System.out.println();
    System.out.println("Max (als Student):");
    Student maxStudent = new Student("Max Mustermann", "max@example.org", -1);
    System.out.println(maxStudent);
    System.out.println(maxStudent.hasValidEmail());
    System.out.println();
    System.out.println("Max (als HTWGStudent):");
    HTWGStudent maxHtwgStudent = new HTWGStudent("Max Mustermann", "max@example.org", -1);
    System.out.println(maxHtwgStudent);
    System.out.println(maxHtwgStudent.hasValidEmail());
    System.out.println();
    System.out.println("Beate (als HTWGStudent):");
    HTWGStudent beate = new HTWGStudent("Beate Beispiel", "be123bei@htwg-konstanz.de", 123456);
    System.out.println(beate);
    System.out.println(beate.hasValidEmail());
  }
}
