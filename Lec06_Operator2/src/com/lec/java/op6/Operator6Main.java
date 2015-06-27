package com.lec.java.op6;

public class Operator6Main {

	public static void main(String[] args) {
		System.out.println("연산자 6 - 논리 연산자: &&, ||, !");
		// A && B: A와 B가 모두 참일 때만 결과가 true, 나머지는 결과가 false
		// A || B: A나 B 둘 중 하나가 참이면 결과가 true, 둘 다 거짓이면 결과가 false
		// !A: A가 참이면 결과가 false, 거짓이면 결과가 true
		
		int num1 = 10;
		if (num1 > 0 && num1 < 100) {
			System.out.println("참입니다.");
		} else {
			System.out.println("거짓입니다.");
		} // end if-else
		
		if (num1 > 0 && num1 < 10) {
			System.out.println("참입니다.");
		} else {
			System.out.println("거짓입니다.");
		} // end if-else

		
		if (num1 > 0 || num1 < 100) {
			System.out.println("참입니다.");
		} else {
			System.out.println("거짓입니다.");
		} // end if-else
		
		if (num1 > 0 || num1 < 10) {
			System.out.println("참입니다.");
		} else {
			System.out.println("거짓입니다.");
		} // end if-else
		
		if (num1 < 0 || num1 > 100) {
			System.out.println("참입니다.");
		} else {
			System.out.println("거짓입니다.");
		} // end if-else
		
		if (!(num1 > 0)) {
			System.out.println("참입니다.");
		} else {
			System.out.println("거짓입니다.");
		}
		
	} // end main ()

} // end class Operator6Main











