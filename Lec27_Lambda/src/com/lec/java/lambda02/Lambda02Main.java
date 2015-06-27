package com.lec.java.lambda02;

public class Lambda02Main {

	public static void main(String[] args) {
		System.out.println("익명 클래스, 람다 표현식 연습");
		
		System.out.println();
		System.out.println("[1]");
		// 1. 익명 클래스
		Test01 t01 = new Test01() {

			@Override
			public void testPrint() {
				System.out.println("안녕하세요~~~ 여러분!!!");
				
			} // end testPrint()
			
		};
		t01.testPrint();
		
		// 2. 람다 표현식
		Test01 lambda01 = () -> System.out.println("안녕하세요~~~ 여러분!!!");
		lambda01.testPrint();

		// 3. 클래스
		Test01 t011 = new Test01Imple();
		t011.testPrint();
		
		
		System.out.println();
		System.out.println("[2]");
		// 1. 클래스
		Test02 t02 = new Test02Imple();
		t02.testPrint(100);
		
		// 2. 익명 클래스
		Test02 t03 = new Test02() {
			@Override
			public void testPrint(int num) {
				System.out.println("num = " + num);
				
			} // end testPrint()
		};
		t03.testPrint(100);
		
		// 3. 람다 표현식
		Test02 lambda02 = (x) -> System.out.println("num = " + x);
		lambda02.testPrint(100);
		
		System.out.println();
		System.out.println("[3]");
		// 1. 클래스
		Test03 t04 = new Test03Imple();
		int result = t04.max(10, 20);
		System.out.println("result = " + result);
		
		// 2. 익명 클래스
		Test03 t05 = new Test03() {
			@Override
			public int max(int n1, int n2) {
				
				return (n1 > n2) ? n1 : n2;
			} // end max()
			
		};
		result = t05.max(10, 20);
		System.out.println("result = " + result);
		
		// 3. 람다 표현식
		// 람다 표현식: (매개변수 리스트...) -> 리턴값
		// 매개변수의 타입은 생략해서 표현이 가능
		// 매개변수가 여러개 있을 경우,
		// 모든 매개변수의 타입을 생략해서 표현하거나,
		// 모든 매개변수의 타입을 모두 다 표현해야 함. 
		Test03 lambda03 = (x, y) -> (x > y) ? x : y;
		result = lambda03.max(10, 20);
		System.out.println("result = " + result);
		
		Test03 lambda04 = (x, y) -> {
			if (x > y) {
				return x;
			} else {
				return y;
			}
		};
		result = lambda04.max(10, 20);
		System.out.println("result = " + result);
		
		
		System.out.println();
		System.out.println("[4]");
		// 1. 클래스
		Test04 t06 = new Test04Imple();
		result = t06.myStrLen("Java");
		System.out.println("result = " + result);
		
		// 2. 익명 클래스
		Test04 t07 = new Test04() {
			@Override
			public int myStrLen(String str) {
				
				return str.length();
			} // end myStrLen()
		};
		result = t07.myStrLen("java");
		System.out.println("result = " + result);
		
		// 3. 람다 표현식
		Test04 lambda05 = (x) -> x.length();
		result = lambda05.myStrLen("Java");
		System.out.println("result = " + result);
		
		
		System.out.println();
		System.out.println("[5]");
		// 클래스
		Test05 t08 = new Test05Imple();
		t08.printMax(3.14, 1.2);
		
		// 익명 클래스
		Test05 t09 = new Test05() {
			@Override
			public void printMax(double x, double y) {
				System.out.println("x = " + x);
				System.out.println("y = " + y);
				
				if (x > y) {
					System.out.println(x + " > " + y);
				} else {
					System.out.println(x + " <= " + y);
				}
				
			} // end printMax
			
		};
		t09.printMax(3.14, 1.2);
		
		// 람다 표현식
		Test05 lambda06 = (x, y) -> {
			System.out.println("x = " + x);
			System.out.println("y = " + y);
			
			if (x > y) {
				System.out.println(x + " > " + y);
			} else {
				System.out.println(x + " <= " + y);
			}
		};
		lambda06.printMax(3.14, 1.2);
		
	} // end main()

} // end class Lambda02Main

















