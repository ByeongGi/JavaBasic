package com.study.java.mariadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//JDB PROJECT 
//0. 라이브러리 추가(jar)추가:
//		1) 이클립스 프로젝트 폴더에 libs 폴더를 생성
//		2) 오라클이 깔린 하위폴더에서 lib 폴더에 있는 jar 확장자로 된 자료를 libs 폴더로 복사
//		3) 복사한 라이브러리를 빌드 패스에 추가
//1. oracle 연동을 위한 정보들(상수들을) 정의(세팅)
//2. JDBC 드라이버 클래스를 메로리에 로드
//3. DB와 connection을 맺음
//4. statement 인스턴스 생성(SQL 을 사용하기 위한 인스턴스)
//5. SQL 문장 작성(SELECT, INSERT, UPDATE, DELETE)
//6. SQL 문장을 DB 서버로 전송
//7. 실행 결과 확인 
public class MariaDb01Main {
	// 1. oracle 연동을 위한 정보들(상수들을) 정의(세팅)
	// JDBC 드라이버 클래스 정보
	public static final String DRIVER = "org.mariadb.jdbc.Driver";
	// DB 서버 정보
	public static final String URI = "jdbc:mariadb://127.0.0.1:3306/kiradb";
	// DB 사용자 계정 정보
	public static final String USER = "kira";
	public static final String PASSWORD = "fkrldhs77";
	// DB table 이름
	public static final String TBL_NAME = "member";
	public static final String COL_LABEL_ID = "id";
	public static final String COL_LABEL_PASSWORD = "password";
	public static final String COL_LABEL_EMAIL = "email";

	public static void main(String[] args) {
		System.out.println("Db 1");

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs =null; // ResultSet 라는 타입을 반환한것으 받아주는 변수 선언 
		try {
			// 2. JDBC 드라이버 클래스를 메로리에 로드
			Class.forName(DRIVER);
			System.out.println("드라이브 클래스 로딩 성공");
			// 3. DriveManager 클래스를 사용해서 DB 와 연결
			conn = DriverManager.getConnection(URI, USER, PASSWORD);
			System.out.println("DB Connect 성공");

			// 4. statement 인스턴스 생성(SQL 을 사용하기 위한 인스턴스)
			stmt = conn.createStatement();
			System.out.println("statement 생성 성공");
			
			// 5. SQL 문장 작성
			
			String sql_insert ="INSERT INTO "+TBL_NAME+" VALUES('aaa','abab0','abgbc@abc.com')";
			System.out.println(sql_insert);
			int count =stmt.executeUpdate(sql_insert);
			System.out.println(count+"개 row(행)이 삽입됨");
			
			String sql ="SELECT * FROM "+TBL_NAME;
			
			// 6. Statement 객체를 사용해서 SQL 문장을 DB 서버로 전송
			rs=stmt.executeQuery(sql);
			System.out.println("SQL 문장 전송 성공");
			
			// 7. 결과 확인
			while (rs.next()){
				String id=rs.getString(COL_LABEL_ID);
				String password= rs.getString(COL_LABEL_PASSWORD);
				String email = rs.getString(COL_LABEL_EMAIL);
				String rslt = id + "\t"+password+"\t"+email;
				System.out.println(rslt);
			}
			

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs!=null) {
					rs.close();
					System.out.println("rs 종료");
				}
				if (stmt != null) {

					stmt.close();
					System.out.println("statement 종료");
				}
				if (conn != null) {
					System.out.println("Connect 종료");
					conn.close();

				}
				
				
				
			} catch (SQLException e2) {
				System.out.println("SQL 쪽 오류 발생");
				e2.printStackTrace();
			}
		}

	} // end main

} // end class Db01Main

