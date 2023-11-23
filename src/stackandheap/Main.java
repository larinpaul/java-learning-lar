package stackandheap;

public class Main {

	public static void main(String[] args) {

		// JVM
		
		// Stack, LIFO (Last In, First Out)
		// []
		// []
		// []
		// Stack
		
		// Every method has its own stack
		
		// E.g: main stack
		// [obj1][105]
		// [obj][address is 101], there is a link between a stack and a heap because of the address
		// [r1][7] (n1+n2, 3+4)
		// [data][10]
		// \key/\value/
		
		// add method stack
		// [n2][4]
		// [n1][3]
		
		//   []
		//   [][][]
		// [address is 101\num=5|add()][105\num=5|add()][] // We only declare it here, but the actual area where it will be consumed is the stack
		// Heap
		
		int data = 10; // local variable
		
		Calculator obj = new Calculator();
		int r1 = obj.add(3,  4);
		System.out.println(r1);
		Calculator obj1 = new Calculator();
		
		// data, obj, r1 are all variables
		
		System.out.println(obj.num); // 5
		System.out.println(obj1.num); // 5
		obj.num = 8;
		System.out.println(obj.num); // 5
		System.out.println(obj1.num); // 8
		
	}

}
