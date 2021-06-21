package com.hk.app;

public class Dualop3 {

	public static void main(String[] args) {
		// 시작값 = 12.5634 67 을 소수점 5번째에서 반올림하여 결과를 출력하시오
		float x = 12.563467f;
		float x1 = x * 10000;
		float x2 = Math.round(x1); // 소수점 1번째에서 반올림 함수
		float x_fine = x2 / 10000f;
		System.out.println("x1="+x1);
		System.out.println("x2="+x2);
		System.out.println("x_fine="+x_fine);
	}

}
