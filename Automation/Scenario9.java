public class Scenario9
{
	
	public static void main(String[] args) {
		String s1 = "Hello";				// sting constant will create a object in string constant pool
		String s2 = new String("Hello");
		System.out.println(s1==s2);			//New object will create another object in heap memory
		
	}
}