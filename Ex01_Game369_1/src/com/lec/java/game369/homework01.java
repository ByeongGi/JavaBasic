package com.lec.java.game369;

public class homework01 {
//	1) 1~100까지 수를 출력
//	2) 10개 숫자마다 line break
//	3) 숫자 중에 3,6,9가 포함된 경우는 *로 출력
	
	public static void main(String[] args) {
		
		for(int a = 0; a <=9; a++){
			for(int b = 0; b <= 9; b++){
				
				if((a % 3 == 0 && a != 0)|| (b % 3 == 0 && b != 0)) {
					if(a % 3 == 0 && b == 1){
						System.out.println();
					}
					String c = "*";
					String d = "*";
					System.out.print(" " + c + d + " ");
					continue;
				} // 이 경우 정수 대신 *이 출력된다.
				
				System.out.print(" " + a + b + " ");
				
				if(b == 0){		
					System.out.println();
				}
			}	// end inner for
		
		} // end outer for
		
		System.out.println("100");
	}
}
