package code17.student6.test;

public class Person {
  protected String name;
  protected String email;

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
