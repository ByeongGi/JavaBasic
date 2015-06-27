package com.lec.java.switch03;

public class Switch03Main {

	public static void main(String[] args) {
		System.out.println("switch 제약 조건");
		
		// switch (조건) {case1:  case2:}
		// (조건)에 따라서 해당 case로 이동
		// (조건)에 사용될 수 있는 자료 타입은
		// 1. int로 변환 가능한 타입들: byte, short, int, char
		// 2. enum 타입(enum 자료형은 Java 5 버전부터 소개)
		// 3. String 타입 (Java 7 버전부터 switch 문에서 사용 가능)
		
		System.out.println("char를 switch문에서 사용");
		char ch = 'C';
		switch (ch) {
		case 'a':
			System.out.println('A');
			break;
			
		case 'b':
			System.out.println('B');
			break;
			
		case 'c':
			System.out.println('C');
			break;
			
		default:
			System.out.println("몰라요~");
		} // end switch
		
//		long num = 1;
//		switch (num) {
//		
//		}
		// long 타입은 switch문에서 사용할 수 없다.
		
//		float real = 1;
//		switch (real) {
//		
//		}
		// float, double 등도 switch에서 사용할 수 없다.

	} // end main()

} // end class Switch03Main









