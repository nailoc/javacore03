package com.hk.app;

public class Singleop2 {

	public static void main(String[] args) {
		// 증감연산자
		// ++ 의미는 변수값을 1증가
		int i=5;
		i++;
		System.out.println("증가연산자 된 i="+i);
		// 같은 의미의 코드
		int j=5;
		j=j+1;
		System.out.println("자기 자신에 1을 더한 값="+j);
		
		// char 증감연산자
		char x = 'a';
		
		System.out.println("x의 문자출력: " + x);
		System.out.println("x의 아스키값출력: " + (int)x);
		x = (char)(x+1); // x=++x; // 비추천
		System.out.println("x의 아스키값출력: " + (int)x);
	}

}
