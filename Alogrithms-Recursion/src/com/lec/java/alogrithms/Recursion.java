package com.lec.java.alogrithms;
import java.util.Scanner;


public class Recursion {
	// 팩토리얼 구현 
	// n!  n=0 이 라면  n!=1
	//     n*(n-1)! 1>=0
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int n = sc.nextInt(); // 시스템으로부터 입력을 받는다.
		
		if (n > 0) { // n이 양수(+)일때만 
			
			int x =factoral(n); 
			System.out.println("n! ="+x);
		} else {
			System.out.println("0이상을 입력하세요");
		}
		
			
		
		
		
	} // end class main 
	
	
	
	
	 static int factoral(int n){
		 
		 if (n==1) { // n 이 1 이면 1을 리턴한다.
			return 1;
		} else{
			return n*(factoral(n-1)); // n이 1 이 아닌경우에
									  // n*(n-1) 의 식으로 순환시킨다.
		}

		
	} // end factoral 
	
	
	

} // end Recursion
