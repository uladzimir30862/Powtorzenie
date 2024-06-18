import java.util.ArrayList;
import java.util.List;

public class Admin extends Employee {
    private List<Employee> employees;

    public Admin(String firstName, String lastName) {
        super(firstName, lastName);
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String firstName, String lastName) {
        employees.add(new Employee(firstName, lastName));
    }

    public void removeEmployee(int employeeId) {
        employees.removeIf(employee -> employee.getEmployeeId() == employeeId);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
