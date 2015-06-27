package com.lec.java.game369;

public class WhiletestMain {

	public static void main(String[] args) {
		System.out.println("3, 6, 9 게임");
		System.out.println("=================================== start");
		
		int n = 0;
		
		while (n < 100 ) {
			n++;
			
			int n_10 = (int)n / 10;				// 십단위 계산
			int n_1 	 = n % 10;					// 단단위 계산	

			boolean flag_10 = false;		// 십단위 체커
			boolean flag_1	 = false;		// 단단위 체커
			
			switch (n_10) {
			case 3:
			case 6:
			case 9:
				flag_10 = true;					// 십단위 3, 6, 9 출현
				break;
			} // end switch

			switch (n_1) {
			case 3:
			case 6:
			case 9:
				flag_1 = true;					// 단단위 3, 6, 9 출현
				break;
			} // end switch
			
			if 			(flag_10 && flag_1)		System.out.print("**\t");				// 십단위-단단위 모두  3, 6, 9 출현 - "**" 인쇄
			else if 	(flag_10 || flag_1) 		System.out.print("*\t");				// 십단위 혹은 단단위 3, 6, 9 출현 - "*" 인쇄
			else 										System.out.print(n + "\t");			// 나머지는 바로 인쇄
			
			if (n%10==0) 						System.out.println();					// 10개씩 끊어서 인쇄
		} // end while

		System.out.println("=================================== end");
		
	} // end main()

} // end class WhiletestMain
