package com.lec.java.lambda03;

public class TestMath {
	private double x;
	private double y;
	
	// 멤버 메소드
	public void test(double x, double y, MyMath calc) {
		double result = calc.operate(x, y);
		System.out.println("result = " + result);
		
	} // end test()
	
} // end class TestMath





