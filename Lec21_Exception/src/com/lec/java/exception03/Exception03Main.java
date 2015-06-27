package com.lec.java.exception03;

public class Exception03Main {

	public static void main(String[] args) {
		System.out.println("예외 처리: try ~ catch");
		
		System.out.println();
		try {
			int[] numbers = new int[10];
			numbers[100] = 111;
		
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("예외 메시지: " + ex.getMessage());
			
		} // end catch
		
		
		System.out.println();
		try {
			String str = null;
			System.out.println("스트링 길이: " + str.length());
			
		} catch (NullPointerException ex) {
			System.out.println("예외 메시지: " + ex.getMessage());
			
		} // end catch

	} // end main

} // end class Exception03Main












