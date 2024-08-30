package com.ict.day10;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생 수 : ");
		int cnt = scan.nextInt();
		
		// Ex17로 만들어진 클래스들의 모임 : 객체형 배열, 참조자료형 배열 => 클래슬를 배열
		// int[] arr = new int[cnt]
		
		Ex17[] arr = new Ex17[cnt];
		
		for (int i = 0; i < arr.length; i++) {
			
			Ex17 p = new Ex17();
			
			System.out.print("이름 : ");
			String name = scan.next();
			
			System.out.print("국어 : ");
			int kor = scan.nextInt();
			
			System.out.print("영어 : ");
			int eng = scan.nextInt();
			
			System.out.print("수학 : ");
			int math = scan.nextInt();
			
			p.play01(name, kor, eng, math);
			
			arr[i] = p;
		}
		// 순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].getSum() < arr[j].getSum()) {
					int k1 = arr[i].getRank();
					k1 = k1 + 1;
					arr[i].setRank(k1);
				}
			}
		}
		// 정렬
		// *임시저장
		Ex17 tmp = new Ex17();
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1 ; j < arr.length; j++) {
				if (arr[i].getRank() > arr[j].getRank()) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}	
		}
	    // 출력
		System.out.println("이름\t총점\t평균\t학점\t순위");
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getName() + "\t");
			System.out.print(arr[i].getSum() + "\t");
			System.out.print(arr[i].getAvg() + "\t");
			System.out.print(arr[i].getHak() + "\t");
			System.out.println(arr[i].getRank());
		}
		
		
		
		
		
		
		
		
	}
}
