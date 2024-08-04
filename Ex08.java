package com.ict.day05;

public class Ex08 {
	public static void main(String[] args) {
		// break label : 레이블이 지정된 반복문 탈출
		// continue label : 레이블이 지정된 반복문의 증감식(for 문), while문은 조건식으로 이동

		// 레이블지정 : 특정 반복문 앞에 "이름" 붙이면 된다.
		// 주의) 레이블 다음에는 무조건 반복문만 올수 있다.

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("i=" + i + ", j=" + j);
			}
		}
		System.out.println();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				if(i==1) {
					break ;
				}
				System.out.println("i=" + i + ", j=" + j);
			}
		}
		
		System.out.println();

		exit: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				if(i==1) {
					break exit;
				}
				System.out.println("i=" + i + ", j=" + j);
			}
		}
	}
}
