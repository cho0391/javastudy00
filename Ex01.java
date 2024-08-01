package com.ict.day04;

public class Ex01 {
	public static void main(String[] args) {
		// 단순 if 문 :조건식이 참일때만 실행, 거짓인 경우 무시
		//   형식)  if(조건식){
		//           조건식이 참일때 실행할 문장;
		//           조건식이 참일때 실행할 문장;
        //         }
		//   주의사항 : 실행할 문장이 한 줄이면 블록{}를 생략할 수 있다.
		
		// int k1이 60이면 합격
		int k1 = 50 ;
		String res = "초기값";
		if (k1>=60) {
			res = "합격";
		}
		System.out.println("결과 : " + res);
		
		// int k2이 60이면 합격, 아니면 불합격
		int k2 = 50;
		String res2 = "초기값";
		if (k2>=60) {
			res2 = "합격";
		}
		if (k2<60) {
			res2 = "불합격";
		}
		System.out.println("결과 : " + res2);
		
		// int k3가 60이상 이면 합격 아니면 불합격
		int k3 = 70 ;
		String res3 = "불합격";
		if (k3>=60) {
			res3 ="합격";
		}
		System.out.println("결과 : " + res3);
		
	}
}








