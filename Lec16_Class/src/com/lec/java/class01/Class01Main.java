package com.lec.java.class01;

public class Class01Main {

	public static void main(String[] args) {
		System.out.println("TV 클래스 테스트");
		
		
		// 우리가 만든 클래스를 사용하려면,
		// 그 클래스의 인스턴스를 생성해야 함.
		// 클래스이름 변수이름 = new 생성자();
		// 생성자: 클래스의 이름과 동일, 클래스의 멤버변수들을 초기화
		int num = 1;
		int[] arr = new int[5];
		MyTV tv = new MyTV();
		tv.displayStatus();
		
		// 클래스의 멤버변수들은 (지역변수와는 달리)
		// 클래스의 인스턴스가 생성될 때 (자동으로) 초기화가 된다.
		// 특별히 초기화를 할 값들이 지정되어 있지 않을 때는
		// 각 변수 타입의 기본값(디폴트 값)으로 초기화가 됨
		// boolean -> false, 숫자타입(int, double, ...) -> 0
		// String, 참조 타입(클래스) -> null
		
		// 지역변수: 메소드 안에서 선언된 변수
		// 지역변수는 사용하기 전에 반드시 초기화를 해줘야 함.
		
		
		// TV를 켜보자...
		tv.powerOnOff();
		
		// 볼륨 조정
		tv.volumeUp();
		tv.volumeDown();
		
		// 채널 조정
		tv.channelUp();
		tv.channelDown();
		
		// TV를 꺼보자...
		tv.powerOnOff();
		
	} // end main()

} // end class Class01Main









