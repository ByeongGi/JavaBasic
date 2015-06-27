package com.lec.java.inner02;

public class Inner02Main {

	public static void main(String[] args) {
		System.out.println("멤버 내부 클래스 활용");
		// 상속 관계로 묶을 수는 없지만,
		// A라는 객체가 생성된 이후에야 존재할 수 있는 B라는 객체가 있다고 한다면,
		// B를 A의 멤버 내부 클래스로 선언한다.
		// (예) 컴퓨터-CPU/메모리, 자동차-타이어
		
		// 멤버 내부 클래스 Tire 객체를 생성하기 위해서는
		// 외부 클래스인 Car 객체가 먼저 생성되어야 함.
		// 외부 클래스 인스턴스 생성 -> 내부 클래스 인스턴스 생성
		Car myCar = new Car(0xffffffff);
		Car.Tire myTire = myCar.new Tire(17);
		myTire.displayInfo();
		
		System.out.println();
		Car.Tire myTire2 = myCar.new Tire(19);
		myTire2.displayInfo();
		
	} // end main()

} // end class Inner02Main













