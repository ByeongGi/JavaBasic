package com.lec.java.collection09;

import java.util.HashSet;
import java.util.Iterator;

import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;

public class Collection09Main {

	public static void main(String[] args) {
		System.out.println("HashSet 연습");
		
		// String 타입을 저장할 수 있는 HashSet 인스턴스 생성
		HashSet<String> set = new HashSet<String>();
		HashSet<Integer> set2 = new HashSet<Integer>();
		
		set2.add(11);
		set2.add(22);
 		
		// 데이터 저장
		System.out.println("add 결과: " + set.add("One"));
		System.out.println("add 결과: " + set.add("Two"));
		System.out.println("add 결과: " + set.add("Three"));
		System.out.println("add 결과: " + set.add("Four"));
		System.out.println("add 결과: " + set.add("Five"));
		System.out.println("add 결과: " + set.add("Two"));
		System.out.println("add 결과: " + set.add("Three"));
		
		System.out.println();
		System.out.println("데이터 저장");
		System.out.println("데이터 개수: " + set.size());
		
		System.out.println();
		// 데이터 검색 - Iterator 사용
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();
		// 데이터 삭제
		set.remove("Five");
		
		System.out.println("삭제 후:");
		itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();
		// enhanced for는 인덱스가 필요 없는 for문이기 때문에
		// Set 타입의 자료형에서도 사용 가능
		System.out.println("enhanced for 사용");
		for(String str : set) {
			System.out.println(str);
		}
		for(Integer x : set2) {
			System.out.println(x);
		}
		

	} // end main()

} // end class Collection09Main
















