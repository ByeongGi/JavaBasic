package com.lec.java.game369;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		int n;
		System.out.println("입력:");
		n = sc1.nextInt();
		System.out.println("n = " + n);
		
		System.out.println("입력:");
		n = sc2.nextInt();
		System.out.println("n = " + n);
		
		sc2.close();
		
		System.out.println("또 입력될까요?");
		n = sc1.nextInt();

	}

}
