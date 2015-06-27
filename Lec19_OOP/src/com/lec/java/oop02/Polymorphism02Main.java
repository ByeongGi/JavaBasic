package com.lec.java.oop02;

public class Polymorphism02Main {

	public static void main(String[] args) {
		System.out.println("다형성의 사용");
		
		Vehicle car1 = new Vehicle();
		Vehicle car2 = new Car();
		Vehicle car3 = new HybridCar();
		
		// 다형성의 유용함 1
		Vehicle[] car = new Vehicle[3];
		car[0] = new Vehicle();
		car[1] = new Car();
		car[2] = new HybridCar();
		
		// 다형성의 유용함 2
		// println의 매개변수로 Object의 참조변수가 넘겨지면,
		// 내부적으로 해당 클래스의 toString() 메소드가 불리게 됨
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		
		Polymorphism02Main p = new Polymorphism02Main();
		System.out.println(p);
		
		
		System.out.println();
		// 다형성의 유용함 3
		Vehicle car4 = new Vehicle();
		driveCar(car4);
		
		System.out.println();
		Car car5 = new Car();
		driveCar(car5);
		
		System.out.println();
		HybridCar car6 = new HybridCar();
		driveCar(car6);

	} // end main()
	
	@Override
	public String toString() {
		return "내가 만든 클래스 *^.^*";
	}
	
	public static void driveCar(Vehicle v) {
		v.setSpeed(100);
		v.displayInfo();
	}
	// 다형성으로 인해서 불필요한 메소드 overloading을 줄일 수 있다.
//	public static void driveCar(Car v) {
//		v.setSpeed(100);
//		v.displayInfo();
//	}
//	public static void driveCar(HybridCar v) {
//		v.setSpeed(100);
//		v.displayInfo();
//	}
	
	

} // end class Polymorphism02Main











