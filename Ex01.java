package com.ict.day05;

public class Ex01 {
	public static void main(String[] args) {
		// while 문 :  for 문과 같은 반복문
		// 형식1)
		//     초기식;
		//     while(조건식){
		//         조건식이 참이면 실행할 문장;
		//         조건식이 참이면 실행할 문장;
		//         조건식이 참이면 실행할 문장;
		//         증감식;
	    //     }
		// while 문의 끝을 만나면 조건식으로 간다.
		
		int k = 0 ;
		while (k < 10) {
			System.out.print(k +"\t");
			k++;
		}
		System.out.println();
		
		// 구구단에서 7단 출력
		k=1;
		while (k<10) {
			System.out.println("7 * " + k + " = " + (7*k));
			k++;
		}
		// 1-10까지 홀수의 누적합, 짝수의 누적합을 구하자 
		k=1;
		int odd = 0 ;
		int even = 0 ;
		while (k<11) {
			if(k%2 == 0) {
				even = even + k ;
			}else {
				odd = odd + k ;
			}
			k++;
		}
		System.out.println("짝수 : " + even);
		System.out.println("홀수 : " + odd);
		
		
		
	}
}








