package com.lec.java.singletonpatten;
//싱글턴 패턴이란 ?
	// 하나의 인스턴스 가지고 공유한다 .하나의 오브젝트를 가지고 똑같이 공유한다.
	// 구현 방법
	// 1. 생성자를 private 처리한다.(외부에서 객체를 생성하지 못하게 함.)
	// 2. 인스턴스를 자신의 클래스 내부에서 선언한다 .
    // 3. public 접근 제어자 가진 메소드를 통해서 getIntance() 
	// 자기 자신이 생성한 SINGLETONCLASS_INSTANCE 인스턴스를 반환한다 .



public class Singletonclass {
	// 멤버변수 
	private static Singletonclass SINGLETONCLASS_INSTANCE= null; // 2. 인스턴스를 클래스 내부에서 선언
	// static 힙 영역에 있는 인스턴스의 주소값을 staic으로 선언된 SINGLETONCLASS_INSTANCE 변수에 저장하겠다.
	private Singletonclass(){} //2. 외부에서 객체를 생성하지 못하게 막는다.
	
	public int x=10;
	public int y=20;
	
	
	public static Singletonclass getIntance(){
		if (SINGLETONCLASS_INSTANCE == null) {
			SINGLETONCLASS_INSTANCE= new Singletonclass();
			// 처음으로 이 메소드를 통해서 생성자를 만드는 순간 null 값임을 알고 이 메소드를 처음 부를때 생성된다 .
			// 3. 인스턴스가 없다면 Singletonclass의 인스턴스를 SINGLETONCLASS_INSTANCE에 주소로 저장해서 
			// 리턴해준다 . 
		}
		return SINGLETONCLASS_INSTANCE;
		
	}


	


	public void setX(int x) {
		this.x = x;
	}


	public void setY(int y) {
		this.y = y;
	}



	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}
	
	
	
} // end class Singletonclass
