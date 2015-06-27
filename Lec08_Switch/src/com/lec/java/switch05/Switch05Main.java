package com.lec.java.switch05;

public class Switch05Main {

	// enum 타입 정의하는 방법:
	// enum 이름 {}
	// enum 타입 정의 메소드 안에서는 할 수 없다.
	enum Days {SUN, MON, TUE, WED, THU, FRI, SAT}
	enum Numbers {ONE, TWO, THREE}
	enum Subjects {KOREAN, MATH, ENGLISH}
	
	
	public static void main(String[] args) {
		System.out.println("enum 타입을 switch에서 사용하기");
		
		// 변수타입 변수이름 = 값;
		// int number = 123;
		Days day1 = Days.THU;
		Days day2 = Days.MON;
		Numbers num1 = Numbers.ONE;
		Numbers num2 = Numbers.TWO;
		
		switch (day1) {
		case SUN:
			System.out.println("일요일");
			break;
			
		case MON:
			System.out.println("월요일");
			break;
			
		case TUE:
			System.out.println("화요일");
			break;
			
		case WED:
			System.out.println("수요일");
			break;
			
		case THU:
			System.out.println("목요일");
			break;
			
		case FRI:
			System.out.println("금요일");
			break;
			
		case SAT:
			System.out.println("토요일");
			break;
		}// end switch
		
	} // end main()

} // end class Switch05Main









