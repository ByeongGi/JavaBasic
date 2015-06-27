package com.lec.java.loop04;

public class Loop04Main {

	public static void main(String[] args) {
		System.out.println("이중 반복문과 break 연습");
		
		System.out.println();
		System.out.println("이중 for문과 break");
		for (int dan = 2; dan < 10; dan += 2) {
			System.out.println(dan + "단");
			for (int n = 1; n <= 10; n++) {
				System.out.println(dan + " x " + n + " = " + (dan * n));
				if (dan == n) {
					break;
				} // end if
				
			} // end for (n)
			
			System.out.println();
		} // end for (dan)
		
		
		System.out.println();
		System.out.println("이중 while문과 break");
		int dan = 2;
		while (dan < 10) {
			System.out.println(dan + "단");
			int n = 1;
			while (n < 10) {
				System.out.println(dan + " x " + n + " = " + (dan * n));
				if (dan == n) {
					break;
				} // end if ()
				
				n++;
			} // end while (n)
			
			dan += 2;
		} // end while (dan)

	} // end main ()

} // end class Loop04Main








