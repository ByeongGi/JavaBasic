package com.lec.java.access03;

public class Test03 {

	// 메소드
	// 접근권한수식어 리턴타입 메소드이름(매개변수, ...) {}
	// private
	private void privateMethod() {
		System.out.println("Test03 - private method");
	}
	
	// (default)
	void defaultMethod() {
		System.out.println("Test03 - default method");
	}
	
	// protected
	protected void protectedMethod() {
		System.out.println("Test03 - protected method");
	}
	
	// public
	public void publicMethod() {
		System.out.println("Test03 - public method");
	}
	
	
	void test() {
		privateMethod();
		defaultMethod();
		protectedMethod();
		publicMethod();
		
		// 같은 클래스 안에서는
		// 선언된 모든 메소들을 
		// 메소드 이름만 써서 사용할 수 있다.
		
	} // end test()
	
} // end class Test03










