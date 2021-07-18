package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Comparator {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();

		System.out.println("*********Using Lambda**********");
		
		// Adding Products
		list.add(new Employee(1, "HP Laptop", 25000f));
		list.add(new Employee(3, "Keyboard", 300f));
		list.add(new Employee(2, "Dell Mouse", 150f));
		
	    List<Employee> sortedList = list.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
	    sortedList.forEach(e -> System.out.println(e));
	    
	}
}

class Employee {

	int id;
	String name;
	float salary;

	public Employee(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.salary = price;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
