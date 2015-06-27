package com.lec.java.db3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Db03Main {

	// JDBC 드라이버 클래스 정보
	public static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	// DB 서버 정보
	public static final String URL = "jdbc:oracle:thin:@pc1410:1521:XE";
	// DB 사용자 계정 정보
	public static final String USER = "scott";
	public static final String PASSWORD = "tiger";
	// DB table 이름
	public static final String TBL_NAME = "test_member";
	public static final String COL_LABEL_ID = "id";
	public static final String COL_LABEL_PASSWORD = "password";
	public static final String COL_LABEL_EMAIL = "email";

	// PreparedStatement에서 사용될 SQL 문장
	
	public static final String SQL_SELECT_ALL = "SELECT * FROM " + TBL_NAME;
	public static final String SQL_INSERT = "INSERT INTO " + TBL_NAME
			+ " VALUES(?,?,?)";
	public static final String SQL_UPDATE = "UPDATE " + TBL_NAME + " SET "
			+ COL_LABEL_EMAIL + " = ?" + " WHERE " + COL_LABEL_ID + " = ?";
	public static final String SQL_DELETE = "DELETE FROM " + TBL_NAME
			+ " WHERE " + COL_LABEL_ID + " = ?";

	public static void main(String[] args) {

		System.out.println("DB prepardStatement ");

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsult = null;
		try {
			// Oracle 드라이버
			Class.forName(DRIVER);
			System.out.println("DRIVER 로딩 성공"+"\n");	
			// DB-connect
			conn = DriverManager.getConnection(URL,USER,PASSWORD);
			System.out.println("DB 연동 성공"+"\n");
			// preparedStatement 인스턴스 생성
			// SQL_SELECT_ALL 
			
			System.out.println("preparedStatement 생성 성공"+"\n");
			// SQL_INSERT
			System.out.println();
			pstmt = conn.prepareStatement(SQL_INSERT);
			pstmt.setString(1,"id001");
			pstmt.setString(2,"pw102");
			pstmt.setString(3,"id001@test.com");
			int rslt =pstmt.executeUpdate();
			System.out.println(rslt+"개 행(ROW) INSERT 성공");
			
			// SQL_UPDATE
			System.out.println();
			pstmt = conn.prepareStatement(SQL_UPDATE);
			pstmt.setString(1, "update@test.com");
			pstmt.setString(2, "asdf");
			int urslt= pstmt.executeUpdate();
			System.out.println(urslt+"개 행(ROW) UPDATE 성공");
			
			// SQL_DELETE
			System.out.println();
			pstmt =conn.prepareStatement(SQL_DELETE);
			pstmt.setString(1, "id001");
			int drslt= pstmt.executeUpdate();
			System.out.println(drslt+"개 행(ROW) DELETE 성공");
			
			// SQL 전송/실행
			pstmt = conn.prepareStatement(SQL_SELECT_ALL);
			rsult = pstmt.executeQuery();
			System.out.println(" SQL 질의 성공"+"\n");
			while (rsult.next()) {
				String id = rsult.getString(COL_LABEL_ID);
				String pw = rsult.getString(COL_LABEL_PASSWORD);
				String email = rsult.getString(COL_LABEL_EMAIL);
				System.out.println("id:"+id+"  | \t"+"pw"+pw+"  |  \t"+"email"+email);
			}
			
			// SQL 테이블생성 
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rsult != null) {
					System.out.println("rsult 종료");
					rsult.close();
				}
				if (pstmt != null) {
					System.out.println("pstmt 종료");
					pstmt.close();
				}
				if (conn != null) {
					System.out.println("conn 종료");
					conn.close();
				}

			} catch (SQLException e2) {
				// TODO: handle exception
			}

		}

	} // end main

} // end class Db03Main
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               