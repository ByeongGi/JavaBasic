package com.lec.java.variables05;

public class Variables05Main {

	public static void main(String[] args) {
		System.out.println("변수 05 - char, boolean");
		
		// char: 문자 하나를 저장하기 위한 자료 타입(2바이트)
		char ch1 = 'A';
		// 문자열(string)은 큰따옴표("")로 묶어 줌.
		// 문자 하나(char)는 작은따옴표('')로 묶어 줌.
		//char ch2 = "A"; // 컴파일 에러: 자바는 "A"를 문자열로 인식하기 때문
		System.out.println("ch1: " + ch1);
		
		char ch2 = '한';
		char ch3 = '글';
		System.out.println("ch2: " + ch2);
		System.out.println("ch3: " + ch3);
		
		char ch4 = 0xAE01;
		System.out.println("ch4: " + ch4);
		char ch5 = 1234;
		System.out.println("ch5: " + ch5);
		
		char ch6 = '!';
		System.out.println("ch6: " + ch6);
		char ch7 = 33;
		System.out.println("ch7: " + ch7);
		
		// boolean(논리형): 참(true), 거짓(false)
		boolean b1 = true;
		boolean b2 = false;
		System.out.println("b1: " + b1);
		System.out.println("b2: " + b2);
		System.out.println(10 < 20);
		System.out.println(10 > 20);
		boolean b3 = 10 < 20;
		System.out.println("b3: " + b3);
		

	} // end main

} // end class Variables05Main







