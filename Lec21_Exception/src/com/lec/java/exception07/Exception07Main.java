package com.lec.java.exception07;

import java.util.Scanner;

public class Exception07Main {

	static Scanner sc = new Scanner(System.in);
	
	
	public static int inputScore() throws ScoreException {
		int score = sc.nextInt();
		if (score < 0 || score > 100) {
			// 우리가 만든 Exception 클래스 사용
			// 우리가 만든 Exception 클래스의 인스턴스 생성
			ScoreException ex = new ScoreException();
			
			// 예외 인스턴스를 throw
			throw ex;
		}
		
		return score;
	} // end inputScore()
	
	
	public static void main(String[] args) {
		System.out.println("예외 클래스 만들기");
		
		System.out.println();
		try {
			System.out.println("국어 점수 입력:");
			int kor = inputScore();
			System.out.println("kor = " + kor);
			
			System.out.println("영어 점수 입력:");
			int eng = inputScore();
			System.out.println("eng = " + eng);
			
		} catch (ScoreException ex) {
			System.out.println(ex.getMessage());
			
		} finally {
			sc.close();
		} // end finally

		
	} // end main()

} // end class Exception07Main












