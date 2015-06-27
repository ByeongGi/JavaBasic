package com.lec.java.operationexample;
// 문제 풀고 나서 생각해야 다시 복습한것 생각
// 정수형 (byte(1바이트 2^8) <short(2바이트 2^16)< int(4바이트 2^32) < long(8바이트 2^64) )
public class Exercise3_8 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = (byte) (a + b); // byte 형으로  변환해야 한다 .
		
		char ch ='A';
		ch = (char) (ch+2); // char 형으로 변환해야 한다 .
		
		float f = (3 / 2f); // float는 f 를 붙어서 int 형에서 float 형으로 인식시켜야 한다 .
		long l = 3000 * 3000 * 3000l; // l 을 붙어서 l 형으로 인식해야 한다.
		
		float f2 = 0.1f;
		double d = 0.1d;
		
		boolean result = d==f2;
		
		System.out.println("c = "+c);
		System.out.println("ch = "+ch);
		System.out.println("f = "+f);
		System.out.println("l = "+l);
		System.out.println("result = "+result);
		
		

	}

}
