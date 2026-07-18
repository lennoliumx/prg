package code14;

public class ParameterPassingObject1MorePrintln {

  public static void doSomething(Person personParam) {
    System.out.println("    person's name and age in method before: "
            + personParam.name + ", " + personParam.age);
    personParam = new Person();
    personParam.name = "Pia";
    personParam.age = 22;
    System.out.println("    person's name and age in method after: "
            + personParam.name + ", " + personParam.age);
  }

  public static void main(String[] args) {
    Person personMain = new Person();
    personMain.name = "Paul";
    personMain.age = 42;

    System.out.println("person's name and age in main before method call: "
            + personMain.name + ", " + personMain.age);
    doSomething(personMain);
    System.out.println("person's name and age in main after method call: "
            + personMain.name + ", " + personMain.age);
  }
}
