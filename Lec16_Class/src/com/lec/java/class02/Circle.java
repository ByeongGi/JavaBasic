package com.lec.java.class02;

public class Circle {
	// 원(동그라미)가 가질 수 있는 상태(속성) -> 멤버 변수
	private double radius;
	
	// 생성자(Constructor): 멤버변수들의 초기화
	// 생성자의 이름은 반드시 클래스의 이름과 동일
	// 생성자는 리턴 타입이 없다.
	// 생성자도 매개변수(argument)를 가질 수 있습니다.
	// 생성자도 overload가 가능
	// 클래스를 만들 때, 생성자를 따로 만들지 않으면
	// 디폴트 생성자를 자동으로 만들어 줌.
	// 디폴트 생성자: 매개변수가 없는 생성자, 모든 멤버변수를 기본값으로 초기화
	// (주의) 클래스에서 하나 이상의 생성자를 만들게 되면,
	// 자동으로 디폴트 생성자를 만들어 주지 않습니다.
	
	public Circle() { 
		System.out.println("반지름: " + radius);
	}
	public Circle(double r) {
		radius = r;
		System.out.println("반지름: " + radius);
	}
	
	
	
	// 원(동그라미)의 기능(동작) -> 메소드
	// 원의 둘레 계산
	public double calcPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	// 원의 넓이 계산
	public double calcArea() {
		return Math.PI * radius * radius;
	}
	
} // end class Circle











