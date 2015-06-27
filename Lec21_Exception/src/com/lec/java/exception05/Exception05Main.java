package com.lec.java.exception05;

public class Exception05Main {

	public static void main(String[] args) {
		System.out.println("multi-catch");
		// Java 7부터 하나의 catch문에서 여러개의 예외를 처리할 수 있는 방법을 제공
		try {
//			String str = null;
//			str.length();
			int n = 123 / 0;
			
		} catch (ArithmeticException
				| NullPointerException
				| ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getClass());
			System.out.println(ex.getMessage());
			
		} // end catch
		
		
		System.out.println();
		System.out.println("finally");
		// 예외(exception) 발생 여부와 상관없이 항상 실행되어야 할
		// 코드들은 finally 블록 안에서 작성.
		// 즉, finally 블록 안에 있는 코드들은 항상 실행이 됨.
		// 예외가 발생하지 않을 때에는 try 블록 안의 코드들이
		// 모두 실행된 후에 finally 블록의 코드들이 실행
		// 예외가 발생할 때는, 해당 catch 블록의 코드들이
		// 실행된 후에 finally 블록의 코드들이 실행
		// (주의) try 블록이나 catch 블록 안에 return이 있더라도,
		// finally 블록 안의 코드들이 다 실행된 이후에
		// return이 실행되게 됨.
		try {
			int[] numbers = new int[10];
			numbers[0] = 123;
			
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("예외 메시지: " + ex.getMessage());
			
			return;
			
		} finally {
			System.out.println("언제 실행될까요?");
			
		} // end finally
		
		System.out.println();
		System.out.println("프로그램 종료...");

	} // end main

} // end class Exception05Main











