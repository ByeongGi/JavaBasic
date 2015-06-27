package com.lec.java.file01;

import java.util.Scanner;

// Program <--- InputStream <--- Source(Keyboard, Mouse, File)
// Program ---> OutputStream ---> Source(Monitor, Beam, File)

// java.io.InputStream: 프로그램이 데이터를 읽어들이는(read) 통로
// java.io.OutputStream: 프로그램이 데이터를 쓰는(write) 통로

public class File01Main {

	public static void main(String[] args) {
		System.out.println("IO(Input/Output)");
		
		Scanner sc = new Scanner(System.in);
		// InputStream 객체 in을 가지고 읽어들일 수 있는 스캐너 객체 생성
		
		String msg = sc.nextLine();
		// 외부장치(콘솔, 키보드)로부터 데이터를 읽음
		
		System.out.println(msg);
		// OutpustStream 객체인 out이 가지고 있는 println() 메소드를 사용
		// 외부장치(콘솔, 모니터)에 데이터를 씀
		
		sc.close();

	} // end main()

} // end File01Main












