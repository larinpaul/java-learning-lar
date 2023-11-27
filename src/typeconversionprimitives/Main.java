package typeconversionprimitives;

// Type conversion
// Приведение типов

public class Main {

	public static void main(String[] args) {

		int x0 = 23; // 32 bits, 4 bytes
		short x1 = 123; // 16 bits
		byte x2 = 123; // -127 - 127 // for small integers
		long x3 = 123; // 64 bits
		double x4 = 123.123; // 64 bits, real numbers
		float x5 = 12.12f; // 32 bits, real numbers
		// Primitive types keep data, do not keep a reference
		
//		float f = 123.2; // double by default, so we cannot assign double to float!
		double d1 = 123.2;
		float f0 = 2.2f;
		double d0 = f0; // but you can automatically convert float to double...
		float f1 = (float) d1; // to convert double to float, however, you need to use the () conversion, приведение примитивных типов данных
		
		// just as real numbers are FLOATS BY DEFAUL, all integer numbers are INTS by default!
//		long l = 111111111111111111; // impossibru... too big for an int
		long l = 111111111111111111L; // Easy! Just add the L!
		System.out.println(l);
		
//		int i = l; // impossibru
		int i = (int) l; // явное приведение типов, мы должны указать сами 
		System.out.println(l);
		
		double xx = 123.6;
		int yy = (int) xx;
		System.out.println(yy); // 123
		long ll = Math.round(xx);
		System.out.println(ll); // 124
	
		byte b = (byte) 128; // -128 to 127
		System.out.println(b); // -128, Мы превысили порог и он вернулся назад...
		
		
		
	}

}
