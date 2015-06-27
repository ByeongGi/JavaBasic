package com.lec.java.db05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberControl implements DbQurey, MemberQurey {
	private static MemberControl instance = null;

	private MemberControl() {
		initialize();
		System.out.println("memberControl 인스턴스 생성 완료 ");
	};

	public static MemberControl getInstance() {
		if (instance == null) {
			instance = new MemberControl();

		}

		return instance;
	} // end getInstance

	private Connection conn;// Db 컨넥션을 위한 멤버변수

	private void initialize() {
		try {
			// oracle드라이버 클래스 로딩
			Class.forName(DRIVER);
			System.out.println("DB 드라이버 로드 성공 ");
			// DB 컨넥션
			conn = DriverManager.getConnection(URL, USER, PASSWD);
			System.out.println("DB 접속 성공");

		} catch (ClassNotFoundException e) {
			System.out.println("DB 드라이버 로드 실패 ");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB 접속 실패");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} // end initialize()

	public ArrayList<MemberModel> select() {
		ArrayList<MemberModel> list = null;

		PreparedStatement pstmt = null;
		ResultSet rsult = null;
		try {

			pstmt = conn.prepareStatement(SELECT);
			rsult = pstmt.executeQuery();
			list = createMemberlist(rsult);
			while (rsult.next()) {
				System.out.println(rsult.getString(COL_LEBEL_ID));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {

				if (rsult != null) {
					rsult.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} // end finally
		return list;
	}

	private ArrayList<MemberModel> createMemberlist(ResultSet rsult) {
		ArrayList<MemberModel> list = new ArrayList<MemberModel>();

		try {
			while (rsult.next()) {
				String id = rsult.getString(COL_LEBEL_ID);
				String pw = rsult.getString(COL_LEBEL_PW);
				String email = rsult.getString(COL_LEBEL_EMAIL);
				list.add(new MemberModel(id, pw, email));
			}
		} catch (SQLException e) {
			System.out.println("createMemberlist() 오류 발생");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;

	} // end createMemberlist()

	public int insert(String id, String pw, String email) {
		// System.out.println("INSERT 실행 성공 ");
		PreparedStatement pstmt = null;
		ResultSet rsult = null;

		int rult = 0;
		try {
			pstmt = conn.prepareStatement(SQL_INSERT);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, email);
			rult = pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("INSERT 실행 에러");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				System.out.println("pstmt.close 에러 ");
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return rult;

	} // end insert()

	public int update(String id, String pw, String email) {

		int rult = 0;
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(SQL_UPDATE);
			pstmt.setString(1, pw);
			pstmt.setString(2, email);
			pstmt.setString(3, id);
			rult = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rult;
		
	}// end insert()

	public int delete(String id) {
		int row = 0;
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(SQL_DELETE);
			pstmt.setString(1, id);
			row = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} // end finally
		return row;
	} // end delete()

} // end class
