package com.lec.java.variables03;

import java.util.Scanner;

public class Variables03Main {

	public static void main(String[] args) {
		System.out.println("변수 03 - 변수의 타입들");
		
		// 자바의 기본 자료형(primitive data type)
		// 정수 타입: byte(1바이트), short(2바이트), int(4바이트), long(8바이트)
		// 실수 타입: float, double
		// 문자 타입: char
		// 논리 타입: boolean
		
		System.out.println("[1] 정수 타입 변수들");
		System.out.println("byte: " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
		byte num1 = -128;
		byte num2 = 0;
		byte num3 = 123;
		//byte num4 = 12345; // 컴파일 에러: byte에 저장할 수 있는 크기를 넘어섬
		
		System.out.println("short: "  + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
		short num5 = -12345;
		short num6 = 12345;
		//short num7 = 32768; // 컴파일 에러: short에 저장할 수 있는 크기를 넘어섬
		//short num8 = -32769; // 컴파일 에러: short에 저장할 수 있는 크기를 넘어섬
		
		System.out.println("int: " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		System.out.println("long: " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
		//int num9 = 9876543210; // 컴파일 에러: int에 저장할 수 있는 크기를 넘어섬
		//long num10 = 9876543210; // 컴파일 에러:
		long num11 = 9876543210L;
		// 9876543210 이라는 숫자가 int 타입이 아니라 long 타입임을 명시하기 위해서
		// 숫자 뒤에 영문자 L을 붙여줌
		// 자바에서 정수 타입 변수의 기본은 int임.
		// 자바는 정수 숫자를 별도 표기가 없으면 int라고 생각.
		long num12 = 12; // 12라는 int를 long 타입에 저장
		long num13 = 12L; // 12라는 long을 long 타입에 저장
		int num14 = 12;
		//int num15 = 12L; // 컴파일 에러: long 타입 숫자를 int에 저장하려고 했을 때
		
		Scanner sc = new Scanner(System.in);
		byte num15;
		num15 = sc.nextByte();
		byte num16 = (byte)(num15 + 1);
		System.out.println("num15 = " + num15);
		System.out.println("num16 = " + num16);
		sc.close();
		
		// 정수 표기법
		int number1 = 11; // 10진수(decimal)
		int number2 = 0xB; // 16진수(hexadecimal): 0x로 시작
		int number3 = 013; // 8진수(octal): 0으로 시작
		int number4 = 0b1011; // 2진수(binary): 0b로 시작
		System.out.println("number1 = " + number1);
		System.out.println("number2 = " + number2);
		System.out.println("number3 = " + number3);
		System.out.println("number4 = " + number4);
		
		
		
		
	} // end main()

} // end class Variables03Main










