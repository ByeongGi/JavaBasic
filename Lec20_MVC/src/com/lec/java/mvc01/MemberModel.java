package com.lec.java.mvc01;

// Model 기능을 담당할 클래스
public class MemberModel {
	// 멤버 변수
	private String id;
	private String passwd;
	
	// 생성자
	// 1) 디폴트 생성자
	// 2) Member(String id, String passwd)
	public MemberModel() {}
	public MemberModel(String id, String passwd) {
		this.id = id;
		this.passwd = passwd;
	}
	
	// getters / setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	// 메소드
	public void displayInfo() {
		System.out.println("--- 회원 정보 ---");
		System.out.println("아이디: " + id);
		System.out.println("비밀번호: " + passwd);
		System.out.println("-----------------");
	} // end displayInfo()
	
	
} // end class MemberModel






