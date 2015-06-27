package com.lec.java.collection08;

import java.util.HashSet;
import java.util.Iterator;

// Collection<E>
//  |__ Set<E>
//       |__ HashSet<E>, TreeSet<E>

// Set:
// 1. 자료의 중복 저장이 허용되지 않는다.
// 2. 저장 순서가 유지되지 않는다.(인덱스 없다.)
// (예) {1, 2, 3} = {1, 1, 2, 2, 3} : 중복 저장이 안되기 때문에 같은 Set
// (예) {1, 2, 3} = {1, 3, 2}: 저장 순서가 중요하지 않기 때문에 같은 Set

// HashSet: 매우 빠른 검색 속도를 제공

public class Collection08Main {

	public static void main(String[] args) {
		System.out.println("HashSet 클래스");
		
		// Integer 타입을 저장할 수 있는 HashSet 인스턴스 생성
		HashSet<Integer> set = new HashSet<Integer>();
		
		// 데이터 저장: add()
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(100);
		set.add(400);
		set.add(500);
		set.add(1);
		set.add(2);
		
		// HashSet의 크기: size()
		System.out.println("집합의 크기: " + set.size());
		// Set은 중복 저장을 허용하지 않는다.
		
		// 데이터 검색:
		// Set은 인덱스가 없기 때문에 get() 메소드를 제공하지 않습니다.
		// 데이터 검색을 위해서는 Iterator를 사용해야 함
		System.out.println();
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		// 출력 결과를 보면 저장 순서와는 관계 없다.
		
		
		// 데이터 삭제
		// remove(element): Set에 있는 element를 찾아서 삭제
		//   element 있다면 삭제 후 true를 리턴
		//   element 없다면 false 리턴
		System.out.println("삭제 결과: " + set.remove(2));
		System.out.println("삭제 결과: " + set.remove(999));
		
		System.out.println();
		System.out.println("삭제 후:");
		itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// Set 자료형 데이터 변경을 할 수 있는 set() 메소드를 제공하지 않습니다.
		// 삭제(remove) 후 추가(add)하면 변경하는 효과
		set.remove(500);
		set.add(555);
		System.out.println("변경 후:");
		itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	} // end main()

} // end class Collection08Main












