package com.lec.java.operationexample;

public class Exercise3_10 {

	public static void main(String[] args) {
		char ch = 'A';
		
		char lowerCase = (char) ((97>ch&&ch>=65)? (ch+32) :ch);
		// ch = 'A' = 65 , ch = 'A'+32 = 'a';
		// 97>ch>=65 사이는 대문자 임 
		System.out.println("lowerCase : "+lowerCase);
	}

}
