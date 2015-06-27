package com.lec.java.string03;

public class String03Main {

	public static void main(String[] args) {
		System.out.println("[1] StringBuffer, StringBuilder");
		// String 클래스는 immutable 클래스이고,
		// StringBuffer, StringBuilder는 mutable 클래스임
		String str = "Hello";
		System.out.println(str);
		str = str.concat("Java");
		System.out.println(str);
		String str2 = "HelloJava";
		if (str == str2) {
			System.out.println("동일 참조");
		} else {
			System.out.println("다른 참조");
		}
		
		System.out.println();
		StringBuffer buff = new StringBuffer("Hello");
		System.out.println(buff);
		buff.append("Java");
		System.out.println(buff);
		
		System.out.println();
		buff.insert(3, "ABCD");
		System.out.println(buff);
		
		System.out.println();
		System.out.println(buff.reverse());
		
		System.out.println();
		buff.reverse();
		buff.delete(3, 7);
		System.out.println(buff);

		// StringBuffer:
		//  Java ver 1.0부터 있던 클래스
		//  쓰레드에 안전(thread-safe), 속도가 느림
		// StringBuilder:
		// Java 5부터 생긴 클래스
		// 쓰레드에 안전하지 않다(thread-unsafe), 속도가 빠름.
		// 그 외에는 StringBuffer와 StringBuilder는 같은 기능을 갖고 있음
		
		StringBuffer buff2 = new StringBuffer("Hello, Java!");
		System.out.println(buff2);
		buff2.append("abcdefghijklmnopqrstuvwxyz");
		
		
	} // end main()

} // end class String03Main












