package com.lec.java.method07;

public class Method07Main {

	public static void main(String[] args) {
		System.out.println("Math함수");
		
		double num = Math.random(); 
		// Math.random(): 난수(임의의 수)를 발생
		System.out.println(num);
		System.out.println(num * 3);
		System.out.println("floor = " + Math.floor(num * 3));
		System.out.println("ceil = " + Math.ceil(num * 3));
		System.out.println((int) Math.floor(num * 3));
		
		// Math.floor(num): num을 넘지 않는 가장 큰 정수(바닥)
		// Math.ceil(num): num보다 큰 가장 작은 정수(천장)
		// 1.2 == 1 < 1.2 < 2 == floor: 1, ceil: 2
		// -1.2 == -2 < -1.2 < -1 == floor: -2, ceil: -1
		System.out.println(Math.floor(-1.2));
		System.out.println(Math.ceil(-1.2));

	} // end main()

} // end class Method07Main









