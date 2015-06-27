package com.lec.java.variable01;

public class Variable01 {

	public static void main(String[] args) {
		
		System.out.println("Variable");
		// 변수라는 것은 실제 컴퓨터 상에서 메모리에 올라가는 주소를 나타내는 것이다 .
		
		
		// 논리
		boolean b = true; // 2^8 1byte
		// 문자열
		char c= '가'; // 2^16 2byte  0~65535 언사이클 타입 ? ㅋ 
		// 정수형
		byte byte_1 = 1; // 2^8 1byte  -128 ~ +127
		short s = 16;// 2^16
		int i = 1; //2^32 4byte -2^31~2^31-1 
		long l= 1; // 2^64 8byte -2^64~2^64-1
		// 실수형 
		float f = 2.0f; // 2^32 4byte 
		double d = 2.0; // 2^64 8byte
		
		long n1 = 10; // 2^32 범위 
		
		// 우리가 여기서 = 하고 value 값을 넣는 행위를 초기화라고 한다.
		// 실제로 그 주소에 어떤 value 값을  지정하고 변수를 저장하는 것이다 .
		
//		for (byte j = 0; j < 129; j++) {
//			System.out.println("j(오버플로우):"+j);
//		}
//		
//		for (short j = 0; j < 32768; j++) {
//			System.out.println(j);
//		}
		
		byte b2 = (byte) 128; // 형변환 했더니 한번돌고 -128 로 가네 ㅋㅋ 
		System.out.println(b2);
		
	}// end main

} // end class variable01
