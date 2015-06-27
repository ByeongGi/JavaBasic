package com.lec.java.exercise;

import java.util.Scanner;

public class GradeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력: System.in
		// 출력: System.out
		
		System.out.println("num1을 입력하세요:");
		int num1 = sc.nextInt(); // 키보드로 입력을 받아서 num1에 저장
		System.out.println("입력한 숫자는 " + num1 + "이군요~~");
		
		System.out.println("num2을 입력하세요:");
		int num2 = sc.nextInt(); // 키보드로 입력을 받아서 num2에 저장
		System.out.println("이번에 입력한 숫자는 " + num2 + "이군요~~");
		
		sc.close();

	} // end main()

} // class GradeMain
