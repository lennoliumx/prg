package code17.student4;

public class Main {
  public static void main(String[] args) {
    System.out.println("Max wird erzeugt:");
    Person max = new Person("Max Mustermann", "max@example.org");
    System.out.println(max);
    System.out.println();
    System.out.println("Beate wird erzeugt:");
    Student beate = new Student("Beate Beispiel", "be123bei@htwg-konstanz.de", 123456);
    System.out.println(beate);
  }
}
