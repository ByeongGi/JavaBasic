package com.lec.java.file05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Program <=== BufferedInputStream <=== FileInputStream <=== File
// Program ===> BufferedOutputStream ===> FileOutputStream ===> File

public class File05Main {

	public static void main(String[] args) {
		System.out.println("Buffered Stream 2");
		
		try (
				InputStream in = 
						new FileInputStream("temp/big_text.txt");
				BufferedInputStream bin =
						new BufferedInputStream(in);
				OutputStream out =
						new FileOutputStream("temp/copy_big_text.txt");
				BufferedOutputStream bout =
						new BufferedOutputStream(out);
				)
		{
			byte[] buff = new byte[1024];
			int bytesRead = 0;
			int bytesCopied = 0;
			
			long startTime = System.currentTimeMillis();
			while (true) {
				bytesRead = bin.read(buff);
				if (bytesRead == -1) {
					break;
				} // end if
				
				bout.write(buff);
				bytesCopied += bytesRead;
				
			} // end while
			long endTime = System.currentTimeMillis();
			
			System.out.println("전체 복사한 바이트: " + bytesCopied);
			System.out.println("경과 시간(ms): " + (endTime - startTime));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	} // end main()

} // end class File05Main
















