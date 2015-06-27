package com.lec.java.variables02;

public class Variable02Main {

	public static void main(String[] args) {
		System.out.println("변수 02");
		
		// 변수의 선언과 동시에 초기화
		// 변수타입 변수이름 = 값;
		int num1 = 10;
		System.out.println("num1 = "  + num1);
		
		num1 = 11111;
		System.out.println("num1 = "  + num1);
		
		// int 타입 변수 korean을 선언하고, 99를 입력
		int korean = 50;
		System.out.println("국어 점수: " + korean);
		
		// int 타입 변수 english를 선언하고, 88을 입력
		int english = 50;
		System.out.println("영어 점수: " + english);
		
		// int 타입 변수 math를 선언하고, 77을 입력
		int math = 50;
		System.out.println("수학 점수: " + math);
		
		// 국어, 영어, 수학 총점을 계산해서 출력
		System.out.println("총점: " + (korean + english + math));
		int total;
		total = korean + english + math;
		System.out.println("총점 = " + total);
		
		
		// 세과목의 평균을 계산해서 출력
		System.out.println("평균: " + ((double)(korean + english + math) / 3));
		double avg = (double)(korean + english + math) / 3;
		System.out.println("평균 = " + avg);

		
	} // end main()

} // end class Variable02Main
