package com.lec.java.db02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.sql.Statement;

public class Db02Main {
	
	// 1. oracle 연동을 위한 정보들(상수들을) 정의(세팅)
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
		
		
	public static void main(String[] args) {
		System.out.println("Db 2");
		Connection conn = null;
		Statement stmt =null;
		ResultSet rs=null;
		try {
			// 드리이버 로딩
			Class.forName(DRIVER);
			System.out.println("드라이버 로딩");
			
			// DB 컨넥션
			conn = DriverManager.getConnection(URL,USER,PASSWORD);
			System.out.println("DB connection 성공");
			
			// Statement 생성
			stmt= conn.createStatement();
			
			// SQL 문장 작성
			String sql_update= "UPDATE "+TBL_NAME+
					" SET "+COL_LABEL_PASSWORD+" = 'pass01',"+COL_LABEL_EMAIL+" = 'pass@test.com'"+" where id = 'qwerty' ";
			String sql_delete = "delete "+TBL_NAME+" WHERE ID = 'aaa'";
			System.out.println(sql_delete);
			String sql = "SELECT * FROM "+TBL_NAME;
			System.out.println("자료 출력 성공"+sql);
			// SQL 
			
			// INSERT , UPDATE , DELETE ->executeUpdate() 사용
			int rslt=stmt.executeUpdate(sql_update);
			System.out.println("업데이트 성공"+sql_update);
			System.out.println(rslt+"개 행(ROW) UPDATE 성공");
			stmt.executeUpdate(sql_update);
//			stmt.execute(sql_delete);
			
			rs=stmt.executeQuery(sql);
			
			while (rs.next()){
				String id=rs.getString(COL_LABEL_ID);
				String password= rs.getString(COL_LABEL_PASSWORD);
				String email = rs.getString(COL_LABEL_EMAIL);
				String rslts = id + "\t"+password+"\t"+email;
				System.out.println(rslts);
			}
			

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			
				try {
					
					if (rs!=null) {rs.close();}
					
					if (stmt!=null){stmt.close();}
					
					if (conn!=null) {conn.close();}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		
			
			
		}
		
		
		
	} // end main

} // end class Db02Main
