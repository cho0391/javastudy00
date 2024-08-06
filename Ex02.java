package com.ict.day06;

public class Ex02 {
	public static void main(String[] args) {
		// 순위 구하기 
		// 1. 모든 사람의 순위를 1등으로 초기화 한다.
		// 2. 모든 사람과 비교한다.
		// 3. 나(i) 보다 비교대상(j)이 크면 내(i) 순위를 증가 시킨다.
		String[] names = {"홍길동", "이길동","고길동", "박길동", "강길동", "김길동"};
		int[] sum = {270, 268, 270, 240, 277, 264};
		int[] rank = {1,1,1,1,1,1};
		
		
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if(sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}
		
		for (int i = 0; i < rank.length; i++) {
			System.out.println(names[i] + ", " + sum[i] + ", " + rank[i] );
		}

	}
}
