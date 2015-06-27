package com.lec.java.collection04;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection04Main {

	public static void main(String[] args) {
		System.out.println("ArrayList 2");
		
		// String 타입을 저장할 수 있는 ArrayList 인스턴스 생성
		ArrayList<String> list = new ArrayList<String>();
		
		// 데이터 저장: add()
		list.add("Java");
		list.add("C++");
		list.add("C#");
		list.add("Swift");
		
		// 데이터 검색: get(), size()
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 데이터 삭제: remove()
		list.remove(1);
		System.out.println("삭제:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 데이터 수정: set()
		list.set(2, "Object-C");
		System.out.println("수정:");
		// enhanced for
		for (String lang : list) {
			System.out.println(lang);
		}
		
		// Iterator 사용
		// ArrayList에 있는 iterator() 메소드를 사용해서 인스턴스 생성
		System.out.println("Iterator 사용:");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

	} // end main()

} // end class Collection04Main












