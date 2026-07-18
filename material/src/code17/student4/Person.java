package code17.student4;

public class Person {
  public String name;
  public String email;

  public Person(String name, String email) {
    System.out.println("Person Konstrauktor aufgerufen");
    this.name = name;
    this.email = email;
  }

  public boolean hasValidEmail() {
    return this.email != null && this.email.contains("@");
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + this.name + '\'' +
            ", email='" + this.email + '\'' +
            '}';
  }
}
