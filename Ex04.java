package com.ict.day05;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("학년 : ");
			int cnt = scan.nextInt();
			// 입력버퍼에 남아있는 엔터문자를 삭제(꺼낸다.)하기 위해서 
			scan.nextLine();
			
			System.out.print("이름 : ");
			String name = scan.nextLine();
			
			System.out.print("국어 : ");
			int kor = scan.nextInt();
			
			System.out.print("영어 : ");
			int eng = scan.nextInt();
			
			System.out.print("수학 : ");
			int math = scan.nextInt();

			int sum = kor + eng + math ;
			double avg = (int)(sum/3.0 * 10) / 10.0 ;
			String hak = "";
			if(avg>=90) { 
				hak ="A학점";
			}else if (avg>=80) {
				hak ="B학점";
			}else if (avg>=70) {
				hak ="C학점";
			}else {
				hak = "F학점";
			}
			System.out.println("이름 : " + name);
			System.out.println("총점 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("학점 : " + hak);
			
			System.out.print("계속할까요?(1.Yes, 2.No)");
			int res = scan.nextInt();
			
			if(res==2) {
				break;
			}
		}
	}
}






















