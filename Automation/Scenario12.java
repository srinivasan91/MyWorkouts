public class Scenario12 {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = new String("Hello");
		s1.toUpperCase();
		s2.toUpperCase();
		System.out.println(s1);  //String is immutable, so it will not modify the same variable, if any operation performed
		System.out.println(s2);
		
		String s3 = s1.toUpperCase();
		String s4 = s2.toUpperCase();
		System.out.println(s3);
		System.out.println(s4);

	}

}