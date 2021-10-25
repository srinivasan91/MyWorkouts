import java.io.FileNotFoundException;

public class CheckedAndUncheckedExceptionTest {

	public static void main(String[] args) {
		X x = new Y();
//		X x1 = new X();
		try {
			x.method1();
//			x1.method1();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}

class X{
	
	void method1() throws FileNotFoundException {   // if child method has the same name you have to throws the same exception in parent too
		throw new ArrayIndexOutOfBoundsException();
	}
}

class Y extends X{
	
	void method1() throws FileNotFoundException {  // if you are using checked exception , you have to handle the exception or use throws
		throw new FileNotFoundException();
	}
}
