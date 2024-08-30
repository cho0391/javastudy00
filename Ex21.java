package com.ict.day10;

import java.util.Scanner;

public class Ex21 {
	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	
   	 
   	 System.out.println("몇명이니? : ");
   	 
   	 int cnt = scan.nextInt();

   	 Ex20[] k = new Ex20[cnt];
   	 
   	 
   	 for (int i = 0; i < k.length; i++) {
   	 
   	    k[i] = new Ex20();
   		 
		System.out.print("이름 : ");
		String name = scan.next();
		
		k[i].setName(name);
		
		System.out.print("국어 : ");
		int kor = scan.nextInt();
		
		System.out.print("영어 : ");
		int eng = scan.nextInt();
		
		System.out.print("수학 : ");
		int math = scan.nextInt();
		
		int sum = k[i].getSum(kor, eng, math);
		double avg = k[i].getAvg(sum);
   	 	String hak = k[i].getHak(avg);
   	 	int rank = k[i].getRank();
   	 
   	 	k[i].setSum(sum);
   	 	k[i].setAvg(avg);
   	 	k[i].setHak(hak);
   	 	k[i].setRank(rank);
   	 	
   	 }
   	 // 순위
   	 for (int i = 0; i < k.length; i++) {
		for (int j = 0; j < k.length; j++) {
			if (k[i].getSumm() < k[j].getSumm()) {
				
			}
		}
	}
   	 
   	 
   	 

	}
}
