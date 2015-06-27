package com.lec.java.pb06;

import java.util.Scanner;


// UI(User Interface)를 담당할 View 클래스
public class Phonebook06Main {

	// 멤버 변수
	static Scanner sc = new Scanner(System.in);
	
	static PhonebookManager pbMgr = PhonebookManager.getInstance();
	
	
	// 메소드
	public static void showMenu() {
		System.out.println();
		System.out.println("전화번호부 메뉴");
		System.out.println("---------------");
		System.out.println(" [0] 종료");
		System.out.println(" [1] 입력");
		System.out.println(" [2] 검색");
		System.out.println(" [3] 수정");
		System.out.println(" [4] 삭제");
		System.out.println("---------------");
		System.out.println("선택:");
	} // end showMenu()
	
	public static void insertPhonebookData() {
		System.out.println("--- 입력 메뉴 ---");
		
		System.out.println("이름 입력:");
		String name = sc.nextLine();
		
		System.out.println("전화번호 입력:");
		String phoneNum = sc.nextLine();
		
		System.out.println("이메일 입력:");
		String email = sc.nextLine();
		
		pbMgr.insert(name, phoneNum, email);
	} // end insertPhonebookData()
	
	public static void updatePhonebookData() {
		System.out.println("--- 수정 메뉴 ---");
		
		System.out.println("수정할 번호 입력:");
		int index = sc.nextInt();
		sc.nextLine();
		
		System.out.println("이름 입력:");
		String name = sc.nextLine();
		
		System.out.println("전화번호 입력:");
		String phoneNum = sc.nextLine();
		
		System.out.println("이메일 입력:");
		String email = sc.nextLine();
		
		pbMgr.update(index, name, phoneNum, email);
	} // end updatePhonebookData()
	
	public static void deletePhonebookData() {
		System.out.println("--- 삭제 메뉴 ---");
		
		System.out.println("삭제할 데이터 번호 입력:");
		int index = sc.nextInt();
		sc.nextLine(); // 숫자 입력 뒤의 엔터키 무시하기 위해서
		
		pbMgr.delete(index);
		
	} // end deletePhonebookData()
	
	
	public static void main(String[] args) {
		System.out.println("전화번호부 v0.6 (ArrayList사용)");
		
		while (true) {
			showMenu();
			int menu = sc.nextInt();
			sc.nextLine(); // 숫자 입력 후에 엔터키를 무시하기 위해서
			
			switch (menu) {
			case Menu.MENU_QUIT:
				System.out.println("프로그램을 종료합니다...");
				return; // main 메소드 종료
				
			case Menu.MENU_INSERT:
				insertPhonebookData();
				break;
				
			case Menu.MENU_SEARCH:
				pbMgr.searchAll();
				break;
				
			case Menu.MENU_UPDATE:
				updatePhonebookData();
				break;
				
			case Menu.MENU_DELETE:
				deletePhonebookData();
				break;
				
			default:
				System.out.println("잘못 입력했습니다.");
				
			} // end switch
			
		} // end while

	} // end main()

} // end class Phonebook05Main












