package com.lec.java.singletonpatten;

public class SingletonTest {

	public static void main(String[] args) {
		Singletonclass singletonclass1= Singletonclass.getIntance();
		Singletonclass singletonclass2= Singletonclass.getIntance();
		// 하나의 인스턴스를 공유하고 있다.
		singletonclass1.setX(20);
		int x=singletonclass1.getX();
		System.out.println(x);
		x =singletonclass2.getX();
		System.out.println(x);

		
	}

}
