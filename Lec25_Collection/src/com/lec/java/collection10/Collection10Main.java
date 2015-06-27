package com.lec.java.collection10;

import java.util.HashSet;
import java.util.Iterator;

public class Collection10Main {

	public static void main(String[] args) {
		System.out.println("HashSet 연습");
		
		// MyClass 타입을 저장할 수 있는 HashSet 인스턴스 생성
		HashSet<MyClass> hset = new HashSet<MyClass>();
		
		// 데이터 3개 저장
		MyClass mc1 = new MyClass(1, "Abc");
		MyClass mc2 = new MyClass(2, "Def");
		MyClass mc3 = new MyClass(3, "Asdf");
		hset.add(mc1);
		hset.add(mc2);
		hset.add(mc3);
		
		// 검색: Iterator, enhanced for
		System.out.println();
		System.out.println("Iterator");
		Iterator<MyClass> itr = hset.iterator();
		while (itr.hasNext()) {
			//System.out.println(itr.next());
			MyClass mc = itr.next();
			System.out.println("id: " + mc.getId());
			System.out.println("name: " + mc.getName());
		} // end while
		
		System.out.println();
		System.out.println("enhanced for");
		// for (자료타입 변수명 : 배열/리스트/셋) {}
		for (MyClass m : hset) {
			m.displayInfo();
		}

	} // end main()

} // end class













