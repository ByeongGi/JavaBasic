package com.lec.java.exercise03;

import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {
		System.out.println("초간단 계산기");
		
		// 키보드 입력 준비
		Scanner sc = new Scanner(System.in);
		
		// num1 입력 받고 저장
		System.out.println("num1 입력: ");
		double num1 = sc.nextDouble();
		
		// num2 입력 받고 저장
		System.out.println("num2입력: ");
		double num2 = sc.nextDouble();
		
		// 입력이 모두 끝난 후 스캐너 닫음
		sc.close();
		
		// 입력된 수 확인
		System.out.println("\n---------------");
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("---------------");
		
		// 사칙연산(+, -, *, /) 계산하고 결과 출력
		double result;
		
		// 더하기
		result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		
		// 빼기
		result = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + result);
		
		// 곱하기
		result = num1 * num2;
		System.out.println(num1 + " x " + num2 + " = " + result);
		
		// 나누기
		result = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + result);
		
		System.out.println("double min value : " + Double.MIN_VALUE);
		// 자바 언어에서
		// 실수형(float, double) 나누기에서 0.0으로 나누는 것은 Infinity로 계산됨
		// 정수 / 정수 에서 0으로 나누는 것은 예외(exception) 발생함.
		int num3 = 100;
		int num4 = 0;
		int result2 = num3 / num4;
		System.out.println("result2 = " + result2);
		
	} // end main()

} // end class CalcMain











