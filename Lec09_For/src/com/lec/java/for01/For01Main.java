package com.lec.java.for01;

public class For01Main {

	public static void main(String[] args) {
		System.out.println("for 반복문");
		
		// 단순 복사 & 붙여넣기
		System.out.println("Hello, Java 1");
		System.out.println("Hello, Java 2");
		System.out.println("Hello, Java 3");
		
		System.out.println();
		// for 문
		for (int count = 1; count <= 3; count++) {
			System.out.println("Hello, Java " + count);
		} // end for
		
		System.out.println();
		for (int count = 1; count <= 10; count++) {
			System.out.println(count);
		} // end for
		
		System.out.println();
		for (int count = 10; count > 0; count--) {
			System.out.println(count);
		} // end for
		
		
	} // end main()

} // end class For01Main









