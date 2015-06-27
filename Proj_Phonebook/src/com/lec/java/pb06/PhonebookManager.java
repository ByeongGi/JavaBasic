package com.lec.java.pb06;

import java.util.ArrayList;

// Controller부분을 담당할 클래스
public class PhonebookManager implements DbQuery {

	// 멤버 변수
	// 전화번호를 저장할 ArrayList
	private ArrayList<PhonebookModel> pbList =
			new ArrayList<PhonebookModel>();
	
	
	// singleton 디자인 패턴 적용
	// 1. 생성자 대신 public static 메소드를 제공해서
	// 인스턴스를 생성 또는 생성되어 있는 인스턴스를 리턴(반환)해 주도록 함
	// 2. 해당 클래스의 인스턴스는 오직 하나만 생성될 수 있다.
	private static PhonebookManager instance = null;
	private PhonebookManager() {} // private 생성자
	public static PhonebookManager getInstance() {
		if (instance == null) {
			instance = new PhonebookManager();
		}
		
		return instance;
	} // end getInstance()
	
	
	@Override
	public void insert(String name, String phoneNum, String email) {
		System.out.println("insert 호출");
		
		// ArrayList에 데이터 추가: add()
		pbList.add(new PhonebookModel(name, phoneNum, email));
//		PhonebookModel pb = new PhonebookModel(name, phoneNum, email);
//		pbList.add(pb);
		
	} // end insert()

	@Override
	public void searchAll() {
		System.out.println("search 호출");
		
		for (int i = 0; i < pbList.size(); i++) {
			pbList.get(i).displayInfo();
		} // end for
		
	} // end searchAll()

	@Override
	public void update(int index, String name, String phoneNum, String email) {
		System.out.println("update 호출");
		
		if (index < pbList.size()) {
			pbList.get(index).setName(name);
			pbList.get(index).setPhoneNum(phoneNum);
			pbList.get(index).setEmail(email);
			pbList.get(index).displayInfo();

		} else {
			System.out.println("수정할 데이터가 없습니다.");
		}
		
	} // end update()

	@Override
	public void delete(int index) {
		System.out.println("delete 호출");
		
		if (index < pbList.size()) {
			pbList.remove(index);
			
		} else {
			System.out.println("삭제할 데이터가 없습니다!");
		} // end else
		
	} // end delete()
	
} // end class PhonebookManger













