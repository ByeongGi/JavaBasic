package com.lec.java.switch01;

public class Switch01Main {

	public static void main(String[] args) {
		System.out.println("switch 문");
		
		// switch (조건):
		// 해당 조건의 case문을 찾아서 거기서부터 break를 만날 때까지
		// 실행을 함.
		// break를 만나게 되면 switch 문장을 종료.
		// 해당하는 case가 없으면 default 문장을 실행함.
		
		int num = 2;
		switch (num) {
		case 1:
			System.out.println("하나");
			System.out.println("ONE");
			break;
			
		case 2:
			System.out.println("둘");
			System.out.println("TWO");
			break;
			
		case 3:
			System.out.println("셋");
			System.out.println("THREE");
			break;
			
		default:
			System.out.println("몰라요~");
		} // end switch ()

		System.out.println();
		// switch는 if - else if - esle로 바꿀 수 있다.
		if (num == 1) {
			System.out.println("하나");
			System.out.println("ONE");
		} else if (num == 2) {
			System.out.println("둘");
			System.out.println("TWO");
		} else if (num == 3) {
			System.out.println("셋");
			System.out.println("THREE");
		} else {
			System.out.println("몰라요~");
		}
		
	} // end main()

} // end class Switch01Main










