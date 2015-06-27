package com.lec.java.pb05;

// Controller부분을 담당할 클래스
public class PhonebookManager implements DbQuery {

	// 멤버 변수
	public static final int MAX_DATA = 100; // 최대 데이터 개수
	private PhonebookModel[] pbList = new PhonebookModel[MAX_DATA];
	// 전화번호를 저장할 배열
	private int count = 0; // 몇 개의 데이터가 저장됐는 지
	
	
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
		
		pbList[count] = new PhonebookModel(name, phoneNum, email);
		pbList[count].displayInfo();
		count++;
	} // end insert()

	@Override
	public void searchAll() {
		System.out.println("search 호출");
		
		for (int i = 0; i < count; i++) {
			pbList[i].displayInfo();
		} // end for
		
	} // end searchAll()

	@Override
	public void update(int index, String name, String phoneNum, String email) {
		System.out.println("update 호출");
		
		if (index < count) {
			pbList[index].setName(name);
			pbList[index].setPhoneNum(phoneNum);
			pbList[index].setEmail(email);
			
			pbList[index].displayInfo();
		} else {
			System.out.println("수정할 데이터가 없습니다.");
		}
		
	} // end update()

} // end class PhonebookManger













