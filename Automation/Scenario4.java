class Parent1{
    
    void method1(){
        System.out.println("P-Method1");
    }
}

public class Scenario4 extends Parent1
{
    void method1(){
        System.out.println("M-Method1");
    }
    void method2(){
        System.out.println("M-Method2");
    }
    
	public static void main(String[] args) {
		Scenario4 m = new Scenario4();
		m.method1();
		Parent1 p = new Scenario4();
//		p.method2(); //we can't access the method2 with Parent reference p, Since parent doesn't have the method2
		
		
	}
}