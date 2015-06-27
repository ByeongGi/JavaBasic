package com.lec.java.lambda02;

interface Test03 {
	public abstract int max(int n1, int n2);
	
} // end interface Test03


class Test03Imple implements Test03 {
	@Override
	public int max(int n1, int n2) {
		if (n1 > n2) {
			return n1;
		} else {
			return n2;
		}
		
//		return (n1 > n2) ? n1 : n2;
	} // end max()
	
} // end class Test03Imple










