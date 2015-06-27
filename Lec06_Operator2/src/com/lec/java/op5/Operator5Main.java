package com.lec.java.op5;

public class Operator5Main {

	public static void main(String[] args) {
		System.out.println("연산자 5 - 관계(비교) 연산자");
		System.out.println("<, >, <=, >=, ==, !=");
		// 비교 연산의 결과를 참(true) 또는 거짓(false)으로 리턴하는 연산자
		// A < B: A는 B보다 작다
		// A > B: A는 B보다 크다
		// A >= B: A는 B보다 크거나 같다
		// A <= B: A는 B보다 작거나 같다
		// A == B: A와 B가 같다.
		// A != B: A와 B는 다르다.
		
		System.out.println(10 < 20);
		System.out.println(10 > 20);
		boolean b = 1.2 <= 2.3; // 1.2는 2.3보다 작거나 같다. -> 참 -> true가 저장됨
		System.out.println("b = " + b);
		
		int n1 = 11;
		int n2 = 12;
		boolean b2 = n1 != n2; // n1과 n2가 다르다 -> 참 -> true가 저장됨
		System.out.println("b2 = " + b2);
		
		double average = 91.2;
		if (average >= 90) {
			// if ()가 참일 때 실행되는 부분
			System.out.println("학점: A");
		} else {
			// if ()가 거짓일 때 실행되는 부분
			System.out.println("학점: B");
		}

	} // end main()

} // end class Operator5Main






