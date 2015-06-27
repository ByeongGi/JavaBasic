package com.lec.java.pb04;

import java.util.Scanner;

public class Phonebook04Main {

	// 멤버 변수
	static Scanner sc = new Scanner(System.in);
	
	// switch문에서 사용할 상수 정의
	public static final int MENU_QUIT = 0;
	public static final int MENU_INSERT = 1;
	public static final int MENU_SEARCH_ALL = 2;
	public static final int MENU_SEARCH = 3;
	public static final int MENU_UPDATE = 4;
	
	
	// 전화번호 데이터를 저장할 배열
	public static final int MAX = 100;
	static PhonebookModel[] pb = new PhonebookModel[MAX];
	static int count = 0;
	
	// 메소드
	public static void showMenu() {
		System.out.println();
		System.out.println("전화번호부 프로그램 메뉴");
		System.out.println("-----------------------");
		System.out.println(" [0] 종료");
		System.out.println(" [1] 입력");
		System.out.println(" [2] 전체 검색");
		System.out.println(" [3] 검색");
		System.out.println(" [4] 수정");
		System.out.println("-----------------------");
		System.out.println("선택:");
	} // end showMenu()
	
	public static void insertPhonebook() {
		System.out.println("이름 입력:");
		String name = sc.nextLine();
		
		System.out.println("전화번호 입력:");
		String phoneNum = sc.nextLine();
		
		System.out.println("이메일 입력:");
		String email = sc.nextLine();
		
		pb[count] = new PhonebookModel(name, phoneNum, email);
		pb[count].displayInfo();
		
		count++;
		
	} // end insertPhonebook()
	
	public static void searchPhonebookAll() {
		for (int i = 0; i < count; i++) {
			pb[i].displayInfo();
		} // end for
		
	} // end searchPhonebookAll()
	
	public static void searchPhonebook() {
		System.out.println("검색 [0 ~ " + (count - 1) + "] 선택:");
		int n = sc.nextInt();
		sc.nextLine(); // 숫자 입력 후에 엔터 키 무시하기 위해서
		
		if (n < count) {
			pb[n].displayInfo();
		} else {
			System.out.println("해당 데이터는 없습니다!");
		}
		
	} // end searchPhonebook()
	
	public static void updatePhonebook() {
		System.out.println("수정 [0 ~ " + (count - 1) + "] 선택:");
		int n = sc.nextInt();
		sc.nextLine();
		
		System.out.println("수정할 이름:");
		String name = sc.nextLine();
		
		System.out.println("수정할 전화번호:");
		String phoneNum = sc.nextLine();
		
		System.out.println("수정할 이메일:");
		String email = sc.nextLine();
		
		if (n < count) {
			pb[n].setName(name);
			pb[n].setPhoneNum(phoneNum);
			pb[n].setEmail(email);
		} else {
			System.out.println("해당 데이터는 없습니다.");
		}
		
	} // end updatePhonebook()
	
	
	public static void main(String[] args) {
		System.out.println("전화번호부 v0.4");
		
		while (true) {
			showMenu();
			int menu = sc.nextInt();
			sc.nextLine(); // 숫자 입력 뒤에 엔터 키를 무시하기 위해서
			
			switch (menu) {
			case MENU_QUIT:
				// 프로그램 종료 <- main 메소드를 종료
				System.out.println("프로그램을 종료합니다...");
				return;
				
			case MENU_INSERT:
				insertPhonebook();
				break;
				
			case MENU_SEARCH_ALL:
				searchPhonebookAll();
				break;
				
			case MENU_SEARCH:
				searchPhonebook();
				break;
				
			case MENU_UPDATE:
				updatePhonebook();
				break;
				
			default:
				System.out.println("잘못 입력했습니다.");
				System.out.println("다시 선택하세요~");
				
			} // end switch
			
		} // end while
		

	} // end main()

} // end class Phonebook04Main


























