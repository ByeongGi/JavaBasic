package com.lec.java.loop01;

public class Loop01Main {

	public static void main(String[] args) {
		System.out.println("Break");
		
		int num = 1;
		while (num <= 10) {
			System.out.println(num);
			
			// num이 3이 되는 순간 while 반복문 종료
			if (num == 3) {
				break;
				// break를 만나게 되면 가장 가까운 반복문을 끝냄
			}
			
			num++;
		} // end while ()
		System.out.println("while 끝난 후 num = " + num);
		
		
		System.out.println();
		// 2와 7의 최소공배수를 출력
		// 최소공배수: 공배수 중에서 가장 작은 수
		num = 1;
		while (num <= 100) {
			if (num % 2 == 0 && num % 7 == 0) {
				// 2의 배수 && 7의 배수 -> 2와 7의 공배수
				System.out.println(num);
				
				break;
			} // end if
			
			num++;
		} // end while

		
		System.out.println();
		System.out.println("무한 루프와 break;");
		num = 1;
		while (true) {
			System.out.println(num);
			num++;
			
			// 어떤 조건을 만족하면 무한 루프를 끝내라...
			if (num == 5) {
				break;
			}
			
		} // end while
		
		
	} // end main()

} // end class Loop01Main









