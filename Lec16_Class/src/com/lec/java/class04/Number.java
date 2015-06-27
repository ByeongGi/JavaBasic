package com.lec.java.class04;

public class Number {
	// 멤버 변수: 클래스에서 선언된 변수
	int num;
	
	// 생성자
	// 아무런 생성자가 만들어져 있지 않은 경우에는 
	// 디폴트 생성자가 자동으로 만들어 짐.
	public Number(int num) {
		this.num = num;
		// 매개변수로 받은 num의 값을
		// 클래스의 멤버변수인 num(this.num)에 저장
	}
	public Number() {}
	
	
	// 메소드
	public int getNum() {
		return this.num; // return num;
	}
	public void setNum(int x) {
		this.num = x;
	}
	
	
	// method name: add
	// return type: Number
	// arguments: Number x
	public Number add(Number x) {
		num += x.num; // num = num + x.num;
		
		return this;
	}
	
	// method name: sub
	// return type: Number
	// argument: Number x
	public Number sub(Number x) {
		num -= x.num; // num = num - x.num;
		
		return this;
	}
	
	
} // end class Number











