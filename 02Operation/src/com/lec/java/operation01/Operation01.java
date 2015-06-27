package com.lec.java.operation01;

public class Operation01 {
	public static void main(String[] args){
		int i = 10;
		int j = 3;
		int h = 5;
		
		// 동등 비교 ,관계 연산자 
		System.out.println("동등비교 , 관계연산자 ");
		System.out.println("i == j : "+(i==j));
		System.out.println("i != j : "+(i!=j));
		System.out.println("i > j : "+(i>j));
		System.out.println("i < j : "+(i<j));
		
		
		// 논리연산자 
		System.out.println("&&(And) : "+ (i>j && i>h));
		System.out.println("&&(And) : "+ (i<j && i<h));
		
		System.out.println("||(OR) : "+(i>j || i>h));
		System.out.println("||(OR) : "+(i<j || i<h));
		
		// 삼항 연산자 연습 
		System.out.println("삼항 연산자 ");
		int result = h != 5? 1:2; // (논리연산자) ? true:false
		System.out.println("삼항 연산자 결과 : "+result);
		
	
		
		
		
		
	}
	
}
