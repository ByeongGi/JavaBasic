package com.lec.java.op2;

public class Operator2Main {

	public static void main(String[] args) {
		System.out.println("연산자(Operator) 2 - 복합 대입 연산자");
		System.out.println("+=, -=, *=, /=, %=, ...");
		
		int num1 = 10;
		System.out.println("num1 = " + num1);
		num1 = num1 + 1;
		System.out.println("num1 = " + num1);
		num1 += 1;
		System.out.println("num1 = " + num1);
		
		int num2 = 100;
		num2 += 20; // num2 = num2 + 20; 결과와 동일
		System.out.println("num2 = " + num2);
		
		int num3 = 123;
		num3 -= 23; // num3 = num3 - 23;
		System.out.println("num3 = " + num3);
		
		double num4 = 3.14;
		num4 *= 2; // num4 = num4 * 2; 결과와 동일
		System.out.println("num4 = " + num4);
		
		double num5 = 3.14;
		num5 /= 2; // num5 = num5 / 2; 결과와 동일
		System.out.println("num5 = " + num5);
		
	} // end main()

} // end class Operator2Main










