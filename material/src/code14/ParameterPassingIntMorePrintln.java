package code14;

public class ParameterPassingIntMorePrintln {

  public static void doSomething(int intParam) {
    System.out.println("    intParam in method before: " + intParam);
    intParam = 11;
    System.out.println("    intParam in method after: " + intParam);
  }

  public static void main(String[] args) {
    int intMain = 42;
    System.out.println("intMain in main before method call: " + intMain);
    doSomething(intMain);
    System.out.println("intMain in main after method call: " + intMain);

//        System.out.println("==============================================================");
//
//        int[] myIntArray = {42, 24};
//        System.out.println("myIntArray[0] in main before method call: " + myIntArray[0]);
//        doSomething(myIntArray[0]);
//        System.out.println("myIntArray[0] in main after method call: " + myIntArray[0]);
//
//        System.out.println("==============================================================");
//
//        Person person = new Person();
//        person.name = "Johannes";
//        person.age = 42;
//        System.out.println("person.age in main before method call: " + person.age);
//        doSomething(person.age);
//        System.out.println("person.age in main after method call: " + person.age);
  }
}
