package com.lec.java.method06;

import java.util.Scanner;

public class Method06Main {

	public static void main(String[] args) {
		System.out.println("Method Overloading (메소드 중복 정의)");
		
		
		// Method Overloading (메소드 중복 정의)
		// 1. 매개변수의 개수가 다르거나
		// 2. 매개변수의 자료형이 다르거나
		// 3. 매개변수의 순서가 다를 때
		// 같은 이름으로 메소드를 중복 정의할 수 있습니다.
		// 주의: 메소드의 리턴 타입만 다른 경우는 중복 정의할 수 없다!!

		sayHello();
		sayHello("임승현");
		sayHello(20);
		sayHello("이재우", 20);
		
	} // end main()
	
	
	public static void sayHello() {
		System.out.println("안녕하세요~");
	}
	
	public static void sayHello(String name) {
		System.out.println("Hi~");
		System.out.println("제 이름은 " + name + "이예요~");
	}
	
	public static void sayHello(int age) {
		System.out.println("Hello!");
		System.out.println("My age is " + age);
	}
	
	public static void sayHello(int age, String name) {
		
	}
	
	public static void sayHello(String name, int age) {
		System.out.println("하이~ 헬로~");
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
	

} // end class Method06Main









