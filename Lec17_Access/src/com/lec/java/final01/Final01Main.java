package com.lec.java.final01;

public class Final01Main {

	// final 멤버 변수
	// (주의) final 멤버 변수는 반드시 선언과 동시에 초기화해야 함
	final int NUM = 1;
	//final int number; // 컴파일 에러: 초기화되지 않아서
	
	
	public static void main(String[] args) {
		System.out.println("final: 변경할 수 없는 상수");
		
		// 변수: 값을 변경할 수 있는 저장 공간 
		int num1 = 1;
		num1 = 10;
		
		// 상수: 값을 변경할 수 없는 저장 공간
		final int num2 = 1;
		// num2 = 10; 
		// 컴파일 에러: 선언할 때 final로 선언이 돼 있으면 나중에 변경 불가.
		
		final int num3; // final 선언
		num3 = 1; // final 초기화
		//num3 = 12; // 초기화 된 이후에는 값 변경 불가

	} // end main()

} // end class Final01Main










