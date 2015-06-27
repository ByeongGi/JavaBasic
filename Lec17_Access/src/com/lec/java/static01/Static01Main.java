package com.lec.java.static01;

import java.util.Scanner;

// 인스턴스 변수: 
//   클래스에 선언된 멤버 변수인데,
//   인스턴스를 생성한 다음에(new 생성자(); 호출된 다음에)
//   사용할 수 있는 변수
// 인스턴스 메소드:
//   인스턴스를 생성한 다음에(new 생성자(); 호출된 다음에)
//   사용할 수 있는 메소드
// 클래스 변수(static 변수):
//   클래스의 멤버 변수들 중에서,
//   인스턴스를 생성하지 않아도 사용할 수 있는 변수
// 클래스 메소드(static 메소드):
//   인스턴스를 생성하지 않아도 사용할 수 있는 메소드


public class Static01Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void test() {
		System.out.println("Hello, Java!");
	}
	
	public void test2() {
		System.out.println("안녕하세요~~");
	}
	
	public static void main(String[] args) {
		System.out.println("인스턴스 변수/메소드 vs 클래스 변수/메소드");
		
		// static 변수/메소드:
		// 인스턴스 생성 없이(new 하지 않고) 사용 가능
		int n = sc.nextInt();
		System.out.println("n = " + n);
		test();
		
		// static 메소드 안에서 static이 아닌 메소드를 바로 호출할 수는 없다.
		//test2(); // 컴파일 에러
		
		// 인스턴스 변수/메소드
		// 인스턴스가 생성된 후에(new 불린 후에) 사용 가능
		Static01Main tc = new Static01Main();
		tc.test2();
		

	} // end main()

} // end class Static01Main











