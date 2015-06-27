package com.lec.java.file06;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Program <=== DataInputStream <=== FileInputStream <=== File
// Program ===> DataOutputStream ===> FileOutputStream ===> File

public class File06Main {

	public static void main(String[] args) {
		System.out.println("Data Filter Stream");
		
		try (
				OutputStream out =
						new FileOutputStream("temp/data.bin");
				DataOutputStream dout =
						new DataOutputStream(out);
				InputStream in =
						new FileInputStream("temp/data.bin");
				DataInputStream din =
						new DataInputStream(in);)
		{
			dout.writeBoolean(true); // 1 byte
			dout.writeInt(100); // 4 bytes
			dout.writeDouble(3.14); // 8 bytes
			dout.writeChar('A'); // 2 bytes
			
			boolean b = din.readBoolean();
			System.out.println("boolean: " + b);
			
			int num1 = din.readInt();
			System.out.println("int: " + num1);
			
			double num2 = din.readDouble();
			System.out.println("double: " + num2);
			
			char ch = din.readChar();
			System.out.println("char: " + ch);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	} // end main()

} // end class File06Main
















