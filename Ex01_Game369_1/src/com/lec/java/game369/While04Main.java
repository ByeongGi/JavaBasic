package com.lec.java.game369;

public class While04Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("## 과제: 3.6.9 !! ##");
		
		int i, k;
		String str;
		System.out.println("");
		//============================================================
		// 방법1: 한 자리씩 숫자를 내려오며 맨아래 1의 자리수를 3의 배수인것만 * 출력
		// 두개의 while 문 + if 문으로 구현
		//============================================================
		
		System.out.println("## 방법1: 한자리씩 깍아 내려오면서 1의 자리수가 3의 배수인것만 * 출력");
		i=1;
		while(i <= 100){  // 100			
			k = i;			
			while (k > 0){				
				if( (k%10) != 0 && (k%10) % 3 == 0){		// k가 10의 배수가 아니며, 10으로 나눈뒤 나머지, 즉 1의 자리수만 남았을때 그 수가 3의 배수이면
					System.out.print("*\t");
					break;
				}				
				k /= 10;
			}
			if(k == 0)		// k가 0 으로 남아있다는 것은 숫자중에 3의 배수가 없었으므로 숫자 그대로 출력
				System.out.print(i + "\t");			
			
			if(i % 10 == 0)	// 매 10번째 행마다 개행
				System.out.println("");
			
			i++;				// i 증가
		} // end while		
		
		
		System.out.println("");
		
		//============================================================
		// 방법2: 숫자 + 문자 => 문자열로 변환되는 자바의 특성을 사용하여 구현
		//============================================================
		System.out.println("## 방법2: 문자열로 변환하여 3,6,9 포함 문자열은 * 출력");
		i=1;
		while(i <= 100){  // 100			
			str = i + "";		// 숫자를 String 으로 형변환
			
			// str 내에 3, 6, 9 를 포함하는지 체크
			if( str.indexOf("3") >= 0 || str.indexOf("6") >= 0 || str.indexOf("9") >= 0){				
				System.out.print("*\t");  // 포함하면 *  출력
			}else{
				System.out.print(i + "\t");  // 포함하지 않으면 숫자 출력
			} // end if
			
			if(i % 10 == 0)	// 매 10번째 행마다 개행
				System.out.println("");
			
			i++;				// i 증가
		} // end while

	
		System.out.println("");
		
		
		//============================================================
		// 방법3 : 1의 자리에서 3의 배수 발생여부 체크, 
		//            10의 자리에서 3의 배수 발생여부 체크
		//            논리연산자 와  % , /  연산자로 구현
		//============================================================
		
		System.out.println("## 방법3:  논리연산자와 % / 연산자로 구현");
		i=1;
		while(i <= 100){  // 100			
			// 1의 자리와 10의 자리에서 3의 배수 여부 확인. 
			if( ( (i % 10) != 0 &&  ((i%10)%3) == 0  )|| ( ((i/10) % 10) != 0 &&  (((i/10)%10)%3) == 0  )){				
				System.out.print("*\t");  //  *  출력
			}else{
				System.out.print(i + "\t"); // 숫자 출력
			} // end if
			
			if(i % 10 == 0)	// 매 10번째 행마다 개행
				System.out.println("");
			
			i++;				// i 증가
		} // end while		
	} // main
} // while
