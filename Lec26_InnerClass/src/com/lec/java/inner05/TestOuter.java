package com.lec.java.inner05;

public class TestOuter {
	// TestOuter 클래스의 멤버 변수
	private int num1 = 100;
	
	// TestOuter 클래스의 멤버 메소드
	public void testLocal() {
		int num2 = 200; // 메소드 testLocal()의 지역 변수
		
		
		// 메소드 testLocal() 내부에서 정의된 Local inner class
		class TestLocal {
			// 지역 클래스 TestLocal의 멤버 변수
			private int num3 = 300;
			
			// 지역 클래스 TestLocal의 멤버 메소드
			public void showNumbers() {
				// 외부 클래스의 멤버 변수 출력
				System.out.println("num1 = " + num1);
				
				// 메소드의 지역 변수 출력
				System.out.println("num2 = " + num2);
				
				// 로컬 내부 클래스(자기 자신)의 멤버 변수 출력
				System.out.println("num3 = " + num3);
				
			} // end showNumbers()
			
			
		} // end class TestLocal
		
		// 지역 내부 클래스 인스턴스 생성은 클래스가 정의된 메소드 안에서만 가능
		TestLocal local = new TestLocal();
		local.showNumbers();
		
		
	} // end testLocal()
	
	
} // end class TestOuter













