package com.lec.java.inner07;

public class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public Readable createInstance(int age) {
		
		// 익명 내부 클래스:
		// 인스턴스 생성과 동시에 클래스가 정의됨.
		// new 인터페이스() { 익명 클래스 내부 작성 }; 
		// new 부모클래스() { 익명 클래스 내부 작성 };
		
		return new Readable() {
			@Override
			public void readInfo() {
				System.out.println("이름: " + name);
				System.out.println("나이: " + age);
				
			} // end readInfo()
			
		};
		
	} // end createInstance()
	
} // class Person


interface Readable {
	public abstract void readInfo();
	
} // end interface Readable









