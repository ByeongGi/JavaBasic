package com.lec.java.collection01;

public class Collection01Main {

	public static void main(String[] args) {
		System.out.println("Generics(제네릭스)");
		
		System.out.println();
		System.out.println("[1] generic 클래스 사용 전");
		Orange orange1 = new Orange(10);
		OrangeBox orangeBox1 = new OrangeBox(orange1);
		orangeBox1.pullOut().displaySugar();
//		Orange o = orangeBox1.pullOut();
//		o.displaySugar();
		
		Apple a1 = new Apple(100);
		AppleBox box2 = new AppleBox(a1);
		box2.pullOut().displayWeight();
		
		
		System.out.println();
		System.out.println("[2] generic 클래스 사용");
		Orange o2 = new Orange(20);
		FruitBox<Orange> box3 = new FruitBox<Orange>(o2);
		box3.pullOut().displaySugar();
		
		Apple a2 = new Apple(200);
		FruitBox<Apple> box4 = new FruitBox<Apple>(a2);
		box4.pullOut().displayWeight();
		
		Banana b = new Banana(8);
		FruitBox<Banana> box5 = new FruitBox<Banana>(b);
		box5.pullOut().displayNum();

	} // end main

} // end class Collection01Main

class Banana {
	int num;
	
	public Banana() {}
	public Banana(int num) { this.num = num; }
	
	public void displayNum() {
		System.out.println("바나나 개수: "  + num);
	}
	
} // end class Banana

class Orange {
	// 멤버 변수
	int sugar;
	
	// 생성자
	public Orange() {}
	public Orange(int sugar) {
		this.sugar = sugar;
	}
	
	// 메소드
	public void displaySugar() {
		System.out.println("오렌지 당도: " + sugar);
	} // end displaySugar()
	
} // end class Orange

class Apple {
	// 멤버 변수
	int weight;
	
	// 생성자
	public Apple() {}
	public Apple(int weight) {
		this.weight = weight;
	}
	
	// 메소드
	public void displayWeight() {
		System.out.println("사과 무게: " + weight);
	} // end displayWeight()
	
} // end class Apple

class OrangeBox {
	// 멤버 변수
	Orange orange;
	
	// 생성자
	public OrangeBox() {}
	public OrangeBox(Orange o) {
		this.orange = o;
	}
	
	// 메소드
	public Orange pullOut() {
		return orange;
	}
	
} // end class OrangeBox

class AppleBox {
	// 멤버 변수
	Apple apple;
	
	// 생성자
	public AppleBox() {}
	public AppleBox(Apple a) {
		this.apple = a;
	}
	
	// 메소드
	public Apple pullOut() {
		return apple;
	}
	
} // end class AppleBox

// Generic 클래스: 
// 클래스의 멤버변수나 혹은 메소드의 리턴타입, 매개변수 등의 타입을 
// 지정하지 않고 generic(일반적으로)하게 정의하는 클래스
class FruitBox<T> {
	// 멤버 변수
	T fruit;
	
	// 생성자
	public FruitBox() {}
	public FruitBox(T fruit) {
		this.fruit = fruit;
	}
	
	// 메소드
	public T pullOut() {
		return fruit;
	} // end pullOut()

} // end class FruitBox<T>





















