package com.ict.day05;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// 무한 루한 를 돌리고 전체 횟수와 짝수인 횟수를 구해서 짝수인 확률을 구하자
		Scanner scan = new Scanner(System.in);
		int cnt = 0 ;         // 전체 횟수
		int even = 0 ;        // 짝수 횟수
		double per = 0.0;     // 퍼센트 
		
		esc:while (true) {
			++cnt;
			System.out.print("숫자 입력 : ");
			int su = scan.nextInt();
			String str = "";
			if(su%2 == 0) {
				str = "짝수";
				++even;
			}else {
				str = "홀수";
			}
			System.out.println(su + "는 " + str + " 입니다." );
			while (true) {
				System.out.print("1.계속한다. 2.종료한다. >> ");
				int res = scan.nextInt();
				if(res == 1) {
					continue esc;
				}else if (res == 2) {
					break esc;
				}else {
					System.out.println("1 또는 2만 입력하세요");
					continue;
				}
			}
		}
		System.out.println("전체 횟수 : " + cnt);
		System.out.println("짝수 횟수 : " + even);
		per = (even/(double)(cnt)) * 100 ; // 66.66666666
		per = (int)(per * 10) / 10.0 ;   
		System.out.println("짝수 나온 퍼센트 : " + per + "%");
		
		System.out.println("수고하셨습니다.");

	}

}
