package assignmentpart4;

public class Test4 {
	public static void main(String[] args) {
		B test = new B();
		((A)test).retu(7);// Test for first question , it is call the subclass method
		
		//A test2 = new A();
		//((B)test2).retu(6); // run time error 
		
		A test3 = new B(); // type super, class sub
		((A)test3).retu(9); // return subclass type
		test3.retu(10);
		
		
		
		
		
		
	}

}
