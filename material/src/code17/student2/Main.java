package code17.student2;

public class Main {
  public static void main(String[] args) {
    Person max = new Person();
    max.name = "Max";
    max.email = "max@example.org";
    System.out.println(max.hasValidEmail());
    // Compiler-Fehler
//        System.out.println(max.hasValidMnr());

    Student beate = new Student();
    beate.name = "Beate";
//        beate.email = null;
    beate.email = "beate@example.org";
    beate.mnr = 123456;
    System.out.println(beate.hasValidEmail());
    System.out.println(beate.hasValidMnr());

//        System.out.println();
//        beate.mnr = -1;
//        beate.email = "test(ät)example";
//        System.out.println(beate.hasValidEmail());
//        System.out.println(beate.hasValidMnr());

  }
}
