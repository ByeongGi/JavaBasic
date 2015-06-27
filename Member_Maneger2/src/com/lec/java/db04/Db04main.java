package com.lec.java.db04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Db04main {
	// 1. oracle 연동을 위한 정보들(상수들을) 정의(세팅)
	// JDBC 드라이버 클래스 정보
	public static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	// DB 서버 정보
	public static final String URL = "jdbc:oracle:thin:@pc1410:1521:XE";
	// DB 사용자 계정 정보
	public static final String USER = "scott";
	public static final String PASSWORD = "tiger";
	// DB table 이름
	public static final String TBL_NAME = "board";
	public static final String COL_LABEL_ID = "id";
	public static final String COL_LABEL_USERID = "userid";
	public static final String COL_LABEL_TITLE = "title";
	public static final String COL_LABEL_CONTENT = "content";

	// PreparedStatement에서 사용될 SQL 문장

	public static final String SQL_SELECT_ALL = "SELECT * FROM " + TBL_NAME;
	public static final String SQL_INSERT = "INSERT INTO " + TBL_NAME
			+ " VALUES(?,?,?,?)";
	public static final String SQL_UPDATE = "UPDATE " + TBL_NAME + " SET "
			+ COL_LABEL_TITLE + " = ?"+ ","+COL_LABEL_CONTENT+" = ? "+ " WHERE " + COL_LABEL_ID + " = ?";
	public static final String SQL_DELETE = "DELETE FROM " + TBL_NAME
			+ " WHERE " + COL_LABEL_ID + " = ?";
	public static final String SQL_CONUT ="SELECT COUNT(*) FROM "+TBL_NAME;
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsult = null;
		try {

			// 드라이버 연동
			Class.forName(DRIVER);
			System.out.println("DRIVER 로딩 성공" + "\n");
			// db 연동

			conn = DriverManager.getConnection(URL,USER,PASSWORD);
			
			System.out.println("DB 연동 성공" + "\n");
			// SQL 작성
			
			// SQL_INSERT
			System.out.println();
			pstmt = conn.prepareStatement(SQL_INSERT);
			pstmt.setInt(1, 1);
			pstmt.setString(2,"wwww231");
			pstmt.setString(3,"첫번쨰 이야기");
			pstmt.setString(4,"시작이다");
			int irslt= pstmt.executeUpdate();
			System.out.println("INSERT 성공"+irslt);
			// SQL_UPDATE
			System.out.println();
			pstmt = conn.prepareStatement(SQL_UPDATE);
			pstmt.setString(1,"wwww231");
			pstmt.setString(2,"두번쨰 이야기");
			pstmt.setInt(3, 1);
			int urslt= pstmt.executeUpdate();
			
			
			// SQL_DELETE
			System.out.println();
			pstmt =conn.prepareStatement(SQL_DELETE);
			pstmt.setInt(1, 0);
			int drslt= pstmt.executeUpdate();
			System.out.println(drslt+"개 행(ROW) DELETE 성공");
			// SQL 전송/실행
			pstmt = conn.prepareStatement(SQL_SELECT_ALL);
			rsult=pstmt.executeQuery();
			System.out.println(" SQL 질의 성공"+"\n");
			int rowcount=0;
			while (rsult.next()) {
				rowcount=0;									
				String ID = rsult.getString(COL_LABEL_ID);
				String USERID= rsult.getString(COL_LABEL_USERID);										
				String TITLE = rsult.getString(COL_LABEL_TITLE);
				String CONTENT = rsult.getString(COL_LABEL_CONTENT);
				System.out.println("id:"+ID+"  | \t"+"pw"+TITLE+"  |  \t"+"email"+CONTENT);
				rowcount= rowcount +rsult.getRow();
				
			}
			
				System.out.println("등록된 글의 숫자(row 갯수) : "+rowcount); // next() 탐색 기능  구현하여 ROW 갯수 구하기 ~~~
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	} // end main
} // end class Db04Main
