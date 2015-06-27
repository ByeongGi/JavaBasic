package com.lec.java.firstjava;

public class FirstJava {
	public static void main(String[] args) {
		System.out.println("My First Java App");
		
		// comment(주석): 
		System.out.println("안녕하세요~ 1111");
		// 프로그램 실행과는 상관 없지만, 
		// 개발자가 프로그램을 작성할 때 설명을 달아주는 것.
		
		/* 주석 
		 System.out.println("안녕하세요~~ 2222");
		 */
		
		System.out.println(123);
		System.out.println("123");
		
		System.out.println(10+20);
		// 10, 20은 숫자로 인식
		
		System.out.println("10+20");
		// 큰따옴표("")안에 있는 10과 20은 모두 문자열로 인식
		
		//System.out.println(안녕하세요);
		// 문자열은 반드시 큰따옴표("")로 묶여야 함.
		// 그렇지 않으면, 컴파일 오류가 발생.
		
		// 초간단 계산기
		System.out.println(3.141592 * 10 * 10);
		System.out.println(10 * 10 / 2);
		
		// 여러가지 의미의 + 기호
		System.out.println("안녕하세요, " + "여러분!!!");
		System.out.println("결과: " + 10);
		System.out.println("결과: " + (10 + 20));
		
		// 사칙연산 결과 보여주기(+, -, *, /)
		System.out.println("10 + 20 = " + (10 + 20));
		System.out.println("10 - 20 = " + (10 - 20));
		System.out.println("10 * 20 = " + (10 * 20));
		System.out.println("10 / 20 = " + ((double)10 / 20));
		
		System.out.println("결과: " + 10 + 20);
		
	} // end main()
	
} // end class FirstJava







