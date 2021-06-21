package com.hk.app;

public class Dualop7 {

	public static void main(String[] args) {
		// c라는 회사가 직원 채용중입니다	
		// 군필(true) 그리고 신장 170 이상인 경우 채용하려고함
		// 이철수는 채용되겠는가?
		// lee_m = true, lee_t = 180이다
		
		// 합격여부를 true 와 false 로 출력하시오
		// pass_c = ?
		boolean lee_m = true; // 이철수 병역
		int lee_t = 180;      // 이철수 키
		
		boolean pass_c = lee_m && (lee_t >= 170); // 그리고 && 참 && 참 = 참
		System.out.println("회사c 채용결과="+pass_c);
		
		System.out.println("논리값의 부정="+!lee_m);

	}

}
