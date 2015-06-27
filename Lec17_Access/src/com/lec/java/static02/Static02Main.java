package com.lec.java.static02;

public class Static02Main {

	public static void main(String[] args) {
		System.out.println("인스턴스 변수/메소드");
		
		// 클래스(static) 변수/메소드 사용하기
		// static 변수와 메소드는 클래스의 이름으로 사용한다.
		// 클래스이름.static변수, 클래스이름.static메소드
		Test.sNum = 123;
		Test.show2();
		System.out.println();
		
		// 클래스(static) 변수/메소드
		// 1. 메모리의 메소드 영역에 클래스가 로드될 때 딱 한번만 생긴다.
		// 2. 인스턴스가 생성되지 않아도 사용할 수 있다.
		// 3. 모든 인스턴스는 하나의 static 변수/메소드를 공유한다.
		
		
		// 인스턴스의 변수/메소드를 사용하기 위해서는
		// 인스턴스를 생성(new)부터 해야 됨
		Test t = new Test();
		t.num = 100;
		t.show();
		
		Test t2 = new Test();
		t2.show();
		
		Test.sNum = 987;
		System.out.println("t:");
		t.show();
		System.out.println("t2:");
		t2.show();
		
	} // end main()

} // end class Static02Main







