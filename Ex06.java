package com.ict.day04;

public class Ex06 {
		public static void main(String[] args) {
		// for문 : 정해진 규칙에 따라 실행문을 반복 처리한다.
		//         조건식일 참일때 실행, 거짓이면 실행 안함
		// 형식) for (초기식 ; 조건식 ; 증감식){
		//            조건식이 참일 때 실행할 문장;
		//            조건식이 참일 때 실행할 문장;
		//            조건식이 참일 때 실행할 문장;
		//      }
		
		// 정해진 규칙
		// 1. for 문 만나면 초기식 간다.
		// 2. 초기식에서 조건식 간다.
		// 3. 조건식이 참이면 실행, 거짓이면 실행 안함
		// 4. for 문의 끝을 만나면 증감식 간다.
		// 5. 증감식에서 조건식 간다.
		
		// 자바에서는 블록안에 선언한 변수는 블럭을 벗어나면 사라진다. => 지역변수
		// for 문도 초기식에서 변수를 선언하고 초기값을 주면
		// for 문을 벗어나면 해당 변수는 사라진다.
		
		for (int i = 0; i < 10; i++) {
			System.out.print( i +"   ");
			System.out.println("hi");
		}
		
		int k ;
		for ( k = 0; k < 10; k++) {
			System.out.println(k);
		}
		System.out.println("k : " + k);
		
		for (int i = 1; i < 10; i=i+2) {
			System.out.print( i +"   ");
			System.out.println("hi");
		}
		System.out.println();
		
		// 10-20까지 출력하기
		for (int i = 10; i < 21; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		// 10-20까지 짝수 출력 ( 2씩 증가하지 말것)
		System.out.println("10-20까지 짝수");
		for (int i = 10; i < 21; i++) {
			if (i%2 == 0) {
				System.out.println(i);
			}
		}
		
		// 10-20까지 홀수 출력 ( 2씩 증가하지 말것)
		System.out.println("10-20까지 홀수");
		for (int i = 10; i < 21; i++) {
			if (i%2 == 1) {
				System.out.println(i);
			}
		}
		// 1- 50까지 7의 배수만 출력
		System.out.println("1-50까지 7의 배수");
		for (int i = 1; i < 51; i++) {
			if (i%7 == 0) {
				System.out.println(i);
			}
		}
		// 1-10까지 누적합 구하기 (1+2+3+4+5+6+7+8+9+10)
		System.out.println("1-10까지 누적합");
		int sum = 0 ; // 과거의 정보를 기억하는 변수
		for (int i = 1; i < 11; i++) {
			sum = sum + i ;
		}
		System.out.println("누적합 : " + sum);
		
		// 1-10까지 홀수의 누적합, 짝수의 누적합 구하기
		int odd = 0 ;  // 홀수의 합
		int even = 0 ; // 짝수의 합
		for (int i = 1; i < 11; i++) {
			if (i%2 == 0) {
				even = even + i ;
			}else {
				odd = odd + i;
			}
		}	
		System.out.println("짝수의 합 : " + even);
		System.out.println("홀수의 합 : " + odd);
		
		// 0 0 0 0 
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		
		// 0 0 0 0 => 4번 
		for (int i = 0; i < 4; i++) {
			System.out.println("0 0 0 0");
		}
		System.out.println();
		
		// 0 => 16번
		for (int i = 1; i < 17; i++) {
			System.out.print("0 ");
			if(i%4 == 0) {
				System.out.println();
			}
			
		}
		
		// 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오
		// 
		System.out.println("수고하셨습니다.");
	}

}










