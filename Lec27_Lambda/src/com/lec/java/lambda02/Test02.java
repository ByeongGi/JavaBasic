package com.lec.java.lambda02;

interface Test02 {
	public abstract void testPrint(int num);
	
} // end interface Test02


class Test02Imple implements Test02 {

	@Override
	public void testPrint(int num) {
		System.out.println("num = " + num);
		
	} // end testPrint()
	
} // end class Test02Imple



