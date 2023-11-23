package stackandheap;

public class Calculator {
	
	int num = 5; // num, but where does it reside? In the HEAP!
	// num is an INSTANCE variable
	// Local variables are a part of of a stack (stack memory)
	// Instance variables are a part of the heap (heap memory)
	
	public int add(int n1, int n2) {
		System.out.println(num);
		return n1 + n2;
	}

}
