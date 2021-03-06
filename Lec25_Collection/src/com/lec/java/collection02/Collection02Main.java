package com.lec.java.collection02;

public class Collection02Main {

	public static void main(String[] args) {
		System.out.println("Generic 클래스 2");
		
		System.out.println();
		Test<Integer, String> t1 = 
				new Test<Integer, String>(123, "Hello, Java!");
		t1.display();
		
		System.out.println();
		Test<Integer, Double> t2 =
				new Test<Integer, Double>(111, 3.14);
		t2.display();
		// 제네릭 클래스에서 사용되는 타입은 
		// 기본 자료형(primitive type)은 사용될 수 없고,
		// Object 타입의 자료형들만 올 수 있음.
		// (예) int는 사용할 수 없고, Integer를 사용해야 함
		// (예) double은 사용할 수 없고, Double을 사용해야 함

	} // end main

} // end class Collection02Main

class Test<T, U> {
	T item1;
	U item2;
	
	public Test(T item1, U item2) {
		this.item1 = item1;
		this.item2 = item2;
	}
	
	public void display() {
		System.out.println("item1: " + item1);
		System.out.println("item2: " + item2);
	}
	
} // end class Test








