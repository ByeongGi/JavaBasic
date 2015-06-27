package com.lec.java.string01;

public class String01Main {

	public static void main(String[] args) {
		System.out.println("String 클래스의 메소드들");
		
		String str1 = "AbCdEfg";
		String str2 = "안녕하세요~";
		
		System.out.println();
		System.out.println("String length()");
		System.out.println("str1 길이: " + str1.length());
		System.out.println("str2 길이: " + str2.length());
		
		System.out.println();
		System.out.println("String concat()");
		System.out.println(str1.concat(str2));
		System.out.println(str2.concat(str1));
		System.out.println(str1.concat(str2).concat(str1));
//		System.out.println(str1.concat(str2).length());
		String str3 = str1.concat(str2);
		System.out.println(str3.length());
		
		System.out.println();
		System.out.println("String indexOf()");
		System.out.println(str1.indexOf('c'));
		System.out.println(str2.indexOf('요'));
		
		System.out.println();
		System.out.println("String charAt()");
		System.out.println(str1.charAt(0));
		System.out.println(str1.charAt(1));
		
		System.out.println("toUpperCase(), toLowerCase");
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		System.out.println();
		System.out.println("startWith()");
		String prefix = "http://";
		String url = "www.google.com";
		System.out.println(url.startsWith(prefix));
		if (!url.startsWith(prefix)) {
			String newUrl = prefix.concat(url);
			System.out.println(newUrl);
		}
		
		System.out.println("split()");
		String str4 = "HH:MM:SS";
		String[] strings = str4.split(":");
		for (String x : strings) {
			System.out.println(x);
		}
		

	} // end main()

} // end Strign01Main









