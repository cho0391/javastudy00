package com.ict.day10;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Ex13 test = new Ex13();
		
		System.out.print("이름 : ");
		String name = scan.next();
		
		System.out.println("국어 : ");
		int kor = scan.nextInt();
		System.out.println("영어 : ");
		int eng = scan.nextInt();
		System.out.println("수학 : ");
		int math = scan.nextInt();
		
		int sum = test.getSum(kor, eng, math);
		double avg = test.getAvg(sum);
		String hak = test.getHak(avg);
		
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + hak);
		
		
	}
}
