package com.lec.java.inner02;

public class Car {
	// 멤버 변수:
	private int color;
	
	// 생성자
	public Car(int color) {
		this.color = color;
	}
	
	// 메소드
	public void displayCarInfo() {
		System.out.println("color: " + color);
	}
	
	// 멤버 내부 클래스
	public class Tire {
		private int radius;
		
		public Tire(int radius) {
			this.radius = radius;
		}
		
		public void displayInfo() {
			System.out.println("--- 자동차 정보 ---");
			System.out.println("color: " + color);
			// 외부 클래스의 private 멤버 변수를 직접 접근 가능
			
			System.out.println("tire: " + radius);
		} // end displayInfo()
		
	} // end class Tire
	
} // end class Car











