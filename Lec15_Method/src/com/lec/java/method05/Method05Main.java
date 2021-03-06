package com.lec.java.method05;

import java.util.Scanner;

public class Method05Main {

	public static void main(String[] args) {
		System.out.println("메소드 연습");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요:");
		double num = sc.nextDouble();
		
		sc.close();
		
		double area;
		
		System.out.println("정사각형의 넓이"); // num * num
		area = calcRectArea(num);
		System.out.println("area = " + area);
		
		System.out.println("원의 넓이"); // Math.PI * num * num
		area = calcCircleArea(num);
		System.out.println("area = " + area);

	} // end main()
	
	// method name: calcRectArea
	// return: double (정사각형의 넓이)
	// arguments: double length (정사각형의 한 변의 길이)
	public static double calcRectArea(double length) {
		
		return length * length;
	} // end calcRectArea()
	
	
	// method name: calcCircleArea
	// return: double (원의 넓이)
	// arguments: double r (원의 반지름)
	public static double calcCircleArea(double r) {
		
		return Math.PI * r * r;
	} // end calcCircleArea

} // end Method05Main()









