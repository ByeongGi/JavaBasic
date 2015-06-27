package com.lec.java.file02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Program <=== InputStream <=== Source
// Program ===> OutputStream ===> Source
// Program <=== FileInputStream <=== File
// Program ===> FileOutputStream ===> File

// java.io.InputStream
//  |__ java.io.FileInputStream: 파일로부터 데이터를 읽어오는 통로
// java.io.OutputStream
//  |__ java.io.FileOutputStream: 파일로 데이터를 쓰는 통로

public class File02Main {

	public static void main(String[] args) {
		System.out.println("File IO");

		InputStream in = null; // InputStream 변수 선언
		OutputStream out = null; // OutputStream 변수 선언
		try {
			// FileInputStream 인스턴스 생성
			in = new FileInputStream("temp/big_text.txt");

			// FileOutputStream 인스턴스 생성
			out = new FileOutputStream("temp/copy_big_text.txt");
			
			int dataRead;
			int bytesCopied = 0;
			long startTime = System.currentTimeMillis(); // 현재 시간 저장
			
			while (true) {
				// 데이터 읽기: InputStream에 있는 read() 메소드 사용
				dataRead = in.read();
				if (dataRead == -1) {
					// 더이상 파일에서 읽을 데이터가 없는 경우
					break; // while 문 빠져나감
				} // end if
				
				// 데이터 쓰기: OutputStream에 있는 write() 메소드 사용
				out.write(dataRead);
				bytesCopied++;
				
			} // end while
			
			long endTime = System.currentTimeMillis(); // 끝난 시간 저장
			long elapsedTime = endTime - startTime; // 경과 시간

			System.out.println("읽고 쓴 바이트: " + bytesCopied);
			System.out.println("경과 시간(ms): " + elapsedTime);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { // 리소스 해제
			try {
				if (out != null) {
					out.close();
				} // end if
				if (in != null) {
					in.close();
				} // end if

			} catch (IOException e) {
				e.printStackTrace();

			} // end catch

		} // end finally

	} // end main()

} // end class File02Main

