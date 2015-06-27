package com.lec.java.exercise02;

import java.util.Scanner;

public class GradeMain2 {

	public static void main(String[] args) {
		System.out.println("간단한 성적 처리 프로그램");

		// 키보드로부터 입력을 받을 준비를 함
		Scanner sc = new Scanner(System.in);

		// 1. 국어 점수를 입력 받아서 저장
		System.out.println("국어 점수 입력: ");
		int korean = sc.nextInt();

		// 2. 영어 점수를 입력 받아서 저장
		System.out.println("영어 점수 입력: ");
		int english = sc.nextInt();

		// 3. 수학 점수를 입력 받아서 저장
		System.out.println("수학 점수 입력: ");
		int math = sc.nextInt();
		
		// 모든 입력이 끝나면 스캐너를 닫아줌
		sc.close();

		// 입력된 점수들 확인
		System.out.println("\n===============");
		System.out.println("국어: " + korean);
		System.out.println("영어: " + english);
		System.out.println("수학: " + math);
		System.out.println("===============");

		// 4. 국영수 총점 계산
		int total = korean + english + math;
		System.out.println("총점: " + total);

		// 5. 국영수 평균 계산
		// double average = (double)(korean + english + math) / 3;
		double average = (double)total / 3;
		System.out.println("평균: " + average);

	} // end main()

} // end class GradeMain2

