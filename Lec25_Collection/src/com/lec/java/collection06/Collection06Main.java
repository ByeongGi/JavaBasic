package com.lec.java.collection06;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection06Main {

	public static void main(String[] args) {
		System.out.println("ArrayList 연습");
		
		// MemberModel을 저장할 수 있는 ArrayList 인스턴스 생성
		ArrayList<MemberModel> list = new ArrayList<MemberModel>();
		
		// 데이터 저장: add()
		MemberModel m1 = new MemberModel("root", "root1234");
		list.add(m1);
		
		MemberModel m2 = new MemberModel("admin", "admin123456");
		list.add(m2);
		
		MemberModel m3 = new MemberModel("guest", "guest");
		list.add(m3);
		
		System.out.println();
		// 검색: get()
		for (int i = 0; i < list.size(); i++) {
			list.get(i).displayInfo();
		} // end for
		
		System.out.println();
		// 삭제: remove()
		list.remove(1);
		System.out.println("삭제 후:");
		for (MemberModel member : list) {
			member.displayInfo();
		} // end enhanced for
		
		System.out.println();
		// 수정: set()
		MemberModel member = list.get(0); // 수정할 데이터 가지고 옴
		member.setPasswd("root123456"); // MemberModel 수정
//		MemberModel member = new MemberModel("root2", "root123456");
//		list.set(0, member); // list의 0번째 데이터 수정
		
		System.out.println("수정 후:");
		for (MemberModel m : list) {
			m.displayInfo();
		}
		
		// Iterator
		System.out.println();
		System.out.println("Iterator 사용");
		Iterator<MemberModel> itr = list.iterator();
		while (itr.hasNext()) {
//			MemberModel m = itr.next();
//			m.displayInfo();
			
			itr.next().displayInfo();
			
//			MemberModel m = itr.next();
//			System.out.println("id: " + m.getId());
//			System.out.println("passwd: " + m.getPasswd());
			
		} // end while

	} // end main()

} // end class












