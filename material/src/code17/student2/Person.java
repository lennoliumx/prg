package code17.student2;

public class Person {
  public String name;
  public String email;

  public boolean hasValidEmail() {
    return this.email != null && this.email.contains("@");
  }
}

