package com.lec.java.exception01;

public class Exception01Main {

	public static void main(String[] args) {
		System.out.println("예외(Excption)");
		
		System.out.println("[1] ArithmeticException");
		int num1 = 123;
		int num2 = 0;
		//System.out.println("num1 / num2 = " + (num1 / num2));
		
		System.out.println("[2] ArrayIndexOutOfBoundsException");
		int[] numbers = new int[10];
		//numbers[10] = 100;
		
		System.out.println("[3] NegativeArraySizeException");
		//int[] numbers2 = new int[-1];
		
		System.out.println("[4] NullPointerException");
		String str = null;
		//System.out.println("스트링 길이: " + str.length());
		

	} // end main()

} // enc class Exception01Main











