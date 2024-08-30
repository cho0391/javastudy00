package com.ict.day10;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Ex09 test = new Ex09();
		
		System.out.print("이름 : ");
		String name = scan.next();
		
		
		System.out.print("국어 : ");
		int kor = scan.nextInt();
		
		System.out.print("영어 : ");
		int eng = scan.nextInt();
		
		System.out.print("수학 : ");
		int math = scan.nextInt();
		
		test.play01(name);
		test.play02(kor, eng, math);
		test.play03();
		test.play04();
		test.play05();
		System.out.println();
		
		Ex11 test2 = new Ex11();
		test2.play01(name);
		test2.play02(kor, eng, math);
		test2.play03();
		test2.play04();
		test2.play05();
	}
}
