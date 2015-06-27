package com.lec.java.file03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// java.io.InputStream
//  |__ java.io.FileInputStream
// java.io.OutputStream
//  |__ java.io.FileOutputStream

public class File03Main {

	public static void main(String[] args) {
		System.out.println("File IO 2");
		
		// Java 7부터 도입된 try-with-resource
		// try (리소스 생성) { ... }
		// catch (exception ) { ... }
		// 리소스를 close하는 코드가 없어도 자동으로 close가 실행
		try (
				// FileInputStream 인스턴스 생성
				InputStream in = 
						new FileInputStream("temp/origin_text.txt");
				// FileOutputStream 인스턴스 생성
				OutputStream out =
						new FileOutputStream("temp/copy_text.txt");
				)
		{
			byte[] buff = new byte[1024];
			int lengthRead = 0;
			int byteCopied = 0;
			
			long startTime = System.currentTimeMillis();
			while (true) {
				// 데이터 읽기
				lengthRead = in.read(buff);
				if (lengthRead == -1) { // InputStream 끝
					break; // while 문 나가기
				} // end if
				
				// 데이터 쓰기
				out.write(buff, 0, lengthRead);
				byteCopied += lengthRead;
				
			} // end while
			long endTime = System.currentTimeMillis();
			long elapsedTime = endTime - startTime;
			
			System.out.println("전체 복사한 바이트: " + byteCopied);
			System.out.println("경과 시간: " + elapsedTime);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	} // end main()

} // end class File03Main
















