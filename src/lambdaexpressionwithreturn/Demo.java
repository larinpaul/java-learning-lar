package lambdaexpressionwithreturn;

@FunctionalInterface
interface A {
	int add(int i, int j);
}

public class Demo {
	
	public static void main(String[] args) {

		A obj = new A() {
			public int add(int i, int j) {
				return i + j;
			}
		};
		
		int result = obj.add(5, 4);
		System.out.println(result); // 9
		
		
		A obj1 = (i, j) -> i + j;
		
		int result1 = obj.add(55, 44);
		System.out.println(result1); // 99	
		
	}

}
