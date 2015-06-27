package com.lec.java.file12;

import java.io.File;
import java.io.IOException;

public class File12Main {

	public static final String TEST_DIRECTORY = "test";
	public static final String TEMP_DIR = "temp";
	public static final String TEST_FILE = "dummy.txt";
	public static final String TEST_RENAME = "re_dummy.txt";
	
	public static void main(String[] args) {
		System.out.println("폴더/파일 생성, 이름변경, 삭제");
		
		System.out.println();
		
		String path = System.getProperty("user.dir") // working dir
				+ File.separator // Windows(\)
				+ TEST_DIRECTORY;
		System.out.println("절대경로: " + path);
		
		// 경로를 사용해서 File 인스턴스 생성
		// -> HDD에 물리적인 파일이 만들어 진 것은 아니다.
		File f = new File(path);
		
		// 폴더 생성: mkdir()
		if (!f.exists()) { // 폴더가 존재하는 지 체크
			// 폴더가 없다면
			if (f.mkdir()) {
				System.out.println("폴더 생성 성공!");
			} else {
				System.out.println("폴더 생성 실패!");
			}
			
		} else {
			System.out.println("폴더가 이미 존재합니다.");
		}
		
		
		System.out.println();
		
		// 파일 생성
		File f2 = new File(f, TEST_FILE);
		System.out.println(f2.getAbsolutePath());
		
		if (!f2.exists()) { // 파일이 존재하는 지 체크
			// 파일이 존재하지 않으면 생성
			try {
				if (f2.createNewFile()) {
					System.out.println("파일 생성 성공!");
				} else {
					System.out.println("파일 생성 실패!");
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} else {
			System.out.println("파일이 이미 존재합니다.");
		}
		
		
		System.out.println();
		
		// 이름 변경: renameTo()
//		File temp = new File(TEMP_DIR);
		// renameTo()를 이용해서 다른 폴더로 이동(move)를 할 수도 있다.
		
		File f3 = new File(f, TEST_RENAME); // 변경할 이름
		System.out.println(f3.getAbsolutePath());
		
		if (f2.exists()) { // 파일이 존재하는 지 체크
			// 파일이 존재할 때만 이름 변경(rename)
			if (f2.renameTo(f3)) {
				System.out.println("파일 이름 변경 성공!");
			} else {
				System.out.println("파일 이름 변경 실패!");
			}
			
		} else {
			System.out.println("변경할 파일이 없습니다.");
		}
		
		
		System.out.println();
		// 파일 삭제: delete()
		File f4 = new File("temp/aaa.txt");
		if (f4.exists()) {
			// 파일이 존재하면 지움
			if (f4.delete()) {
				System.out.println("파일 삭제 성공!");
			} else {
				System.out.println("파일 삭제 실패!");
			}
			
		} else {
			System.out.println("삭제할 파일이 없습니다.");
		}

	} // end main()

} // end class File12Main














