package com.lec.java.lambda03;

public class Lambda03Main {

	public static void main(String[] args) {
		System.out.println("익명 클래스, 람다 표현식 연습");
		
		System.out.println();
		
		TestMath tm01 = new TestMath();
		
		System.out.println();
		System.out.println("[1]");
		
		// 인터페이스를 구현하는 클래스의 인스턴스를 생성해서 사용
		MyMath adder = new Adder();
		tm01.test(1.1, 2.2, adder);
		
		MyMath sub = new Subtracter();
		tm01.test(1.1, 2.2, sub);
		
		
		System.out.println();
		System.out.println("[2]");
		
		// 익명 클래스 사용
		tm01.test(1.1, 2.2, new MyMath() {

			@Override
			public double operate(double x, double y) {
				
				return x + y;
			} // end operate
			
		});
		
		tm01.test(1.1, 2.2, new MyMath() {

			@Override
			public double operate(double x, double y) {
				
				return x - y;
			} // end operate
			
		});
		
		
		System.out.println();
		System.out.println("[3]");
		
		// 람다 표현식
		tm01.test(1.1, 2.2, (x, y) -> x + y);
		tm01.test(1.1, 2.2, (x, y) -> x - y);


		System.out.println();
		System.out.println("============================");
		
		System.out.println();
		System.out.println("클래스 인스턴스 사용");
//		MyMath mul = new Multiplier();
		tm01.test(1.1, 2.2, new Multiplier());
		tm01.test(1.1, 2.2, new Divider());
		
		System.out.println();
		System.out.println("익명 클래스 사용");
		tm01.test(1.1, 2.2, new MyMath() {
			@Override
			public double operate(double x, double y) {
				
				return x * y;
			} // end operate()
			
		});
		
		tm01.test(1.1, 2.2, new MyMath() {
			@Override
			public double operate(double x, double y) {
				
				return x / y;
			} // end operate()
			
		});
		
		System.out.println();
		System.out.println("람다 표현식");
		tm01.test(1.1, 2.2, (x, y) -> x * y);
		tm01.test(1.1, 2.2, (x, y) -> x / y);
		
	} // end main()

} // end class Lambda03Main














