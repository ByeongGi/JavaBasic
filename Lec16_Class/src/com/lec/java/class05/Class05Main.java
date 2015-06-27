package com.lec.java.class05;

public class Class05Main {

	public static void main(String[] args) {
		System.out.println("클래스 정의 연습");
		
		System.out.println();
		Point p1 = new Point();
		Point p2 = new Point(1.0, 2.0);
		System.out.println("p1: x=" + p1.xPos + ", y=" + p1.yPos);
		System.out.println("p2: x=" + p2.xPos + ", y=" + p2.yPos);
		
		System.out.println();
		Point p3 = new Point();
		System.out.println("p3: x=" + p3.xPos + ", y=" + p3.yPos);
		p3.setXPos(3.0);
		p3.setYPos(3.0);
		System.out.println("p3: x=" + p3.xPos + ", y=" + p3.yPos);
		
		System.out.println();
		double dist = p1.distance(p2);
		System.out.println("p1~p2사이의 거리: " + dist);
		dist = p2.distance(p1);
		System.out.println("p2~p1사이의 거리: " + dist);
		
		System.out.println();
		p3.add(p2);
		System.out.println("p2: x=" + p2.xPos + ", y=" + p2.yPos);
		System.out.println("p3: x=" + p3.xPos + ", y=" + p3.yPos);
		

	} // end main()

} // end class Class05Main











