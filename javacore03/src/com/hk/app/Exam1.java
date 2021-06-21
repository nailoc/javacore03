package com.hk.app;

public class Exam1 {

	public static void main(String[] args) {
		
		int apples = 123;
		int baskets = 0;
		int cnt = 10;   // 바구니당 담을 수 있는 사과수
		
		baskets = apples / cnt;
		//추가코드
		baskets = (apples%cnt==0) ? baskets : ++baskets;
		
		System.out.println("바구니의 갯수는:"+baskets);

	}

}
