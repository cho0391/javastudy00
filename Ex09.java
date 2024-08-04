package com.ict.day05;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 무한 루프 숫자를 입력받아서 홀수, 짝수, 판별하자 (계속할까요?(1.yes, 2.no))
		esc: while (true) {
			System.out.print("숫자 입력 : ");
			int su = scan.nextInt();
			String str = "";
			if (su % 2 == 0) {
				str = "짝수";
			} else {
				str = "홀수";
			}
			System.out.println(su + "는 " + str + "입니다.");
			
			while(true) {
				System.out.print("계속할까요?(1.yes, 2.no) >> ");
				int num = scan.nextInt();
				if (num == 1) {
					continue esc;
				}else if(num == 2) {
					break esc;
				}else {
					System.out.println("숫자는 1과 2만 선택하세요");
					continue;
				}
			}// 안 while 끝
		} // 밖 while 끝
	}
}





