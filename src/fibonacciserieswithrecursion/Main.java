package fibonacciserieswithrecursion;

public class Main {
	
	private static long[] fibonacciCache;
//	private static long[] fibonacciCache1;
//	private static long[] fibonacciCache2;

	public static void main(String[] args) {

		int n = 66; // But overly big numbers won't work...
//		int n = 92; // The limit is around the 92nd fibonacci number,
		// because it goes to 7,540,113,804,746,346,429
		// The maximum value of a long is 9,223,372,036,854,775,807
		fibonacciCache = new long[n + 1];
		System.out.println(fibonacci(n));
		
		for (int i = 0; i <= n; i++) {
//			System.out.println(fibonacci(i));
			System.out.print(fibonacci(i) + " ");
		}
		
		for (int i = 0; i <= n; i++) {
			System.out.println(fibonacci(i));
//			System.out.print(fibonacci(i) + " ");
		}
		
//		int n1 = 50; // Will take about 2 minutes or so if not optimized! :O
//		fibonacciCache1 = new long[n1 + 1];
//		System.out.println(fibonacci(n1));
//		
//		int n2 = 1333222111;
//		fibonacciCache2 = new long[n2 + 1];
//		System.out.println(fibonacci(n2));
		
	}
	
	// We will use memoization
	private static long fibonacci(int n) {
		
		
		if (n <= 1) {
			return n;
		}
		
		if (fibonacciCache[n] != 0) {
			return fibonacciCache[n];
		}
		
		long nthFibonacciNumber = (fibonacci(n - 1) + fibonacci(n - 2));
		fibonacciCache[n] = nthFibonacciNumber;
		
		return nthFibonacciNumber;
	}
	
	// 0 1 1 2 3 5 8 13 21 34 55
	
	// f(n) = f(n - 1) + f(n - 2)
		
	private static long fibonacciNotOptimized(int n) {
		
		if (n <= 1) {
			return n;
		}
		
		return (fibonacci(n - 1) + fibonacci(n - 2));
		
	}

}
