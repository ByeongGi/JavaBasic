package com.lec.java.inherit04;

public class Inherit04Main {

	public static void main(String[] args) {
		System.out.println("상속과 생성자");
		
		System.out.println();
		// Vehicle 클래스의 인스턴스 생성
		Vehicle ve = new Vehicle();
		
		System.out.println();
		// Car 클래스의 인스턴스 생성
		Car car1 = new Car();
		System.out.println("speed: " + car1.speed);
		System.out.println("gear: " + car1.gear);
		// 실행 결과:
		// 부모 클래스의 생성자(Vehicle())가 먼저 호출되고 나서,
		// 자식 클래스의 생성자(Car())가 호출된다.
		// 부모 클래스의 인스턴스가 생성되고 나서,
		// 자식 클래스의 인스턴스가 생성된다.
		
		System.out.println();
		// ElectricCar 클래스의 인스턴스 생성
		ElectricCar car2 = new ElectricCar();
		
		
		System.out.println();
		// speed가 100인 Vehicle 인스턴스 생성
		Vehicle ve2 = new Vehicle(100);
		
		System.out.println();
		// speed=100, gear=6인 Car 인스턴스 생성
		Car car3 = new Car(100, 6);

	} // end main()

} // end class Inherit04Main











