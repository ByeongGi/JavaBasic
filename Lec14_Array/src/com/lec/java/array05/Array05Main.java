package com.lec.java.array05;

public class Array05Main {

	public static void main(String[] args) {
		System.out.println("2차원 배열");
		
		// 1차원 배열
		int[] arr1 = {1, 2};
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		int[] arr2 = {3, 4};
		int[] arr3 = {5, 6};
		
		System.out.println();
		// 2차원 배열: 1차원 배열들로 이루어진 배열
		// 행(row) 3개, 열(column)이 2개인 2차원 배열
		int[][] array = {
				{1, 2},
				{3, 4},
				{5, 6}
		};
		System.out.println(array[1][0]); // 3 출력
		System.out.println(array[2][1]); // 6 출력
		
		// 2차원 배열에서 length의 의미:
		// array.length: 2차원 배열의 행(row)의 개수를 의미
		System.out.println("array.length = " + array.length);
		// array[0].length: 첫번째 행의 원소의 개수, 즉 열(column)의 개수
		System.out.println("array[0].length = " + array[0].length);
		System.out.println("array[1].length = " + array[1].length);
		
		// 2차원 배열 확인
		for (int x = 0; x < array.length; x++) {
			for (int y = 0; y < array[x].length; y++) {
				System.out.print(array[x][y] + "\t");
				
			} // end for (y): 열(column)
			System.out.println();
			
		} // end for (x): 행(row)

	} // end main()

} // end class Array05Main









