package com.lec.java.game369;

public class While03Main {

	public static void main(String[] args) {
		System.out.println("while 연습");
		
		// 1 ~ 10 까지 수 중에서 홀수만 출력-------------
		
		int count = 1;
		while (count <= 10) {
			if(count % 2 ==1){
				System.out.println(count);
			}
			count ++;
		}	// end while
		
		// 1 ~ 10 까지 수 중에서 홀수만 출력------------
		System.out.println();
		count = 1;
		while (count <= 10) {
				System.out.println(count);
			count += 2;
		}	// end while
		
		//--------------------------- 3 6 9 -------------
		System.out.println("---------- 3 6 9 Game Table ----------------------------------------------");
		int num = 1;
		while (num <= 100){
			
			
			// sw logic body -----------------------------
			// 10이하의 수는 3의 배수를 *로 대치
			if ((num <10) && (num % 3 == 0)){
				System.out.print("*" + "\t");
			} 
			// 10이상의 수는 나머지에 3,6,9가 포함된 수는 *로 대치
			else if ( (num>10) && ( (num%10 == 3) || (num%10 == 6) || (num%10 == 9) ) ){
				System.out.print("*" + "\t");
			}
			// 10이상의 수는 몫에 3,6,9가 포함된 수는 *로 대치
			else if ( (num>10) && ( (num/10 == 3) || (num/10 == 6) || (num/10 == 9) ) ){
				System.out.print("*" + "\t");
			}
			// 위의 조건에 해당이 없는 수는 , 그냥 그대로 출력
			else{
			System.out.print(num + "\t");
			}
						
			// 10번째 숫자 마다 new line feed --------------
			if (num % 10 ==0){
				System.out.println();
			} 
			num ++;
			
		}	// end while
		System.out.println("-----------------------------------------------------------------------------");
		//-------------------------------------------------

	}	// end main

}	// end class
