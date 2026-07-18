package code14;

public class PersonExample {

  static void makeOld(Person p) {
    p.age = 100;
  }

  public static void main(String[] args) {
    Person max = new Person();
    max.name = "Max";
    max.age = 20;

    System.out.println(max.age);
    makeOld(max);
    System.out.println(max.age);

  }
}
