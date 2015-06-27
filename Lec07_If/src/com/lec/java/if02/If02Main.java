package com.lec.java.if02;

public class If02Main {

	public static void main(String[] args) {
		System.out.println("if - else if - else");
		
		int korean = 88;
		int english = 80;
		int math = 83;
		int total = korean + english + math; // 총점
		int average = total / 3; // 평균
		
		System.out.println("국어: " + korean);
		System.out.println("영어: " + english);
		System.out.println("수학: " + math);
		System.out.println("총점: " + total);
		System.out.println("평균: " + average);
		
		// 1. 평균이 90점 이상이면 A학점 (평균: 90 ~ 100)
		// 2. 평균이 80점 이상이면 B학점 (평균: 80 ~ 89)
		// 3. 평균이 70점 이상이면 C학점 (평균: 70 ~ 79)
		// 4. 평균이 60점 이상이면 D학점 (평균: 60 ~ 69)
		// 5. 평균이 60점 미만이면 F학점
		if (average >= 90) {
			// 1.
			System.out.println("학점: A");
		} else if (average >= 80) {
			// 2.
			System.out.println("학점: B");
		} else if (average >= 70) {
			// 3.
			System.out.println("학점: C");
		} else if (average >= 60) {
			// 4.
			System.out.println("학점: D");
		} else {
			// 5.
			System.out.println("학점: F");
		}

	} // end main()

} // end class










