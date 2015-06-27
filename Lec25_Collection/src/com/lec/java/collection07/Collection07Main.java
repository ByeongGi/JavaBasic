package com.lec.java.collection07;

import java.util.Iterator;
import java.util.LinkedList;

// Collection<E>
//  |__ List<E>
//       |__ ArrayList<E>, LinkedList<E>

// List:
// 1. 중복 저장 허용
// 2. 저장 순서 유지(인덱스 존재)

public class Collection07Main {

	public static void main(String[] args) {
		System.out.println("Linked List");
		
		// Integer 타입을 저장할 수 있는 LinkedList 인스턴스 생성
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		// LinkedList에 데이터 저장: add()
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		
		System.out.println();
		// 검색: get()
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		// 데이터 삭제: remove()
		list.remove(3);
		System.out.println("삭제 후:");
		for (Integer num : list) {
			System.out.println(num);
		}
		
		System.out.println();
		// 데이터 수정: set()
		list.set(3, 333);
		System.out.println("수정 후:");
		for (Integer x : list) {
			System.out.println(x);
		}
		
		System.out.println();
		// Iterator 만들어서 데이터 출력
		System.out.println("Iterator 사용");
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();
		// Java 8에 있는 forEach() 메소드
		System.out.println("Java 8 forEach()메소드");
		list.forEach(System.out::println);
		

	} // end main()

} // end class Collection07Main











