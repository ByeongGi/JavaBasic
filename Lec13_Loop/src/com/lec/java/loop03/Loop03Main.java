package com.lec.java.loop03;

public class Loop03Main {

	public static void main(String[] args) {
		System.out.println("이중 for 문");

		// 구구단 출력
		for (int dan = 2; dan < 10; dan++) {

			System.out.println("구구단 " + dan + "단");
			for (int n = 1; n < 10; n++) {
				System.out.println(dan + " x " + n + " = " + (dan * n));
			} // end for (n)
			System.out.println();

		} // end for (dan)
		
		System.out.println();
		// while 문을 2번 사용해서 구구단 출력
		int dan = 2;
		while (dan < 10) {
			System.out.println("구구단 " + dan + "단");
			int n = 1;
			while (n < 10) {
				System.out.println(dan + " x " + n + " = " + (dan * n));
				n++;
			} // end while (n)
			System.out.println();

			dan++;
		} // end while (dan)
		
	} // end main()

} // end class Loop03Main









