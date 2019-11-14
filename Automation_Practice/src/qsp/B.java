//Upcasting using Interface
package qsp;

public class B implements  A {
	
	public static void main(String[]args) {
		B b1= new B();
		b1.TestA();
		b1.TestB();
		
		A a1 = b1;
		a1.TestA();
	//*hidden	a1.TestB();
		B b2= (B)a1;
		b2.TestB();
	}
	public void TestA(){
	System.out.println("TA2");
	};
	
	public void TestB() {
		System.out.println("TB2");
}
}