package com.lec.java.method08;

import java.util.Scanner;

public class Method08Main {

	public static final int SCISSORS = 0; // 가위
	public static final int ROCK = 1; // 바위
	public static final int PAPER = 2; // 보
	public static final String SCISSORS_STR = "가위";
	public static final String ROCK_STR = "바위";
	public static final String PAPER_STR = "보";
	
	static boolean isTie;
	// 클래스의 멤버 변수
	// 클래스의 선언된 모든 메소드에서 다 사용 가능함
	
	public static void main(String[] args) {
		System.out.println("가위 바위 보 게임");
		Scanner sc = new Scanner(System.in);
		
		do {
			showMenu();

			int userChoice = inputChoice(sc);
			int computerChoice = (int) Math.floor(Math.random() * 3);

			displayChoice(userChoice, computerChoice);

			computeResult(userChoice, computerChoice);
		} while (isTie);

		sc.close();
		
	} // end main()
	
	
	// method name: showMenu
	// return: void
	// arguments: none
	// 기능: 유저가 가위/바위/보 선택할 수 있는 메뉴 출력
	public static void showMenu() {
		System.out.println("-------------");
		System.out.println("[0] 가위");
		System.out.println("[1] 바위");
		System.out.println("[2] 보");
		System.out.println("-------------");
		System.out.println("선택:");
	} // end showMenu()
	
	// method name: inputChoice
	// return: int (유저의 가위(0)/바위(1)/보(2) 선택 내용)
	// arguments: Scanner sc (입력장치)
	public static int inputChoice(Scanner sc) {
		int choice;
		
		while (true) {
			choice = sc.nextInt();
			
			if (choice < 3) {
				break;
			} else {
				System.out.println("다시 입력하세요~");
			} // end else
			
		} // end while()
		
		return choice;
	} // end inputChoice()

	
	// method name: displayChoice
	// return: void
	// arguments:
	//   1) int user: 유저의 선택(가위(0)/바위(1)/보(2))
	//   2) int com: 컴퓨터의 선택(가위(0)/바위(1)/보(2))
	public static void displayChoice(int user, int com) {
		String userStr = getHandType(user);
		String comStr = getHandType(com);
		
		System.out.println("사용자 vs. 컴퓨터");
		System.out.println(userStr + " vs. " + comStr);
	} // end displayChoice()
	
	
	// method name: getHandType
	// return: String (가위/바위/보)
	// arguments: int choice(0, 1, 2)
	public static String getHandType(int choice) {
		String type;
		switch (choice) {
		case SCISSORS:
			type = SCISSORS_STR;
			break;
			
		case ROCK:
			type = ROCK_STR;
			break;
			
		case PAPER:
			type = PAPER_STR;
			break;
			
		default:
			type = "몰라요 ㅠ.ㅠ";
		} // end switch
		
		return type;
	} // end getHandType()
	
	
	// method name: computeResult
	// return: void
	// arguments:
	//   1) int user: 유저의 선택(가위(0)/바위(1)/보(2))
	//   2) int com: 컴퓨터의 선택(가위(0)/바위(1)/보(2))
	public static void computeResult(int user, int com) {
		if (user == com) {
			isTie = true;
			System.out.println("비겼습니다.");
		} else if (user == SCISSORS) {
			isTie = false;
			if (com == ROCK) {
				// 가위 vs 바위
				System.out.println("Com Win!");
			} else {
				// 가위 vs 보
				System.out.println("User Win!");
			}
			
		} else if (user == ROCK) {
			isTie = false;
			if (com == SCISSORS) {
				// 바위 vs 가위
				System.out.println("User Win!");
			} else {
				// 바위 vs 보
				System.out.println("Com Win!");
			}
			
		} else if (user == PAPER) {
			isTie = false;
			if (com == SCISSORS) {
				// 보 vs 가위
				System.out.println("Com Win!");
			} else {
				// 보 vs 바위
				System.out.println("User Win!");
			}
			
		} else {
			
		}
			
	} // end computeResult()
	
} // end class Method08Main









