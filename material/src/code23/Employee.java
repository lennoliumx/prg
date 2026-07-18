package code23;

public class Employee {

  private String name;
  private Employee[] subordinates;

  public Employee(String name, Employee... subordinates) {
    this.name = name;
    this.subordinates = subordinates;
  }

  public String getName() {
    return name;
  }

  public Employee[] getSubordinates() {
    return subordinates;
  }

  @Override
  public String toString() {
    if (subordinates != null && subordinates.length > 0) {
      return name + " (Boss)";
    }
    return name + " (Employee)";
  }
}
