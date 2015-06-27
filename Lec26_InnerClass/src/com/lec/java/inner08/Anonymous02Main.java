package com.lec.java.inner08;

public class Anonymous02Main {

	public static void main(String[] args) {
		System.out.println("익명 내부 클래스 활용");
		
		System.out.println();
		System.out.println("익명 클래스를 사용하지 않을 경우");
		MyMath tc = new TestMyMath();
		double result = tc.operate(1.0, 2.0);
		System.out.println("result = " + result);
		
		
		System.out.println();
		System.out.println("익명 클래스 사용");
		MyMath tc2 = new MyMath() {

			@Override
			public double operate(double x, double y) {
				
				return x + y;
			} // end operate
		};
		result = tc2.operate(1.0, 2.0);
		System.out.println("result = " + result);
		
		System.out.println();
		MyMath tc3 = new MyMath() {

			@Override
			public double operate(double x, double y) {
				
				return x - y;
			} // end operate()
			
		};
		result = tc3.operate(1.0, 2.0);
		System.out.println("result = " + result);
		
		
		System.out.println();
		result = new MyMath() {

			@Override
			public double operate(double x, double y) {
				
				return x * y;
			} // end operate()
			
		}.operate(1.0, 2.0);
		System.out.println("result = " + result);
		
	} // end main()

} // end class Anonymous02Main


interface MyMath {
	public abstract double operate(double x, double y);
	
} // end interface MyMath

class TestMyMath implements MyMath {

	@Override
	public double operate(double x, double y) {
		
		return x + y;
	} // end operate()
	
} // end clss TestMyMath
















