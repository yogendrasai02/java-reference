class Employee {
  private String name;
  private double salary;

  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  public String getName() {
    return this.name;
  }

  public double getSalary() {
    return this.salary;
  }

  public String getDetails() {
    return "Name: %s, Salary: %s".formatted(this.name, this.salary);
  }
}

class Manager extends Employee {
  private String department;

  public Manager(String name, double salary, String department) {
    super(name, salary);
    this.department = department;
  }

  public String getDetails() {
    String name = super.getName();
    double salary = super.getSalary();
    return "Name: %s, Salary: %s, Department: %s".formatted(name, salary, this.department);
  }
}

public class Exercise {
  public static void main(String[] args) {
    Employee emp = new Employee("Alice", 50000.0);
    Employee mgr = new Manager("Bob", 80000.0, "IT");
    System.out.println(emp.getDetails());
    System.out.println(mgr.getDetails());
  }
}
