package com.lec.java.inherit02;

public class Inherit02Main {

	public static void main(String[] args) {
		System.out.println("상속");
		
		// BasicTV 클래스의 인스턴스 생성
		BasicTV tv1 = new BasicTV();
		tv1.displayInfo();
		
		System.out.println();
		
		// SmartTV 클래스의 인스턴스 생성
		SmartTV tv2 = new SmartTV();
		tv2.isPowerOn = true;
		tv2.channel = 100;
		tv2.volume = 10;
		tv2.ip = "192.168.0.110";
		tv2.displayInfo();

	} // end main

} // end class Inherit02Main










