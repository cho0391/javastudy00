package com.ict.day05;

public class Ex06 {
	public static void main(String[] args) {
		// break 와 continue
		// break : switch 문 이나 현재 위치에 있는 반복문(보통은 for 문)을 탈출할 때 사용하는 예약어
		// continue : 탈출이 아니다. 다음 반복문을 실행하기 위해 continue 문 아래를 무시하고 다음 회차를 진행하는 예약어
		//            (for -> 증감식, while -> 조건식 으로 이동)
		//  보통 if 문과 함께 사용한다. 
		
		// for 문으로 1-10 출력
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// i 가 6 일때 break
		for (int i = 1; i < 11; i++) {
			if(i==6) {
				break;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		
		// i 가 6 일때 continue
		for (int i = 1; i < 11; i++) {
			if(i==6) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		
// 		i 가 6 일때 continue
//		for (int i = 1; i < 11; i++) {
//			System.out.print(i + " ");
//			
//			if(i==6) {
//				continue;
//			}
//		}
//		System.out.println();

		
		// 1-10까지 홀수 출력
		for (int i = 1; i < 11; i++) {
			if(i%2 == 0) {
				continue;
			}
			System.out.print(i);
		}
		System.out.println();
	}
}















