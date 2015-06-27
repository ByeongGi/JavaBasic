package com.lec.java.inheritance;

public class SubClass extends SuperClass  {
	// 멤버변수 (필드)
	public int sub1=1;
	public int sub2=2;
	
	// 생성자

	public SubClass(){
		
		System.out.println(" 서브 클래스의 생성자 ");
	}
	
	// 메소드 
	public void SubclassMethod(){
		System.out.println("서브클래스 메소드이다.");
	}
	
	
	@Override // 메소드 오버라이딩 - 메소드의 재정의 
	protected void SupMethod() {
		super.SupMethod();
		System.out.println("자식클래스에서 재 정의된 메소드 (오버라이딩)");
	}
	
	
	
} // end class 
