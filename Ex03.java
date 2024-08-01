package com.ict.day04;

public class Ex03 {
	public static void main(String[] args) {
		// 다중 if문
		//  형식) if(조건식1){
		//          조건식1일 참일때 실행;
		//          조건식1일 참일때 실행;
		//     }else if(조건식2){
		//         조건식1에는 거짓, 조건식2에는 참일때 실행 ;
		//         조건식1에는 거짓, 조건식2에는 참일때 실행 ;
        //     }else if(조건식3){
		//         조건식1,2에는 거짓, 조건식3에는 참일때 실행 ;
		//         조건식1,2에는 거짓, 조건식3에는 참일때 실행 ;
		//     }else{
		//         조건식 1,2,3이 모두 거짓인 경우 실행;
	    //     }
		
		// int k1의 점수가 90이상 A학점, 80이상이면 B학점, 70이상이면 C학점, 나머지 F학점
		int k2 = 87 ;
		String res = "";
		if (k2 >= 90) {
			res = "A학점";
		}else if (k2 >= 80) {
			res = "B학점";
		}else if (k2 >= 70) {
			res = "C학점";
		}else {
			res = "F학점";
		}
		System.out.println("결과 : " + res);
		
		// char k3가 A 이거나(OR) a이면 아프리카 B 이거나 b이면 브라질 C 이거나 c이면 캐나다 나머지 한국
		char k3 = 'a';
		res = "";
		/*
		if (k3 == 'A') {
			res = "아프리카";
		}else if(k3 == 'a') {
			res = "아프리카";
		}
		*/
		if (k3 == 'A' || k3 == 'a') {
			res = "아프리카";
		}else if (k3 == 'B' || k3 == 'b') {
			res = "브라질";
		}else if (k3 == 'C' || k3 == 'c') {
			res = "캐나다";
		}else {
			res = "한국";
		}
		System.out.println("결과 : " + res);
		
		// menu가 1이면 카페모카 3500, 2이면 카페라떼 4000, 3이면 아메리카노 3000, 4이면 과일쥬스 3500이다.
	    // 친구와 2잔을 10000내고 먹었다. 잔돈은 얼마인가? (단, 부가세 10% 포함, 친구와 같은 음료만 선택 가능)
		int menu = 2 ;
		int input  = 10000;
		int su = 2 ;
		int dan = 0 ;
		int total = 0 ;
		int vat = 0 ;
		int pay = 0 ;
		String drink = "";
		if (menu == 1) {
			drink = "카페모카";
			dan = 3500;
		}else if (menu == 2) {
			drink = "카페라떼";
			dan = 4000;
		}else if (menu == 3) {
			drink = "아메리카노";
			dan = 3000;
		}else if (menu == 4) {
			drink = "과일쥬스";
			dan = 3500;
		}
		total = dan * su ;
		vat = (int)(total * 0.1);
		pay = input - (total+vat);
		
		System.out.println("지불금액 : " + input);
		System.out.println("선택금액 : " + drink);
		System.out.println("단가 : " + dan);
		System.out.println("수량 : " + su);
		System.out.println("총금액: " + (total + vat));
		System.out.println("잔돈 : " + pay);
		
		// 나이가 8살미만이면 1000원, 초등학생(14미만)이면 2000원, 중.고등학생(20살미만)은 2500
		// 그 이상은  3000원 인 입장료이다.
		// 출력 : 당신의 입장료는 XXXX 입니다. 
		
		int age = 16 ;
		int charge = 0 ;
		if(age<8) {
			charge = 1000;
		}else if(age < 14) {
			charge = 2000;
		}else if(age<20) {
			charge = 2500;
		}else {
			charge = 3000;
		}
		System.out.println("당신의 입장료는 " + charge + "입니다.");
	}
}











