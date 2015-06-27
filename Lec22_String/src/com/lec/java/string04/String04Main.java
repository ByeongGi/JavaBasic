package com.lec.java.string04;

import java.util.StringTokenizer;

public class String04Main {

	public static void main(String[] args) {
		System.out.println("StringTokenizer 클래스");
		
		String str = "13:46:12";
		StringTokenizer token = new StringTokenizer(str, ":");
		System.out.println("토큰 개수: " + token.countTokens());
		while (token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		} // end while
		
		
		System.out.println();
		String str2 = "abc:def:ghi:jkl:mno";
		StringTokenizer token2 = new StringTokenizer(str2, ":");
		System.out.println("토큰 개수: " + token2.countTokens());
		while (token2.hasMoreTokens()) {
			System.out.println(token2.nextToken());
		} // end while
		
		System.out.println();
		String str3 = "2015/04/08";
		StringTokenizer token3 = new StringTokenizer(str3, "/");
		while (token3.hasMoreTokens()) {
			System.out.println(token3.nextToken());
		} // end while
		
		System.out.println();
		String str4 = "2015년-4월-8일";
		StringTokenizer token4 = new StringTokenizer(str4, "-");
		while (token4.hasMoreTokens()) {
			System.out.println(token4.nextToken());
		} // end while
		
		System.out.println();
		String str5 = "2015-04-08 14:10:55";
		StringTokenizer token5 = new StringTokenizer(str5, "-: ");
		while (token5.hasMoreTokens()) {
			System.out.println(token5.nextToken());
		} // end while
		
		System.out.println();
		String str6 = "num += 1";
		StringTokenizer token6 = new StringTokenizer(str6, "+=", false);
		while (token6.hasMoreTokens()) {
			System.out.println(token6.nextToken());
		} // end while
		

	} // end main()

} // end class String04Main











