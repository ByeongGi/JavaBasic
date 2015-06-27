package com.lec.java.array01;

public class Array01Main {

	public static void main(String[] args) {
		System.out.println("배열(Array)");
		
		int korean1 = 99;
		int korean2 = 88;
		int korean3 = 77;
		System.out.println("국어1: " + korean1);
		System.out.println("국어2: " + korean2);
		System.out.println("국어3: " + korean3);
		
		System.out.println("\n===============");
		System.out.println("배열을 선언 & 초기화");
		// 자료타입[] 변수이름;
		int[] korean = new int[3];
		// int 타입의 배열을 선언, 3개의 int 타입을 저장할 수 있도록
		korean[0] = 90;
		korean[1] = 80;
		korean[2] = 70;
		//korean[3] = 60; // Exception 발생
		// 배열의 인덱스는 0부터 시작해서, (배열의 길이 - 1)까지가 됨
		System.out.println("국어0: " + korean[0]);
		System.out.println("국어1: " + korean[1]);
		System.out.println("국어2: " + korean[2]);
		
		System.out.println("for문 사용해서 출력 ");
		for (int n = 0; n < 3; n++) {
			System.out.println(korean[n]);
		} // end for (n)
		
		System.out.println();
		// int 타입의 english라는 길이가 5인 배열을 선언
		int[] english = new int[5];
		
		// 5개 값을 초기화
		for (int n = 0; n < 5; n++) {
			english[n] = n * 10;
		}
		
		// for문을 이용해서 english 배열의 들어 있는 값들을 확인
		for (int n = 0; n < 5; n++) {
			System.out.println("영어 " + n + ": " + english[n]);
		}
		
	} // end main()

} // end class Array01Main









