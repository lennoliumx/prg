package code17.student3;

public class Person {
  public String name;
  public String email;

  public Person() {
    System.out.println("Person-Konstruktor aufgerufen");
  }

  public boolean hasValidEmail() {
    return this.email != null && this.email.contains("@");
  }
}
