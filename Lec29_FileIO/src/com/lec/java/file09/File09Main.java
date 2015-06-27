package com.lec.java.file09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class File09Main {

	public static void main(String[] args) {
		System.out.println("시스템 정보");
		
		OutputStream out = null;
		InputStream in = null;
		try {
			// OutputStream을 생성(new)할 때는 파일이 존재하지 않아도
			// Exception이 발생하지는 않음.
			out = new FileOutputStream("temp/aaa.txt");
			
			// InputStream을 생성(new)할 때는 파일이 존재하지 않으면
			// FileNotFoundException이 발생
			in = new FileInputStream("temp/aaa.txt");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	} // end main()

} // end File09Main













