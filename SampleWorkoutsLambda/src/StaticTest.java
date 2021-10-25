
public class StaticTest {
	
	static int a=10;
	
	void method1() {
		a =15;
		System.out.println(a);
	}
	
	void method2() {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		StaticTest tst = new StaticTest();
//		tst.method1();
		tst.method2();
	}

}
