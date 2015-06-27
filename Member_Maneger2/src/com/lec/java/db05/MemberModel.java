package com.lec.java.db05;

// 자료 타입 객체 

public class MemberModel {
	// 멤버 변수 
	private String id;
	private String pw;
	private String email;
	// 생성자
	public MemberModel(){};
	public MemberModel(String id,String pw,String email){
		this.id=id;
		this.pw=pw;
		this.email=email;	
		}
	
	// getter& setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	// 메소드 
	
	
		
	
	
} // end class MemberModel
