package com.lec.java.alogrithms;

public class Power {

	public static void main(String[] args) {
		long s1=System.currentTimeMillis(); // 현재 시간 
		System.out.println("power1 시작시간: "+s1);
		power1(2.0, 500000000);
		long e1=System.currentTimeMillis();
		System.out.println("power1걸린시간 :"+(e1-s1));
		
		long s2=System.currentTimeMillis(); // 현재 시간 
		System.out.println("power2 시작시간: "+s2);
		power2(2.0, 500000000);
		long e2=System.currentTimeMillis();
		System.out.println("power2걸린시간 :"+(e2-s2));
		
//		power1 시작시간: 1431535867862
//		power1걸린시간 :760
//		power2 시작시간: 1431535868622
//		power2걸린시간 :0
		
		// 순환은 일종의 분할 정복 알고리즘을 통해서 더 빠른 속도로 연산을 한다 .
		
	} // end main
	
	static double power1(double x,int n){ // 반복 
		
		int i;
		double r = 1.0;
		for (i = 0; i < n; i++) {
			r=r*x;	
		}
		return r;
		
		
	} // end power1()

	
	static double power2(double x, int n){
		double result; 
		if(n==0) { // n 이 0 이면 x= 1 
			result=1;
		} else if ((n%2)==0){ // n이 2로 나눈 나머지가 0 이면 x^n
			result=power2(x*x,n/2);
		} else{
			result=x*power2(x*x,(n-1)/2);// 그 외는 x*x^n-1
		}
		
			return result;
	} // and power2()
	
	
} // end class main
