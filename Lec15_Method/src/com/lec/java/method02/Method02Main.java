package com.lec.java.method02;

public class Method02Main {

	// 리턴타입: int
	// 메소드 이름: add
	// 매개변수:
	//   1) int x
	//   2) int y
	public static int add(int x, int y) {
		int result = x + y;
		
		return result;
	} // end add()
	
	// 리턴타입: int
	// 메소드 이름: sub
	// 매개변수:
	//   1) int x
	//   2) int y
	public static int sub(int x, int y) {
		int result = x - y;
		
		return result;
	} // end sub()
	
	// 리턴타입: int
	// 메소드 이름: multiply
	// 매개변수:
	//   1) int x
	//   2) int y
	public static int multiply(int x, int y) {
		return x * y;
	} // end multiply()
	
	// 리턴타입: int
	// 메소드 이름: divide
	// 매개변수: 
	//   1) int x
	//   2) int y
	// 기능: x를 y로 나눈 몫을 리턴하는 메소드
	public static int divide(int x, int y) {
		if (y == 0) {
			System.out.println("0으로는 나눌 수 없습니다.");
			
			return 0;
			// return의 의미
			// 1. 메소드를 호출한 곳으로 값을 리턴한다.
			// 2. 메소드를 끝낸다.
		}
			
		int result = x / y;
		
		return result;
	} // end divide()
	
	// 리턴타입: String
	// 메소드 이름: divide2
	// 매개변수:
	//   1) int x
	//   2) int y
	public static String divide2(int x, int y) {
		String result;
		if (y == 0) {
			result = "0으로 나눌 수 없어요!!!";
		} else {
			result = "나눈 몫은 " + (x / y) + "\n"
					+ "나눈 나머지는 " + (x % y) + "입니다.";
		} // end else
		
		return result;
	} // end divide2();
	
	public static void main(String[] args) {
		System.out.println("메소드의 리턴 타입");
		
		// 메소드의 매개변수로 정수 두 개를 넘겨주면
		// 그 결과로 더한 값을 되돌려 받고 싶다.
		int sum = add(110, 220);
		System.out.println("sum = " + sum);
		
		System.out.println();
		// 메소드의 매개변수로 정수 두 개를 넘겨주면
		// 그 결과로 앞의 수에서 뒤의 수를 뺀 값을 되돌려 싶다.
		int result = sub(100, 10);
		System.out.println("result = " + result);
		
		System.out.println();
		// 곱하기
		result = multiply(123, 321);
		System.out.println("result = " + result);
		
		System.out.println();
		// 나누기
		result = divide(25, 0);
		System.out.println("result = " + result);
	
		System.out.println();
		String str = divide2(123, 0);
		System.out.println(str);
		
	} // end main()

} // end class Method02Main









