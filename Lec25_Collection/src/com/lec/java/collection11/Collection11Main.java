package com.lec.java.collection11;

import java.util.Iterator;
import java.util.TreeSet;

// Collection<E>
//  |__ Set<E>
//       |__ HashSet<E>, TreeSet<E>

// TreeSet: 데이터가 정렬된 상태로 저장(오름차순, 내림차순)

public class Collection11Main {

	public static void main(String[] args) {
		System.out.println("TreeSet 클래스");
		
		// Integer 타입을 저장할 수 있는 TreeSet 인스턴스 생성
		TreeSet<Integer> tset = new TreeSet<Integer>();
		
		// 데이터 저장
		tset.add(11);
		tset.add(2);
		tset.add(14);
		tset.add(1);
		tset.add(7);
		tset.add(15);
		tset.add(5);
		tset.add(8);
		
		// 데이터 검색 - Iterator 사용
		// TreeSet인 경우에 iterator() 메소드 오름차순 정렬
		System.out.println("오름차순:");
		Iterator<Integer> iterator = tset.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println();
		System.out.println("내림차순:");
		// 내림차순 Iterator
		Iterator<Integer> iterator2 = tset.descendingIterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
		// enhanced for
		System.out.println();
		System.out.println("enhanced for");
		for (Integer num : tset) {
			System.out.println(num);
		}

	} // end main()

} // end class Collection11Main












