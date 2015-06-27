package com.lec.java.inheritance;

public class Inheritancetest {

	public static void main(String[] args) {
		SubClass s1 = new SubClass();
		// 자식이 부모의 필드(멤버변수)를 사용까지 가능해짐
		int a1 = s1.sub1;
		int a2 = s1.sup1;
		int b1 = s1.sub1;
		int b2 = s1.sup2;
		
		// 자식이 부모의 메소드까지 사용가능 
		s1.SubclassMethod(); 
		s1.SupMethod(); // 부모의 메소드
		
		

	}

}
