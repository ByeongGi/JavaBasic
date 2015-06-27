package com.lec.java.access01;

public class Test01 {
	// 접근권한 수식어: private, (default), protected, public
	// 접근권한수식어 자료형 변수이름;
	private int privateNum;
	int defaultNum;
	protected int protectedNum;
	public int publicNum;
	
	// 메소드
	void test() {
		privateNum = 111; // 자신이 선언된 클래스에서 직접 사용 가능
		defaultNum = 222;
		protectedNum = 333;
		publicNum = 444;
		// 클래스의 멤버변수들은 같은 클래스에 있는 모든 메소드에서 
		// 직접 사용이 가능 
		
	} // end test()
	
} // end class Test02








