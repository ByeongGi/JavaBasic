package com.lec.java.inherit07;

public class Inherit07Main {

	public static void main(String[] args) {
		System.out.println("상속: Method Overriding(재정의)");
		
		System.out.println();
		// Person 클래스의 인스턴스 생성
		Person p1 = new Person();
		p1.setName("abc");
		p1.showInfo();
		
		
		System.out.println();
		// BusinessPerson 클래스의 인스턴스를 생성
		BusinessPerson p2 = new BusinessPerson();
		p2.setName("성춘향"); // 부모 클래스인 Person에 있는 setName()을 사용
		p2.setCompany("(주)조선");
		p2.showInfo(); // 메소드 overriding
		
		System.out.println();
		p2.showInfo(1); // 메소드 overloading
		

	} // end main()

} // end class Inherit07Main









