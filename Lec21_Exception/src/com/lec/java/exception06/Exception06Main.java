package com.lec.java.exception06;

public class Exception06Main {

	public static void main(String[] args) throws Exception {
		System.out.println("예외 처리2");
		
		System.out.println();
		TestClass test = new TestClass();
		int result = test.divide(123, 0);
		System.out.println("result = " + result);
		
		
		System.out.println();
		// divide2() 메소드가 throw Exception을 하고 있기 때문에
		// 메소드를 호출하는 곳에서 예외 처리를 해 주지 않으면 컴파일 에러
		// 반드시 메소드 호출하는 곳에서 예외 처리를 해 주어야 함.
		try {
			test.divide2(123, 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		test.divide2(111, 0);
		
		System.out.println("프로그램 종료...");

	} // end main()

} // end class Exception06Main












