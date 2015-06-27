package com.lec.java.collection13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Collection<E>
//  |__ List<E>, Set<E>

// List<E>
//  |__ ArrayList<E>, LinkedList<E>

// Set<E>
//  |__ HashSet<E>, TreeSet<E>

// Map<K, V>
//  |__ HashMap<K, V>, TreeMap<K, V>

// Map: key-value 저장 방식의 자료 구조
//  1. key는 중복되지 않는 값만 허용
//  2. value는 같더라도 key 값이 다르면 저장 가능
//  3. 검색, 수정, 삭제를 할 때 key를 사용



public class Collection13Main {

	public static void main(String[] args) {
		System.out.println("HashMap 클래스");
		
		// HashMap 인스턴스 생성
		// Key - Integer 타입
		// Value - String 타입
		HashMap<Integer, String> hmap =
				new HashMap<Integer, String>();
		
		// 데이터 저장: put() 메소드 사용
		System.out.println("put 결과: " + hmap.put(1, "최진형"));
		System.out.println("put 결과: " + hmap.put(2, "최민영"));
		System.out.println("put 결과: " + hmap.put(3, "조은이"));
		System.out.println("put 결과: " + hmap.put(1, "정은선"));
		// 같은 키 값으로 데이터를 put하게 되면, 기존 값이 수정(replace)이 됨.
		
		// 저장된 데이터 개수 확인
		System.out.println("데이터 개수: " + hmap.size());
		
		System.out.println();
		
		// HashMap에서 Iterator 사용
		// 1. HashMap의 keySet() 메소드를 사용해서
		// 저장된 키(key)값드로만 이루어진 Set을 만듬.
		// 2. 1에서 만들어진 Set에 있는 iterator() 메소드를 사용해서
		// Iterator를 생성
		Set<Integer> keySet =  hmap.keySet();
		Iterator<Integer> itr = keySet.iterator();
		while (itr.hasNext()) {
			// Iterator로부터 key값들을 구해옴.
			int key = itr.next();
			
			// Map에 저장된 데이터의 검색은 get(key) 메소드를 사용
			System.out.println(key + ":" + hmap.get(key));
		} // end while

	} // end main()

} // end class Collection13Main















