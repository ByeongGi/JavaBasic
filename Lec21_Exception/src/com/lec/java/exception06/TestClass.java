package com.lec.java.exception06;

public class TestClass {
	
	// 메소드를 설계를 할 때
	// 예외 처리를 하면서(try ~ catch) 메소드를 구현
	public int divide(int x, int y) {
		int result = 0;
		try {
			result = x / y;
			
		} catch (ArithmeticException ex) {
			System.out.println(ex.getMessage());
			
		} // end catch

		return result;
	} // end divide()
	
	
	// 메소드 설계를 할 때 예외 처리를 직접 하지 않는 경우:
	// 메소드 이름 뒤에 throws Exception을 추가하면,
	// 예외가 발생한 경우에는 메소드를 호출한 곳으로 exception이 던져짐.
	public int divide2(int x, int y) throws Exception {
		
		return x / y;
	} // end divide2()
	
} // end class TestClass















