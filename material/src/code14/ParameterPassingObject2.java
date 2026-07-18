package code14;

public class ParameterPassingObject2 {

  public static void doSomething(Person personParam) {
    personParam.name = "Pia";
    personParam.age = 22;
  }

  public static void main(String[] args) {
    Person personMain = new Person();
    personMain.name = "Paul";
    personMain.age = 42;

    doSomething(personMain);
    System.out.println(personMain.name + ", " + personMain.age);
  }
}
