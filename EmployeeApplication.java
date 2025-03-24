import java.util.ArrayList;
import java.util.List;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Id: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class EmployeeApplication {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Ram", 53000));
        employees.add(new Employee(2, "Shyam", 66000));
        employees.add(new Employee(3, "Ramesh", 50000));

        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
