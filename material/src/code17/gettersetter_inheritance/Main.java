package code17.gettersetter_inheritance;

public class Main {
  public static void main(String[] args) {
    Person max = new Person("Max", "max@example.org");
    Student beate = new Student("Beate", "beate@example.org", 123456);
    System.out.println(max);
    System.out.println(beate);
  }
}
