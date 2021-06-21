package com.hk.app;

import java.util.Scanner;

public class Exam0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키보드로 정수를 입력받는다
		// 그 정수가 짝수인가 홀수인지 를 판별해서 출력하시오
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오:");
		int input = sc.nextInt();
		
		String result = (input%2==0) ? "짝수" : "홀수"; // =대입 ==비교
		System.out.println(input+"은 "+ result);
		// 16숫자를  2로 나눠서 나머지 0이면 짝수 아니면 홀수
		

	}

}
