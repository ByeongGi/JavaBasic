package com.lec.java.static03;

public class Test {
	// 멤버 변수
	private int num;
	
	// 생성자
	private Test() {
		num = 100;
	}
	
	// singleton 디자인 패턴
	private static Test instance = null;
	public static Test getInstance() {
		if (instance == null) {
			instance = new Test();
		}
		
		return instance;
	} // end getInstance()
	
	

	// 메소드 (getter / setter)
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
} // end class Test














