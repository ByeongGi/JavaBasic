package com.lec.java.db05;

public interface MemberQurey {
	// test_member  
	public static final String TBL_NAME="member";
	public static final String COL_LEBEL_ID="id";
	public static final String COL_LEBEL_PW="password";
	public static final String COL_LEBEL_EMAIL="email";
	
	// prepareStatement 
	public static final String SELECT= "SELECT * FROM "+TBL_NAME;
	public static final String SQL_INSERT= "INSERT INTO "+TBL_NAME+" Values (?,?,?) "; 
	public static final String SQL_UPDATE= "UPDATE "+TBL_NAME+" SET "+COL_LEBEL_PW+" = ? ,"+COL_LEBEL_EMAIL+" = ?"
			+" WHERE "+COL_LEBEL_ID+" = ?";
	public static final String SQL_DELETE="DELETE FROM "+TBL_NAME+" WHERE "+"ID = ?";		
} // end interface MemberQurey
