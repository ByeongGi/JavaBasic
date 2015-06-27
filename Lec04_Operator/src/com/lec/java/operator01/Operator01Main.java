package com.lec.java.operator01;

public class Operator01Main {

	public static void main(String[] args) {
		System.out.println("연산자(Operator) 01");
		
		System.out.println("\n====================");
		System.out.println("[1] 대입 연산자: =");
		int num = 123; // 등호(=) 오른쪽의 값을 왼쪽에 대입(저장)
		System.out.println("num = " + num);
		
		
		System.out.println("\n====================");
		System.out.println("[2] 사칙연산 연산자: +, -, *, /, %");
		int num1 = 7;
		int num2 = 3;
		int result;
		
		// 덧셈 연산자: +
		result = num1 + num2;
		System.out.println("더하기 결과: " + result);
		
		// 뺄셈 연산자: -
		result = num1 - num2;
		System.out.println("빼기 결과: " + result);
		
		// 곱셈 연산자: *
		result = num1 * num2;
		System.out.println("곱하기 결과: " + result);
		
		// 나눗셈 연산자: /
		result = num1 / num2; 
		// 정수 / 정수 = 나눈 몫(정수)을 결과로 돌려 줌
		System.out.println("나눈 몫: " + result);
		
		// 나머지 연산자: %
		result = num1 % num2;
		// 정수 % 정수 = 나눈 나머지(정수)를 결과로 돌려 줌
		System.out.println("나눈 나머지: " + result);
		
		// 나눗셈 연산자(/)가 실수에 사용됐을 경우에는
		// 계산 결과를 실수로 돌려 줌.
		// 실수 / 정수, 정수 / 실수, 실수 /실수 경우에는 결과가 항상 실수형이 됨
		double result2 = 12.0 / 3;
		System.out.println("실수 나누기 결과: " + result2);
		
		// 나머지 연산자(%)
		// 정수 % 정수 = 정수로 값을 돌려 줌.
		// 실수 % 정수, 정수 % 실수, 실수 % 실수 = 몫을 제외한 실수형 나머지를 돌려줌.
		double result3 = 12.1 % 3.0;
		System.out.println("나머지 연산자 결과: " + result3);
		
	} // end main()

} // end class Operator01Main









