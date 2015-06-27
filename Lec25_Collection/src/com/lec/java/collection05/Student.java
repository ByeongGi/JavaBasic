package com.lec.java.collection05;

public class Student {
	private int id;
	private String name;
	private Score score;
	
	public Student() {}
	public Student(int id, String name, Score s) {
		this.id = id;
		this.name = name;
		this.score = s;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Score getScore() {
		return score;
	}
	public void setScore(Score score) {
		this.score = score;
	}
	

} // end class Student
