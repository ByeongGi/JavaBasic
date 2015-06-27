package com.lec.java.mvc01;

public interface DbQuery {

	public abstract void insert(String id, String passwd);
	public abstract void searchAll();
	public abstract void update(int index, String id, String passwd);
	
} // end interface DbQuery
