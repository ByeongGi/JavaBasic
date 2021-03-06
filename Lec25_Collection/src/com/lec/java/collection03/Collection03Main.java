package com.lec.java.collection03;

import java.util.ArrayList;
import java.util.Iterator;

// Collection<E>
//  |__ List<E>
//       |__ ArrayList<E>, LinkedList<E>

// List 특징(ArrayList와 LinkedList의 공통점)
// 1. 중복 저장 허용
// 2. 저장 순서 유지 (인덱스 존재)

// ArrayList:
// 1. 저장 용량을 늘리는 데 많은 시간 소요 - 단점
// 2. 데이터를 삭제하는 데 많은 연산 - 단점
// 3. 데이터 참조 매우 빠름 - 장점

// LinkedList:
// 1. 저장 용량을 늘리는 과정이 매우 간단 - 장점
// 2. 데이터를 삭제하는 과정이 간단 - 장점
// 3. 데이터 참조가 불편 - 단점



public class Collection03Main {

	public static void main(String[] args) {
		System.out.println("ArrayList<E>");
		
		// ArrayList 선언 - ArrayList 인스턴스 생성
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		
		// 데이터 추가(저장): add() 메소드 사용
		list1.add(100);
		list1.add(200);
		list1.add(300);
		list1.add(400);
		
		// 데이터 참조(읽기, 검색): get(index) 메소드 사용
		// size(): ArrayList의 크기를 반환(리턴)
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		// 데이터 삭제: remove(index) 메소드 사용
		list1.remove(2);
		System.out.println("삭제 후");
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		// 데이터 수정: set(index, element) 메소드 사용
		list1.set(2, 333);
		System.out.println("수정 후");
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		// Iterator(반복자) 사용법
		// iterator() 메소드를 사용해서 인스턴스 생성
		Iterator<Integer> itr = list1.iterator();
		// hasNext(): iterator가 다음 원소를 가지고 있는 지(true/false)
		// next(): 현재 iterator 위치의 원소를 값을 리턴하고,
		//   iterator의 위치를 다음 원소의 위치로 변경
		while (itr.hasNext()) {
			System.out.println(itr.next());
		} // end while
		

	} // end main

} // enc class Collection03Main










