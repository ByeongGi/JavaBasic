package com.lec.java.string02;

public class String02Main {

	public static void main(String[] args) {
		System.out.println("String 생성자, literal(상수)");
		
		int num1 = 1;
		int num2 = 1;
		if (num1 == num2) {
			System.out.println("같은 숫자");
		} else {
			System.out.println("다른 숫자");
		}
		
		
		System.out.println();
		System.out.println("[1] String literal 사용");
		// "Hello"는 literal이기 때문에, 한 번 만들어지면 재사용됨
		// 그래서, str1과 str2는 같은 곳(주소)에 있는 문자열 "Hello"를 가리키게 됨
		// 즉, str1과 str2에는 같은 값이 저장되게 됨
		String str1 = "Hello";
		String str2 = "Hello";
		if (str1 == str2) {
			System.out.println("동일한 곳(문자열) 참조");
		} else {
			System.out.println("다른 곳(문자열) 참조");
		}
		
		
		System.out.println();
		System.out.println("[2] String 생성자 사용");
		// 생성자는 호출될 때마다 새로운 인스턴스를 힙에 생성하게 됨
		// str3과 str4는 서로 다른 인스턴스를 가리키게 됨
		// 즉, str3과 str4에는 서로 다른 값이 저장되게 됨
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		if (str3 == str4) {
			System.out.println("동일한 곳(문자열) 참조");
		} else {
			System.out.println("다른 곳(문자열) 참조");
		}
		// == 연산자는 실제 문자열이 같은 지 다른 지를 비교하는 것이 아니고,
		// 참조 변수(지역 변수) str3과 str4에 저장된 값이 
		// 같은 지 다른 지를 비교하는 것임.
		
		System.out.println();
		System.out.println("[3] String equals() 메소드");
		if (str3.equals(str4)) {
			System.out.println("같은 문자열");
		} else {
			System.out.println("다른 문자열");
		}
		
		System.out.println();
		System.out.println("[4] String compareTo() 메소드");
		System.out.println("compareTo: " + str3.compareTo(str4));
		String str5 = "A";
		String str6 = "C";
		System.out.println("compareTo: " + str5.compareTo(str6));
		System.out.println("compareTo: " + str6.compareTo(str5));
		

	} // end main()

} // end class String02Main











