
class A{
	
	void printName(){
		System.out.println("Printing from A");
	}
	
} 
class B extends A{
	
	void printName(){
		System.out.println("Printing from subclass  B");
	}
}
public class OverridingTest{

	public static void main(String[] args) {
		A a = new B();
		a.printName();
		
//		B b = new A();
//		b.printName();
	}

}