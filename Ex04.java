package com.ict.day04;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String drink = "";
		int menu = 0 ;
		int input = 0 ;
		int su = 0 ;
		int dan = 0 ;
		int total = 0 ;
		int vat = 0 ;
		int charge = 0 ;
		
		System.out.println(">>>>>>>>>>> 메뉴 >>>>>>>>>>>");
        System.out.println(">>>   1.카페모카(3500)    >>>");
        System.out.println(">>>   2.카페라떼(4000)    >>>");
        System.out.println(">>>   3.아메리카노(3000)   >>>");
        System.out.println(">>>   4.과일쥬스(4500)    >>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.print("메뉴를 선택하세요  >>> ");
        menu = scan.nextInt();
        /*
        if(menu == 1 || menu == 2 || menu ==3 || menu == 4) {
        }else {
        	System.out.println("잘못 선택하셨습니다.");
        }
        */
        if(menu >=1 && menu <= 4) {
        	System.out.print("주문 수량 >> ");
        	su = scan.nextInt();
        	
        	System.out.print("입금액 >> ");
        	input = scan.nextInt();
        	if (menu == 1) {
				drink = "카페모카";
				dan = 3500;
			}else if (menu == 2) {
				drink = "카페라떼";
				dan = 4000;
			}else if(menu == 3){
				drink = "아메리카노";
				dan = 3000;
			}else if (menu == 4) {
				drink = "과일쥬스";
				dan = 4500;
			}
        	total = dan * su ;
        	vat = (int)(total * 0.1);
        	charge = input - (total + vat);
        	System.out.println("지불금액 : " + input);
    		System.out.println("선택금액 : " + drink);
    		System.out.println("단가 : " + dan);
    		System.out.println("수량 : " + su);
    		System.out.println("총금액: " + (total + vat));
    		System.out.println("잔돈 : " + charge);
        	
        }else {
        	System.out.println("잘못 선택하셨습니다.");
        }

	}
}





