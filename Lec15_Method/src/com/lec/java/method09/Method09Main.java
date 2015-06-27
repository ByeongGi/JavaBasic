package com.lec.java.method09;

import java.util.Scanner;

public class Method09Main {

	public static final int NUM_STUDENT = 10;
	
	public static void main(String[] args) {
		System.out.println("메소드와 배열");
		
		// 점수를 저장할 배열 선언
		int[] score = new int[NUM_STUDENT];
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 점수를 입력받아서 score 배열에 저장
		inputScore(sc, score);
		
		// 저장된 점수를 확인
		displayScore(score);
		
		// 총점 계산
		int total = calcTotal(score);
		System.out.println("총점: " + total);
		
		// 평균 계산
		double average = (double) total / NUM_STUDENT;
		System.out.println("평균: " + average);
		
		// 점수들 중에서 최대값 출력
		int max = findMax(score);
		System.out.println("최대값: " + max);
		
		// 점수들 중에서 최소값 출력
		int min = findMin(score);
		System.out.println("최소값: " + min);
		
		sc.close();

	} // end main()
	
	
	// method name: inputScore
	// return: void
	// arguments: 
	//   1) Scanner sc - 입력장치
	//   2) int[] score: 점수를 입력받아서 저장할 배열
	public static void inputScore(Scanner sc, int[] score) {
		System.out.println("length: " + score.length);
		
		for (int i = 0; i < score.length; i++) {
			System.out.println("점수" + (i+1) + " 입력:");
			score[i] = sc.nextInt();
			
		} // end for
		
	} // end inputScore()
	
	
	// method name: displayScore
	// return: void
	// arguments: int[] score - 출력할 점수가 저장된 배열
	public static void displayScore(int[] score) {
		// for문 또는 enhanced for문
		System.out.println("점수");
		System.out.println("--------------------");
		
		for (int x : score) {
			System.out.print(x + "\t");
		} // end for
		
		System.out.println();
		System.out.println("--------------------");
		
	} // end displayScore()
	
	
	// method name: calcTotal
	// return: int (계산된 총점을 리턴)
	// arguments: int[] score (점수들을 저장한 배열)
	public static int calcTotal(int[] score) {
		int total = 0;
		for (int x : score) {
			total += x;
		} // end for
		
		return total;
		
	} // end calcTotal()
	
	
	// method name: findMax
	// return: int (최대값)
	// arguments: int[] score (점수들 저장된 배열)
	public static int findMax(int[] score) {
		int max = score[0];
		for (int x : score) {
//			if (x > max) {
//				max = x;
//			} // end if
			max = (x > max) ? x : max;
			
		} // end for
		
		return max;
	} // end findMax()
	
	
	// method name: findMin()
	// return: int (최소값)
	// arguments: int[] score
	public static int findMin(int[] score) {
		int min = score[0];
		for (int x : score) {
			min = (x < min) ? x : min;
//			if (x < min) {
//				min = x;
//			}
		} // end for
		
		return min;
	} // end findMin

} // end class Method09Main












