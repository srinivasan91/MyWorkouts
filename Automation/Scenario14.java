public class Scenario14 {

	public static void main(String[] args) {

		int x = 10;				
								//it is equal to x = x-1
		int y = x--;			//suffix x-- operator will store the value in x , then only it will decrease a value  
		System.out.println(y);	// so in this place y will be 10
		System.out.println(x--);  
		System.out.println(++y);  //Prefix ++ will increase a value then only it will store in the variable, so it will be 11
									// suppose if it is y++, the value would be 10

	}

}