public class Scenario5
{
	public static void main(String[] args) {
		StringBuffer b1 = new StringBuffer("Hello");
		StringBuffer b2 = new StringBuffer("Hello");
		String s1 = "Hello";
		String s2 = "Hello";
		
		System.out.println(b1.equals(b2));  // New keyword will create a new object , so b1 and b2 will not be same - so It will return FALSE
		System.out.println(s1.equals(s2));  
		
	}
}