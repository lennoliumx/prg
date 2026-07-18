package code17.student5;

public class Person {
  public String name;
  public String email;

  public Person(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public boolean hasValidEmail() {
    return this.email != null && this.email.contains("@");
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", email='" + email + '\'' +
            '}';
  }
}
