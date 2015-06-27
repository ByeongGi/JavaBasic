package com.lec.java.lambda01;

public class Lambda01Main {

	public static void main(String[] args) {
		System.out.println("인터페이스, 익명 클래스, 람다 표현식");
		
		System.out.println();
		System.out.println("[1] 인터페이스를 구현하는 클래스");
		// 인터페이스 Adder를 구현하는 클래스 AdderImple 타입의 인스턴스 생성
		Adder myAdder = new AdderImple();
		//AdderImple myAdder2 = new AdderImple();
		
		// Adder 인스턴스의 메소드 add()를 사용
		double result = myAdder.add(1.11, 2.22);
		System.out.println("result = " + result);
		
		
		System.out.println();
		System.out.println("[2] 익명 클래스 사용");
		// 익명 클래스: 이름이 없는 로컬 내부 클래스
		//   메소드 내부에서 인스턴스 생성과 동시에 클래스를 정의하는 것.
		Adder myAdder2 = new Adder() {

			@Override
			public double add(double x, double y) {
				
				return x + y;
			} // end add()
			
		};
		
		// 익명 클래스의 인스턴스를 사용해서 add() 메소드 호출
		result = myAdder2.add(1.11, 2.22);
		System.out.println("result = " + result);
		
		result = new Adder() {

			@Override
			public double add(double x, double y) {
				
				return x + y;
			} // end add()
			
		}.add(1.11, 2.22);
		System.out.println("result = " + result);

		
		System.out.println();
		System.out.println("[3] 람다 표현식(lambda expression) 사용");
		// 람다 표현식:
		// (매개변수 리스트) -> 리턴값
		
		Adder myAdder3 = (x, y) -> x + y;
		result = myAdder3.add(1.11, 2.22);
		System.out.println("result = " + result);
		
	} // end main()

	
	
} // end class Lambda01Main


// 인터페이스 정의
interface Adder {
	public abstract double add(double x, double y);
	
} // end interface Adder


// 인터페이스를 구현하는 클래스를 정의
class AdderImple implements Adder {

	@Override
	public double add(double x, double y) {
		
		return x + y;
	} // end add()
	
} // end class AdderImple












