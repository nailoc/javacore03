package com.hk.app;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		// 파운드를 입력하면 kg으로 변환해서 출력하시오
		Scanner sc = new Scanner(System.in);
		System.out.print("파운드를 입력하세요:");
		int pound = sc.nextInt();
		double kg = pound * 0.45359237;
		
		System.out.println(pound+"파운드를 kg으로 변환하면:" + kg+"kg입니다");

	}

}
