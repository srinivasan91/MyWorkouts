
public class InstanceBlock {

	public static void main(String[] args) {
//		Parent p = new Child();
		Child c = new Child();
	}
	
}


class Parent {
	
	static{
		System.out.println("Parent class- static block invoked");
	}

	Parent(){
		System.out.println("Parent class constructor called..");
	}
	
	{
		System.out.println("Parent class Instace Block Invoked");
	}
}

class Child extends Parent{
	static{
		System.out.println("Child- static block invoked");
	}
	Child(){
		System.out.println("child class constructor called..");
	}
	
	{
		System.out.println("Child calss Instance Block invoked.");
	}
}

