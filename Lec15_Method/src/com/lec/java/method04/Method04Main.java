package com.lec.java.method04;

import java.util.Scanner;

public class Method04Main {

	public static void main(String[] args) {
		System.out.println("초간단 계산기");
		
		Scanner sc = new Scanner(System.in);
		
		double num1 = inputNumber(sc);
		double num2 = inputNumber(sc);
		
		sc.close();
		
		// 확인
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		calcSum(num1, num2);
		calcSub(num1, num2);
		calcMul(num1, num2);
		calcDiv(num1, num2);

	} // end main()
	
	
	// method name: inputNumber
	// return: double
	// arguments: Scanner sc - 키보드 입력을 위한 객체
	// 기능: 키보드로 입력받은 double형 데이터를 리턴
	public static double inputNumber(Scanner sc) {
		System.out.println("숫자를 입력하세요:");
		double num = sc.nextDouble();
		
		return num;
	} // end inputNumber()
	
	
	// method name: calcSum
	// return: void
	// arguments:
	//   1) double x
	//   2) double y
	// 기능: 두 수 x, y의 합을 출력(print)
	public static void calcSum(double x, double y) {
		double result = x + y;
		System.out.println(x + " + " + y + " = " + result);
	} // end calcSum()
	
	
	// method name: calcSub
	// return: void
	// arguments:
	//   1) double x
	//   2) double y
	// 기능: 두 수 x, y의 차(x - y)를 출력(print)
	public static void calcSub(double x, double y) {
		double result = x - y;
		System.out.println(x + " - " + y + " = " + result);
	} // end calcSub()
	
	
	// method name: calcMul
	// return: void
	// arguments:
	// 1) double x
	// 2) double y
	// 기능: 두 수 x, y의 곱(x * y)를 출력(print)
	public static void calcMul(double x, double y) {
		double result = x * y;
		System.out.println(x + " x " + y + " = " + result);
	} // end calcMul()
	
	// method name: calcDiv
	// return: void
	// arguments:
	// 1) double x
	// 2) double y
	// 기능: 두 수의 나눗셈(x / y) 결과 를 출력(print)
	public static void calcDiv(double x, double y) {
		double result = x / y;
		System.out.println(x + " / " + y + " = " + result);
	} // end calcDiv()

} // end class Method04Main









