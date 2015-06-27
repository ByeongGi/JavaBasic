package com.lec.java.file07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Program <=== ObjectInputStream <=== FileInputStream <=== File
// Program ===> ObjectOutputStream ===> FileOutputStream ===> File

public class File07Main {

	public static void main(String[] args) {
		System.out.println("Data Filter Stream 연습");
		try (
				OutputStream out =
						new FileOutputStream("temp/ascii.bin");
				DataOutputStream dout = 
						new DataOutputStream(out);
				InputStream in =
						new FileInputStream("temp/ascii.bin");
				DataInputStream din =
						new DataInputStream(in);
				)
		{
			for (int i = 0; i < 65536; i++) {
				dout.writeChar(i);
			} // end for
			
			for (int i = 0; i < 65536; i++) {
				System.out.println(din.readChar());
			} // end for
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	} // end main()

} // end class File07Main



















