package com.lec.java.wrapper02;

public class Wrapper02Main {

	public static void main(String[] args) {
		System.out.println("auto-boxing, auto-unboxing");
		// Java 5부터 wrapper 클래스의 auto-boxing/unboxing 기능 제공
		
		Integer num1 = 10; // Integer.valueOf(10); // auto-boxing
		Integer num2 = 20;
		Integer num3 = num1 + num2;
		Integer num30 = Integer.valueOf(num1.intValue() + num2.intValue());
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		System.out.println("num30 = " + num30);
		
		System.out.println();
		System.out.println("boxing/unboxing");
		// boxing(포장): 기본자료형의 값을 wrapper 클래스에 저장하는 것
		// unboxing(개봉): wrapper 클래스에 저장된 기본자료형 값을 꺼내는 것
		Integer num4 = Integer.valueOf(100); // boxing
		int n4 = num4.intValue(); // unboxing
		System.out.println("n4 = " + n4);
		
		System.out.println();
		System.out.println("auto-boxing/auto-unboxing");
		Integer num5 = 200; // auto-boxing
		// 내부적으로는 Integer num5 = Integer.valueOf(200); 실행
		System.out.println("num5 = " + num5);
		
		int n5 = num5; // auto-unboxing
		// 내부적으로는 int n5 = num5.intValue(); 실행
		System.out.println("n5 = " + n5);
		
		System.out.println();
		System.out.println("wrapper 클래스들");
		Long num100 = Long.valueOf(100L); // boxing
		long n100 = num100.longValue(); // unboxing
		
		Double num200 = Double.valueOf(3.14); // boxing
		double n200 = num200.doubleValue(); // unboxing
		
		Long num300 = 300L; //auto-boxing
		long n300 = num300; // auto-unboxing
		
		Double num400 = 1.2345; // auto-boxing
		double n400 = num400; // auto-unboxing
		
		Double num500 = num400 + num300;
		System.out.println(num500);
		
		
	} // end main()

} // end class Wrapper02Main















