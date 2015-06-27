package com.lec.java.collection05;

import java.util.ArrayList;

public class Collection05Main {

	public static void main(String[] args) {
		System.out.println("ArrayList 연습");
		
		// Student를 저장할 수 있는 ArrayList 인스턴스 생성
		ArrayList<Student> list = new ArrayList<Student>();
		
		// Student를 저장: add()
		Score score1 = new Score(100, 90, 80);
		Student stu1 = new Student(1, "김남승", score1);
		list.add(stu1);
		
		Score score2 = new Score(80, 100, 90);
		Student stu2 = new Student(2, "김동혁", score2);
		list.add(stu2);
		
		Score score3 = new Score(80, 90, 100);
		Student stu3 = new Student(3, "김병기", score3);
		list.add(stu3);
		
		
		// 검색: get()
		for (int i = 0; i < list.size(); i++) {
			System.out.println();
			
			System.out.println("id: " + list.get(i).getId());
			System.out.println("이름: " + list.get(i).getName());
			System.out.println("국어: " +
					list.get(i).getScore().getKorean());
			System.out.println("영어: " +
					list.get(i).getScore().getEnglish());
			System.out.println("수학: " +
					list.get(i).getScore().getMath());
			
			/*
			Student stu = list.get(i);
			System.out.println("id: " + stu.getId());
			System.out.println("이름: " + stu.getName());
			
			Score score = stu.getScore();
			System.out.println("국어: " + score.getKorean());
			System.out.println("영어: " + score.getEnglish());
			System.out.println("수학: " + score.getMath());
			*/
		} // end for
		
		
		// 삭제: remove()
		list.remove(1);
		System.out.println("삭제 후:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println();
			System.out.println("id: " + list.get(i).getId());
			System.out.println("이름: " + list.get(i).getName());
			System.out.println("국어: " +
					list.get(i).getScore().getKorean());
			System.out.println("영어: " +
					list.get(i).getScore().getEnglish());
			System.out.println("수학: " +
					list.get(i).getScore().getMath());
		} // end for
		
		
		// 수정: set()
		Student stu = list.get(1);
		stu.setId(2);
		stu.getScore().setKorean(99);
		stu.getScore().setEnglish(99);
		stu.getScore().setMath(99);
		list.set(1, stu);
		System.out.println("수정 후:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println();
			System.out.println("id: " + list.get(i).getId());
			System.out.println("이름: " + list.get(i).getName());
			System.out.println("국어: " +
					list.get(i).getScore().getKorean());
			System.out.println("영어: " +
					list.get(i).getScore().getEnglish());
			System.out.println("수학: " +
					list.get(i).getScore().getMath());
		} // end for
		

	} // end main()

} // end class Collection05Main









