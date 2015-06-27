package com.lec.java.wrapper01;

// Wrapper 클래스: 기본 자료형(primitive type)의 데이터를 감싸는 클래스
// 기본 자료형: boolean, char, byte, short, int, long, float, double
// Wrapper: Boolean, Character, Byte, Short, Integer, Long, Float, Double

public class Wrapper01Main {

	public static void main(String[] args) {
		System.out.println("Wrapper 클래스");
		
		System.out.println();
		System.out.println("[1] wrapper 클래스에 값을 저장하는 방법");
		// 1. 생성자 이용
		Integer num1 = new Integer(123);
		System.out.println("num1 = " + num1);
		
		// 2. wrapper 클래스의 static 메소드인 valueOf() 메소드를 사용
		Integer num2 = Integer.valueOf(123);
		System.out.println("num2 = " + num2);
		
		if (num1 == num2) {
			System.out.println("같다..");
		} else {
			System.out.println("다르다!!");
		}
		
		if (num1.equals(num2)) {
			System.out.println("같다...");
		} else {
			System.out.println("다르다!!");
		}
		
		Integer num3 = new Integer(123);
		Integer num4 = Integer.valueOf(123);
		if (num1 == num3) {
			System.out.println("생성자: 같은 참조");
		} else {
			System.out.println("생성자: 다른 참조");
		}
		if (num2 == num4) {
			System.out.println("valueOf(): 같은 참조");
		} else {
			System.out.println("valueOf(): 다른 참조");
		}
		
		System.out.println();
		Integer num5 = 123;
		// 123 Literal(상수)를 가지고 Integer 클래스의 인스턴스를 생성
		// Integer.valuOf(123)과 동일한 코드.
		if (num4 == num5) {
			System.out.println("같은 참조");
		} else {
			System.out.println("다른 참조");
		}
		
		System.out.println();
		Integer num6 = Integer.valueOf("123");
		System.out.println(num6);
		num6 *= 2;
		System.out.println(num6);

		
	} // end main()

} // end class Wrapper01Main
















