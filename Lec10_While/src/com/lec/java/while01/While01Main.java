package com.lec.java.while01;

public class While01Main {

	public static void main(String[] args) {
		System.out.println("while 반복문");
		
		int count = 1;
		while (count <= 10) {
			System.out.println(count);
			count++;
		} // end while
		System.out.println("while 끝난 후 count = " + count);
		
		System.out.println();
		// 10, 9, 8, ... , 1까지 출력
		count = 10; // 초기화
		while (count > 0) {
			System.out.println(count);
			count--;
		} // end while
		System.out.println("while 끝난 후 count = " + count);

	} // end main()
	
} // end class While01Main









