package com.lec.java.pb05;

// View(PhonebookMain)와 Controller(PhonebookManager) 사이의 인터페이스
public interface DbQuery {
	
	public abstract void insert(String name, String phoneNum, String email);
	public abstract void searchAll();
	public abstract void update(int index, String name, String phoneNum, String email);

} // end interface DbQuery
