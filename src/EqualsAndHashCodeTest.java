import java.util.HashSet;

public class EqualsAndHashCodeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("srini", 29);
        Employee employee1 = new Employee("srini", 25);
        Employee employee2 = new Employee("srini", 29);

        HashSet<Employee> employees = new HashSet<Employee>();
        employees.add(employee);
        System.out.println(employees.contains(employee2));
        System.out.println("employee.hashCode():  " + employee.hashCode()
        + " \nemployee2.hashCode():" + employee2.hashCode());
    }
}