package com.lec.java;

import java.util.ArrayList;
import java.util.Random;

public class LottoExtract {

	public static void main(String[] args) {
		System.out.println(" 로 또 추 출 기 ");
		ArrayList<Integer> lottoNum= new ArrayList<Integer>(); // 로또 번호를 입력할 자료
		Random  random = new Random(); // 랜덤 선택 발생
		int[] extractNum = new int[6]; // 추출한 숫자를 저장
		
		// 숫자 45 개 입력
		System.out.println("Lotto 숫자 45개를 넣어줍니다.");
		for (int i = 0; i < 45; i++) {
		lottoNum.add(i, i+1);
		System.out.println((i+1)+"입력");
		}
		
		
		// 비복원 추출 구현부
		System.out.println("Lotto 번호를 6개를 추출합니다.");
		for (int i = 0; i < 6; i++) {
			int index=random.nextInt(lottoNum.size()); // 추출한 만큼 추출 범위도 자동으로 줄어들게됨.
			extractNum[i]=lottoNum.get(index).intValue(); // 추출
			lottoNum.remove(index); // 추출한 숫자를 제거한다.
			System.out.println(extractNum[i]+"선택");
		}
		
	} // end main

} // end class LoLottoExtrat
