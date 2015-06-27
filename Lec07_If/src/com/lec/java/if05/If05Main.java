package com.lec.java.if05;

public class If05Main {

	public static void main(String[] args) {
		System.out.println("중첩된 if 문");
		
		int num = 98;
		if (num % 2 == 0) {
			System.out.println("짝수");
			
			if (num % 4 == 0) {
				System.out.println("4의 배수");
			} else {
				System.out.println("짝수이긴 하지만 4의 배수는 아님");
			} // end 안쪽 else
			
		} else {
			System.out.println("홀수");
			
		} // end 바깥 else

		System.out.println("프로그램 끝");
		
	} // end main()

} // end class If05Main










