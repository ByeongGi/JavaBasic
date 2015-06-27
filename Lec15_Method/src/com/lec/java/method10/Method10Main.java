package com.lec.java.method10;

public class Method10Main {

	public static void main(String[] args) {
		System.out.println("재귀 메소드(recursive method)");
		
		System.out.println("-1! = " + calcFactorial(-1));
		
		for (int n = 0; n < 10; n++) {
			System.out.println(n + "! = " + calcFactorial(n));
		}
		
		System.out.println("2의 2승 = " + powerOfTwo(2));
		System.out.println("2의 -2승 = " + powerOfTwo(-2));

	} // end main()
	
	
	// method name: calcFactorial
	// return: long (num의 팩토리얼을 계산해서 리턴)
	// arguments: long num
	// 기능:
	//   if n == 0, 0! = 1
	//   if n > 0, n! = n * (n - 1)!
	//   if n < 0, 계산 불가
	public static long calcFactorial(long num) {
		long result = 0L;
		
		if (num == 0) {
			result = 1L;
		} else if (num > 0) {
			result = num * calcFactorial(num - 1);
		} else {
			System.out.println("음수 팩토리얼은 계산할 수 없어요");
		}
		
		return result;
		
	} // end calcFactorial()
	
	
	// method name: powerOfTwo
	// return: double (2의 n승을 계산해서 리턴)
	// arguments: int n
	// 기능:
	//   if n == 0, 2^0 = 1
	//   if n > 0, 2^n = 2 x 2^(n-1)
	//   if n < 0, 2^n = 1 / 2^(-n)
	public static double powerOfTwo(int n) {
		double result = 0;
		if (n == 0) {
			result = 1.0;
		} else if (n > 0) {
			result = 2 * powerOfTwo(n - 1);
		} else {
			result = 1 / powerOfTwo(-n);
		}
		
		return result;
	}

} // end class Method10Main










