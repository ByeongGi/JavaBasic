package com.lec.java.mvc01;

import java.util.Scanner;

// View 기능(UI)을 담당할 클래스
public class MemberMain {

	static Scanner sc = new Scanner(System.in);
	
	static MemberManager memberMgr = MemberManager.getInstance();
	
	public static void showMenu() {
		System.out.println();
		System.out.println("회원관리 메뉴");
		System.out.println("------------------");
		System.out.println(" [0] 종료");
		System.out.println(" [1] 회원정보 입력");
		System.out.println(" [2] 회원정보 검색");
		System.out.println(" [3] 회원정보 수정");
		System.out.println("------------------");
		System.out.println("선택:");
		
	} // end showMenu()
	
	public static void insertMemberData() {
		System.out.println("회원정보 입력 메뉴");
		System.out.println("아이디 입력:");
		String id = sc.nextLine();
		
		System.out.println("비밀번호 입력:");
		String pw = sc.nextLine();
		
		memberMgr.insert(id, pw);
		
	} // end insertMemberData()
	
	public static void updateMemberData() {
		System.out.println("회원정보 수정 메뉴");
		
		System.out.println("수정할 회원 번호 입력:");
		int index = sc.nextInt();
		sc.nextLine(); // 숫자 뒤의 엔터키 무시
		
		System.out.println("수정할 아이디 입력:");
		String id = sc.nextLine();
		
		System.out.println("수정할 비밀번호 입력:");
		String pw = sc.nextLine();
		
		memberMgr.update(index, id, pw);
		
	} // end updateMemberData() 
	
	
	public static void main(String[] args) {
		System.out.println("회원 관리");

		while (true) {
			showMenu();
			int menu = sc.nextInt();
			sc.nextLine(); // 숫자 뒤에 엔터키를 무시
			
			switch (menu) {
			case Menu.MENU_QUIT:
				System.out.println("프로그램을 종료합니다...");
				sc.close();
				return;
				
			case Menu.MENU_INSERT:
				insertMemberData();
				break;
				
			case Menu.MENU_SEARCH:
				memberMgr.searchAll();
				break;
				
			case Menu.MENU_UPDATE:
				updateMemberData();
			} // end switch
			
		} // end while
		

	} // end main()

} // end class MemberMain





