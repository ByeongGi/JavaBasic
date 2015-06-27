package com.lec.java.class04;

import java.awt.Label;
import java.util.ArrayList;

public class Class04Main {

	public static void main(String[] args) {
		System.out.println("클래스, 생성자, 메소드");
		
		// 클래스 타입의 변수 선언, 인스턴스 생성
		// 클래스이름 변수이름 = new 생성자();
		Number n1 = new Number(); // 디폴트 생성자 사용
		System.out.println("n1.num = " + n1.num);
		
		// 지역변수: 메소드 안에서 선언된 변수
		int num; // 선언만 하고 초기화하지 않은 지역변수
		//System.out.println("num = " + num); // 컴파일 오류
		// 지역변수는 사용하기 전에 반드시 초기화가 되어야 함.
		// 클래스의 멤버변수(n1.num)는 클래스의 인스턴스가 생성될 때
		// 자동으로 초기화가 됨.
		
		System.out.println();
		Number n2 = new Number(123); // 매개변수가 있는 생성자
		System.out.println("n2.num = " + n2.num);
		
		System.out.println();
		System.out.println("메소드 사용");
		System.out.println("n1: " + n1.getNum());
		System.out.println("n2: " + n2.getNum());
		
		System.out.println();
		n1.setNum(100);
		System.out.println("n1: " + n1.getNum());
		n2.setNum(111);
		System.out.println("n2: " + n2.getNum());
		
		System.out.println();
		n1.add(n2);
		System.out.println("n1: " + n1.getNum());
		System.out.println("n2: " + n2.getNum());
		
		System.out.println();
		n1.setNum(10);
		n2.setNum(20);
		Number n3 = new Number(30);
		n1.add(n2).add(n3);
		System.out.println("n1.num = " + n1.getNum());
		
		
		System.out.println();
		n1.setNum(10);
		n2.setNum(20);
		n3.setNum(30);
		n1.add(n2).sub(n3);
		System.out.println("n1.num = " + n1.getNum());

	} // end main()

} // end class Class04Main










