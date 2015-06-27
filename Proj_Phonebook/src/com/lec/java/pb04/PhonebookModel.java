package com.lec.java.pb04;

public class PhonebookModel {
	// 멤버 변수
	String name;
	String phoneNum;
	String email;
	
	// 생성자
	public PhonebookModel() {}
	public PhonebookModel(String name, String phoneNum, String email) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.email = email;
	}
	
	// getter & setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void displayInfo() {
		System.out.println("--- 전화번호 정보 ---");
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phoneNum);
		System.out.println("이메일: " + email);
		System.out.println("--------------------");
	} // end displayInfo()
	
	
} // end class PhonebookModel










