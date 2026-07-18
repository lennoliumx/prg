package code23;

public class EmployeeMain {

  public static void main(String[] args) {
    Employee uli = new Employee("Uli");
    Employee yves = new Employee("Yves");
    Employee sam = new Employee("Sam", uli, yves);
    Employee kim = new Employee("Kim");
    Employee maxi = new Employee("Maxi", kim);
    Employee toni = new Employee("Toni");
    Employee chris = new Employee("Chris");
    Employee flo = new Employee("Flo", maxi, toni, chris);
    Employee alex = new Employee("Alex", sam, flo);

    Employee[] allEmployees = {uli, yves, sam, kim, maxi, toni, flo, alex};
    for (Employee employee : allEmployees) {
      System.out.println(employee);
    }
    System.out.println("==============");
    printWithSubordinates(alex, 0);
  }

  public static void printWithSubordinates(Employee employee, int level) {
    System.out.println(" ".repeat(level * 4) + employee);
    if (employee.getSubordinates() != null) {
      for (Employee subordinate : employee.getSubordinates()) {
        printWithSubordinates(subordinate, level + 1);
      }
    }
  }
}
