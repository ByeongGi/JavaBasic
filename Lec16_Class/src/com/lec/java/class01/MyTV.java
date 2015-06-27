package com.lec.java.class01;

// 클래스:
// 우리가 만들고자 하는 대상의 "상태"와 "기능"을 함께 가지고 있는 "데이터 타입"
// 상태(속성) -> 멤버 변수(클래스에서 선언하는 변수)로 정의
// 기능(동작) -> 메소드로 정의

public class MyTV {
	// TV의 상태 -> 멤버 변수
	// 멤버 변수: 같은 클래스에서 정의된 모든 메소드에서 다 사용 가능
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
	// TV의 기능(동작) -> 메소드
	public void displayStatus() {
		System.out.println("TV 현재 상태");
		System.out.println("----------------");
		System.out.println("전원 상태: " + isPowerOn);
		System.out.println("채널 상태: " + channel);
		System.out.println("볼륨 상태: " + volume);
		System.out.println("----------------");
	}
	
	public void powerOnOff() {
		if (isPowerOn) { // TV가 켜져 있으면
			isPowerOn = false;
			System.out.println("TV를 끕니다.");
		} else { // TV가 꺼져 있으면
			isPowerOn = true;
			System.out.println("TV가 켜졌습니다.");
		}
		
	} // end turnOn()
	
	public int channelUp() {
		channel++;
		System.out.println("현재 채널: " + channel);
		
		return channel;
	} // end channelUp()
	
	public int channelDown() {
		channel--;
		System.out.println("현재 채널: " + channel);
		
		return channel;
	}
	
	public int volumeUp() {
		volume++;
		System.out.println("현재 볼륨: " + volume);
		
		return volume;
	}
	
	public int volumeDown() {
		volume--;
		System.out.println("현재 볼륨: " + volume);
		
		return volume;
	}
	
} // end class MyTV










