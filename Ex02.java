package com.ict.day04;

public class Ex02 {
	public static void main(String[] args) {
		// if ~ else 문
		// 조건식이 참일때와 거짓일때 각각 나눠서 처리한다.
		// if(조건식){
		//   조건식이 참일때 실행할 문장;
		//   조건식이 참일때 실행할 문장;
        // }else{
		//   조건식이 거짓일때 실행할 문장;
		//   조건식이 거짓일때 실행할 문장;
        // }
		
		// int k1이 홀수인지 짝수인지 판별하자
		int k1 = 7 ;
		String res = "";
		if (k1%2 == 0) {
			res = "짝수";
		} else {
			res = "홀수";
		}
		
		// int k2가 1이면 가격을 10% 할인한다.
		// 얼마 주고 사냐?
		int k2 = 1 ;
		int price = 1500;
		int result = 0 ;
		if (k2 == 1 ) {
			result =  price - (int)(price*0.1);
		} else {
			result = price ;
		}
		System.out.println("결과 : " + result);
		
		// 근무시간이 8시간 까지는 시간당 9860 이다.
		// 8시간 초과하면 초과한 시간만큼 1.5배 지급한다.
		// 현재 내가 근무한 시간이 10시간이면 얼마를 받아야 한다.
		int time = 10 ;
		int dan = 9860;
		int pay = 0 ;
		int limit = 8 ;
		if (time > limit) {
			pay = (limit * dan)  + (int)((time-limit)*dan*1.5) ;
		} else {
			pay = time * dan;
		}
		System.out.println("결과 : " + pay);		
	}
}






