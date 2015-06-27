package com.lec.java.access03;

import com.lec.java.access04.Test04;

public class Access03Main {

	public static void main(String[] args) {
		System.out.println("메소드의 접근제한 수식어");
		
		// 1. 같은 패키지에 있는 다른 클래스의 메소드 사용하기
		// 인스턴스를 생성
		Test03 t3 = new Test03();

		// 인스턴스의 참조변수를 사용해서 메소드를 부른다.
		//t3.privateMethod();
		// private으로 선언된 메소드는 다른 클래스에서는 사용 불가
		
		t3.defaultMethod();
		// (default): 같은 패키지에 있으면 사용 가능
		
		t3.protectedMethod();
		// protected: 같은 패키지에 있거나,
		// 다른 패키지에 있더라도 상속이 되는 경우에 사용 가능
		
		t3.publicMethod();
		
		
		System.out.println();
		// 2. 다른 패키지에 있는 다른 클래스의 메소드 사용하기
		Test04 t4 = new Test04();
		
		// private
		// t4.privateMethod();
		// t4.defaultMethod();
		// t4.protectedMethod();
		t4.publicMethod();
		
		
	} // end main()

} // end class Access03Main








