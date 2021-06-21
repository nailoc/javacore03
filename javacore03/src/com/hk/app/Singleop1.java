package com.hk.app;

public class Singleop1 {

	public static void main(String[] args) {
		// 증감연산자 ++ --
		// 변수값을 1증가 1감소
		int x = 10;		int y = 5;		int z = 1;
		System.out.println("x,y,z="+x+","+y+","+z);
		x++; y++; z++;
		System.out.println("x,y,z="+x+","+y+","+z);
		x--; y--; z--;
		System.out.println("x,y,z="+x+","+y+","+z);		
		
		int a = 9;		int b = 5;		int c = 2;
		System.out.println("a,b,c="+a+","+b+","+c);
		++a; ++b; ++c;
		System.out.println("a,b,c="+a+","+b+","+c);
		--a; --b; --c;
		System.out.println("a,b,c="+a+","+b+","+c);
		
		int i=5; int j=3; int k=1;
		int result_1 = i++ + j++ + k++;  // 후치증감연산자
		System.out.println("i,j,k,result_1="+i+","+j+","+k+","+result_1);
		
		int r=5; int d=3; int h=1;
		int result_2 = ++r + ++d + ++h;  // 전치증감연산자
		System.out.println("r,dd,h,result_2="+r+","+d+","+h+","+result_2);
		
		//연습
		int o=2;
		int p=4;
		int q=6;
		int result_3 = ++o + p-- + ++q;  // result_3은 얼마? 
		System.out.println("result_3="+result_3);
		System.out.println("p="+p);
		
		

	}

}
