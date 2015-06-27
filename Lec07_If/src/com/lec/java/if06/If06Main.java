package com.lec.java.if06;

public class If06Main {

	public static void main(String[] args) {
		System.out.println("중첩 if 연습");
		
		int num = 5;
		
		// 1. num이 짝수이면 "짝수"라고 화면 출력, 아니면 "홀수"라고 화면 출력
		// 2. num이 짝수인 경우에, num이 8의 배수이면 "8의 배수"라고 화면 출력
		// 3. num이 홀수인 경우에, num이 3의 배수이면 "3의 배수"라고 화면 출력
		if (num % 2 == 0) {
			// 짝수
			System.out.println("짝수");
			if (num % 8 == 0) {
				// 8의 배수
				System.out.println("8의 배수");
			} else {
				System.out.println("짝수, but 8의 배수 아님");
			} // end 2 else
			
		} else {
			// 홀수
			System.out.println("홀수");
			if (num % 3 == 0) {
				// 3의 배수
				System.out.println("3의 배수");
			} else {
				System.out.println("홀수, but 3의 배수 아님");
			} // end 3 else
			
		} // end 1 else
		

	} // end main()

} // class If06Main









