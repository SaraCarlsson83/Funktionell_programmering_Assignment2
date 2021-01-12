import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sara Carlsson
 * Date: 05/01/2021
 * Time:11:53
 * Project: Assignment2
 * Copywright: MIT
 */
public class Employee {
    private String name;
    private List<Employee> employeeList;

    public Employee(String name) {
        this.name = name;
        this.employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        this.employeeList.add(employee);
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

}
