package com.ict.day05;

public class Ex13 {

	public static void main(String[] args) {
		// 배열의 선언, 생성, 데이터 저장 한번에 
		char[] ch = {'j', 'a', 'v','a'};
		int[] su = {10,20,30,40,50};
		double[] num = {12.57, 12, 15.12};
		
		String[] str = {"둘리","희동이","마이콜"};
		
		// su 출력
		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
		}
		System.out.println();
		
	    // str 출력
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

}
