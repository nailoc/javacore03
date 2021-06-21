package com.hk.app;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구매수량은:");
		int cnt = sc.nextInt();
		
		double total = (cnt>=10) ? 100000*cnt*(1-0.1) : 100000*cnt;
		System.out.println("총가격은:"+ total);

	}

}
