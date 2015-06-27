package com.lec.java.file08;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

// Program <=== ObjectInputStream <=== FileInputStream <=== File
// Program ===> ObjectOutputStream ===> FileOutputStream ===> File

// Object Stream: 객체의 입출력을 위한 스트림
// 사용법은 다른 Filter Stream(Buffered I/O, Data I/O)과 비슷
// Object 스트림의 입출력 대상이 되는 클래스는 Serializable 인터페이스를 구현
// 클래스의 일부 멤버 변수를 직렬화(Serialization)의 대상에서 제외시키려면,
// transient 키워들 사용

public class File08Main {

	public static final String filePath  = "temp/member.dat";
	
	public static void main(String[] args) {
		System.out.println("Object Filter Stream");
		
		try (OutputStream out = new FileOutputStream(filePath);
				ObjectOutputStream oout =
						new ObjectOutputStream(out);
				InputStream in = new FileInputStream(filePath);
				ObjectInputStream oin =
						new ObjectInputStream(in);)
		{
			// 파일에 쓸 데이터 객체 생성
			Member m1 = new Member("root", "root1234");
			oout.writeObject(m1);
			
			Member m2 = new Member("guest", "guest");
			oout.writeObject(m2);
			
			Member m3 = new Member("admin", "admin123456");
			oout.writeObject(m3);
			
			// 파일에서 Object 타입으로 읽기
//			Member dataRead = (Member) oin.readObject();
//			dataRead.displayInfo();
//			
//			dataRead = (Member) oin.readObject();
//			dataRead.displayInfo();
			Member dataRead;
			while (true) {
				dataRead = (Member) oin.readObject();
				dataRead.displayInfo();

			} // end while
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("파일 끝까지 읽었습니다.");
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	} // end main()

} // end class File08Main
















