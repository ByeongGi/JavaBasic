package com.lec.java.casting;

public class CastingMain {

	public static void main(String[] args) {
		System.out.println("형변환(Casting)");
		
		// 암묵적 형변환(Implicit casting): 자바 언어가 자동으로 해주는 형변환
		byte num1 = 123; // 123 int형 숫자를 자바가 자동으로 byte 타입으로 변환
		//byte num2 = 512; // 512 숫자는 byte의 표현 범위를 넘기 때문에, 자동 형변환이 불가능
		short num3 = 512; // 512 int형 숫자를 자바가 자동으로 short 타입으로 변환
		//short num4 = 40000; // 40000 수는 short 표현 범위를 넘기 때문에 자동 형변환 불가능

		
		// 명시적 형변환(Explicit casting): 프로그래머가 직접 타입을 변환하는 것.
		byte num5 = (byte)513;
		System.out.println("num5 = " + num5);
		
		double avg1 = (99 + 88 + 78) / 3; // 88 계산 결과가 88.0으로 암묵적 형변환
		double avg2 = (double)(99 + 88 + 78) / 3; // 계산 결과가 88.3333333...
		System.out.println("avg1 = " + avg1);
		System.out.println("avg2 = " + avg2);
		
		System.out.println((99 + 88 + 78) / 3);
				
	} // end main()

} // end class CastingMain








