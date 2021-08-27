
public class Scenario3 {

	    void m1(int a){
	        System.out.println("int");
	    }
	    
		public static void main(String[] args) {
			new Scenario3().m1(10);
			new Scenario3().m1('A');  // It will consider as ASCII values, ASCII values are also integers, Hence it will accept 'A'
		}
}
