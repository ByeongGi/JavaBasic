package com.lec.java.loop02;

public class Loop02Main {

	public static void main(String[] args) {
		System.out.println("continue;");
		
		int num = 1;
		while (num <= 10) {
			if (num % 2 == 0) {
				num++;
				continue;
				// continue를 만나게 되면
				// while의 조건 체크하는 곳으로 점프
			} // end if
			
			System.out.println(num);
			num++;
		} // end while
		
		System.out.println();
		// for문과 continue를 사용해서
		// 1 ~ 10 숫자 중 짝수만 출력
		for (num = 1; num <= 10; num++) {
			if (num % 2 == 1) {
				continue;
			}
			
			System.out.println(num);
		} // end for
		
		
		System.out.println();
		// for 문으로 무한루프 만들기
		int count = 1;
		for ( ; ; ) {
			System.out.println("안녕하세요... " + count);
			count++;
			
			if (count == 10) {
				break;
				// break;를 만나게 되면 가장 가까운 반복문(for문)을 끝냄.
			}
		} // end for
		

	} // end main

} // end class Loop02Main









