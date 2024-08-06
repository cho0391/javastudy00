package com.ict.day06;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// 학생 인원수를 받고 
		// 이름, 국어,  영어, 수학을 받아서 
		// 총점, 평균, 학점,  순위을 구하고
		// 이름 총점, 평균, 학점, 순위를 출력하자 ( 순위로 오름차순 정렬까지) 
		Scanner scan = new Scanner(System.in);
		System.out.print("학생 수 : ");
		int cnt = scan.nextInt();
		
		String[] name = new String[cnt];
		int[] kor = new int[cnt];
		int[] eng = new int[cnt];
		int[] math = new int[cnt];
		int[] sum = new int[cnt];
		double[] avg = new double[cnt];
		String[] hak = new String[cnt];
		int[] rank = new int[cnt];
		
		// 총점, 평균, 학점 구하기
		for (int i = 0; i < rank.length; i++) {
			System.out.print("이름 : ");
			name[i] = scan.next();
			
			System.out.print("국어 : ");
			kor[i] = scan.nextInt();
			
			System.out.print("영어 : ");
			eng[i] = scan.nextInt();
			
			System.out.print("수학 : ");
			math[i] = scan.nextInt();
			
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = (int)(sum[i]/3.0 *10) / 10.0;
			if(avg[i] >= 90) {
				hak[i] = "A학점";
			}else if (avg[i] >= 80) {
				hak[i] = "B학점";
			}else if (avg[i] >= 70) {
				hak[i] = "C학점";
			}else {
				hak[i] = "F학점";
			}
			
			// 순위의 초기값
			rank[i] = 1 ;
		}
		
		// 순위 
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if(sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}
		// 정렬
		int tmp1 = 0;
		double tmp2 = 0;
		String tmp3 = "";
		for (int i = 0; i < rank.length-1; i++) {
			for (int j = i+1; j < rank.length; j++) {
				if(rank[i] > rank[j]) {
					
					tmp3 = name[i];
					name[i] = name[j];
					name[j] = tmp3 ;
					
					tmp1 = kor[i];
					kor[i] = kor[j];
					kor[j] = tmp1;
					
					tmp1 = eng[i];
					eng[i] = eng[j];
					eng[j] = tmp1;
					
					tmp1 = math[i];
					math[i] = math[j];
					math[j] = tmp1;
					
					tmp1 = sum[i];
					sum[i] = sum[j];
					sum[j] = tmp1;
					
					tmp2 = avg[i];
					avg[i] = avg[j];
					avg[j] = tmp2;
					
					tmp3 = hak[i];
					hak[i] = hak[j];
					hak[j] = tmp3;
					
					tmp1 = rank[i];
					rank[i] = rank[j];
					rank[j] = tmp1;
				}
			}
		}
		
		// 출력
		System.out.println("이름\t총점\t평균\t학점\t순위");
		for (int i = 0; i < rank.length; i++) {
			System.out.print(name[i]+"\t");
			System.out.print(sum[i]+"\t");
			System.out.print(avg[i]+"\t");
			System.out.print(hak[i]+"\t");
			System.out.println(rank[i]);
		}
	}
}




















