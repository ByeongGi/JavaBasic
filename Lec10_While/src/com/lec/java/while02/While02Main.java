package com.lec.java.while02;

public class While02Main {

	public static void main(String[] args) {
		System.out.println("while 연습");
		
		// 구구단 2단을 while문을 사용해서 출력
		int n = 1; // 초기식
		int dan = 2;
		while (n < 10) {
			System.out.println(dan + " x " + n + " = " + (dan * n));
			n++; // 조건 변경, 증감식
		} // end while

	} // end main()

} // end class While02Main









