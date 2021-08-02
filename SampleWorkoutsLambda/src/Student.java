
public class Student extends Teacher {

	public void show(String name) {
		System.out.println(name);
	}
	
	//Overloading should have same return type
	//test commit
	public int calculate(int age) {
		System.out.println("Age");
		return age;
	}
	
	public static void main(String[] args) {
		
		Student student = new Student();
		student.show();
		student.show("Alex");
		student.calculate(10);
		
	}
}

class Teacher {
	public void show() {
		System.out.println("Teacher");
	}
	
	public void calculate(int age) {
		System.out.println("Age");
	}
	
}
