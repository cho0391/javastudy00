package com.ict.day05;

import java.util.Arrays;

public class Ex14 {
	public static void main(String[] args) {
		// Arrays 클래스 : 배열을 다루기 위한 다양한 메서드(기능)가 포함되어 있는 클래스
		// 클래스가 가질 수 있는 요소 : 필드, 메서드, 생성자 
		//  필드 - 데이터  - 변수, 상수
		//  메서드() - 기능, 동작
		//  생성자 - 나중에 
		
		int[] arr = new int[100];
		
		// for문을 이용해서 데이터 저장
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 5;
		}
		
		// 출력하기 
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		
		// Arrays.binarySearch(배열, 찾는값) : 해당 배열에서 값을 검색 한 후 있는 위치값(index)을 반환
		//                                   만약에 없는 값을 찾으면 음수 
		int su = Arrays.binarySearch(arr, 47);
		System.out.println(su);
		
		
		String[] str = {"둘리","희동이","마이콜"};
		int su2 = Arrays.binarySearch(str, "희동이");
		System.out.println(su2);
		
	}
}













