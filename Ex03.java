package com.ict.day07;

public class Ex03 {
	public static void main(String[] args) {
		// 다차원 배열 : 1차원 배열이 여러개 모인 것 (1배열의 묶음)
		//   배열 종류 : 기본자료형 배열 , 객체형배열(참조자료형 = 클래스)
		//             고정길이 배열, 가변길이 배열
		// 고정길이 배열
		// 1. 선언 : 자료형[][] 이름 ;   또는  자료형 이름[][];
		int[][] su ;
		
		// 2. 생성 : 이름 = new 자료형[1차원배열의 수][1차원배열이 가지고 있는 각각의 배열의 수]
		su = new int[3][4];
		su[0][0] = 10 ;
		su[0][1] = 20 ;
		su[0][2] = 30 ;
		su[0][3] = 40 ;
		
		su[1][0] = 10 ;
		su[1][1] = 20 ;
		su[1][2] = 30 ;
		su[1][3] = 40 ;
		
		su[2][0] = 10 ;
		su[2][1] = 20 ;
		su[2][2] = 30 ;
		su[2][3] = 40 ;
		
		// 주소확인
		System.out.println(su);
		System.out.println(su[0]);
		System.out.println(su[1]);
		System.out.println(su[2]);
		
		// 실제 값
		System.out.println(su[0][2]);
	}
}






