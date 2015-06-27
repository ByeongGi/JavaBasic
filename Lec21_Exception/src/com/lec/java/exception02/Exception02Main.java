package com.lec.java.exception02;

public class Exception02Main {

	public static void main(String[] args) {
		System.out.println("예외(Exception) 처리");
		
		int num1 = 123;
		int num2 = 0;
		int result = 0;
		if (num2 != 0) {
			result = num1 / num2;
		} else {
			System.out.println("0으로 나눌 수 없습니다... ");
		}
		System.out.println("결과: " + result);
		
		try {
			result = num1 / num2;
			System.out.println("결과: " + result);
		
		} catch (ArithmeticException ex) {
			System.out.println("0으로 나누는 Exception");
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		
		System.out.println();
		System.out.println("프로그램 종료...");

/*		
		try {
			// 1. DB connect
			// 2. DB 테이블 접속/쿼리
			// 3. SQL 문장 실행
			// 4. 결과 출력
		} catch (Exception e) {
			// Exception 처리
		}
		
		if (DB connect 성공) {
			if (DB table 쿼리 성공) {
				if (SQL 문장 실행) {
					System.out.println("결과"));
				} else {
					// SQL 문장 실패 처리
				}
			} else {
				// DB 테이블 쿼리 실패 처리
			}
		} else {
			// DB connect 실패 처리
		}
*/
		

	} // end main()

} // end class Exception02Main












