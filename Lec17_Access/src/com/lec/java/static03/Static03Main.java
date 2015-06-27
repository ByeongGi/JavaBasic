package com.lec.java.static03;

public class Static03Main {

	public static void main(String[] args) {
		System.out.println("Singleton 디자인 패턴");
		
		// Test 클래스의 인스턴스 생성
		Test t1 = Test.getInstance();
		System.out.println("t1: num = " + t1.getNum());
		t1.setNum(123);
		System.out.println("t1: num = " + t1.getNum());
		
		System.out.println();
		Test t2 = Test.getInstance();
		t2.setNum(12345);
		System.out.println("t1: num = " + t1.getNum());
		System.out.println("t2: num = " + t2.getNum());

	} // end main()

} // end class Static03Main











