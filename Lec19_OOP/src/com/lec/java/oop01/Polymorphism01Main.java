package com.lec.java.oop01;

public class Polymorphism01Main {

	public static void main(String[] args) {
		System.out.println("다형성(Polymorphism)");
		
		System.out.println();
		Vehicle car1 = new Vehicle();
		Car car2 = new Car();
		HybridCar car3 = new HybridCar();
		car1.displayInfo();
		car2.displayInfo();
		car3.displayInfo();
		
		System.out.println();
		Vehicle car4 = new Car();
		// 자동차(Car)는 탈것(Vehicle)이다.
		
		Vehicle car5 = new HybridCar();
		// 하이브리드 자동차(HybridCar)는 탈것(Vehicle)이다.
		
		Car car6 = new HybridCar();
		// 하이브리드 자동차(HybridCar)는 자동차(Car)이다.
		
		car4.displayInfo();
		car5.displayInfo();
		car6.displayInfo();
		

	} // end main()

} // end class Polymorphism01Main











