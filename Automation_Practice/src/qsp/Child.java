//Upcasting prg-2
package qsp;

public class Child  extends Parent{

	public static void main(String[] args) {
		GrandChild GC1 = new GrandChild();
		Child C1 = GC1;
		    Parent P1 = C1;//upcasting
		    
		    P1.A();
		    P1.B();
		    C1.test();
		    
		    Child C2 = (Child) P1;//Downcasting
		    
		    P1.A();
		    P1.B();
		    C2.test();
	}
	public void B() {
		System.out.println("+B2");
	}

    public void test() {
    	System.out.println("TC2");
    }
   
	}
	

