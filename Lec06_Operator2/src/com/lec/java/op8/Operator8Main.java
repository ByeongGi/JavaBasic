package com.lec.java.op8;

public class Operator8Main {

	public static void main(String[] args) {
		System.out.println("연산자 8 - 비트 연산자");
		
		System.out.println("[1] &(and), |(or), ^(exclusive or), ~(not)");
		// a & b: a,b가 모두 1이면 결과도 1, 그 외에는 0
		// a | b: a가 1이거나 또는 b가 1이면 결과는 1, a,b 모두 0일 때만 0
		// a ^ b: a와 b 둘 중 하나만 1이 있는 경우는 1, 그 외에는 0
		// ~a: a가 1이면 0, a가 0이면 1로 바꿔줌
		
		
		byte n1 = 10; // byte n1 = 0b1010;
		byte n2 = 7; // byte n2 = 0b111;
		int result = n1 & n2;
		System.out.println("& 결과 = " + result);
		System.out.println("& 결과 = " + Integer.toBinaryString(result));
		
		result = n1 | n2;
		System.out.println("| 결과 = " + result);
		System.out.println("| 결과 = " + Integer.toBinaryString(result));
		
		result = n1 ^ n2;
		System.out.println("^ 결과(10진수) = " + result);
		System.out.println("^ 결과(2진수) = " + Integer.toBinaryString(result));
		
		result = ~n1;
		System.out.println("~ 결과(10진수) = " + result);
		System.out.println("~ 결과(2진수) = " + Integer.toBinaryString(result));

		System.out.println("\n\n================");
		System.out.println("비트 이동(shift) 연산자: >>, <<");
		int n3 = 10;
		int result2 = n3 >> 1; // 비트를 오른쪽(>>)으로 1비트씩 이동
		System.out.println(">> 결과(10진수): " + result2);
		System.out.println(">> 결과(2진수): " + Integer.toBinaryString(result2));
		
		n3 = 10;
		result2 = n3 << 1; // 비트를 왼쪽(<<)으로 1비트씩 이동
		System.out.println("<< 결과(10진수): " + result2);
		System.out.println("<< 결과(2진수): " + Integer.toBinaryString(result2));
		
		
	} // end main()

} // end class Operator8Main







