package com.lec.java.if01;

public class If01Main {

	public static void main(String[] args) {
		System.out.println("if 문");
		
		System.out.println("\n===== [1] =====");
		int num = -10;
		if (num > 0) {
			// if () 조건문이 true일 때 실행되는 부분
			System.out.println("양수입니다.");
		} else {
			// if () 조건문이 false일 때 실행되는 부분
			System.out.println("음수입니다.");
		} // end else
		
		System.out.println("if-else 끝");
		
		
		System.out.println("\n===== [2] =====");
		int num2 = 10;
		if (num2 > 0) {
			System.out.println("양수입니다.");
		} // end if
		System.out.println("음수입니다.");
		
		
		System.out.println("\n===== [3] =====");
		int num3 = 124;
		if (num3 % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		} // end else
		
		
	} // end main()

} // end class If01Main









