package com.lec.java.inherit02;

// Super Class(상위 클래스), Parent Class(부모/조상 클래스), Basic Class(기본 클래스)
// Sub Class(하위 클래스), Child Class(자식 클래스), Derived Class(유도 클래스)

// 상위클래스를 상속받아서 하위클래스를 정의하는 방법
// class 하위클래스 extends 상위클래스
public class SmartTV extends BasicTV {
	// sub class에서는 super class가 가지고 있는 멤버 변수들은 
	// 선언하지 않아도 사용할 수 있다.
	// super class에 없는 멤버 변수만 선언해 주면 됨
	String ip;
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println("IP 주소: " + ip);
	} // end displayInfo()
	
} // end class SmartTV






