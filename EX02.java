package com.ict.day05;

public class Ex02 {
	public static void main(String[] args) {
		// while 문
		// 형식2) 조건식 => true (무한루프)
		//      초기식;
		//      while(true){
		//         [if(빠져나갈조건식) break;]
		//         실행할 문장;
		//         [if(빠져나갈조건식) break;]
		//        증감식++;    
        //      } 
		
		// 1-10 까지 출력
		int i = 1 ;
		while (true) {
			if (i >= 11) {
				break;
			}
			System.out.println(i);
			i++;
			
		}
		System.out.println();
		
		i = 1 ;
		while (true) {
			System.out.println(i);
			if (i >= 10) {
				break;
			}
			i++;
		}
		
		// 5단 출력
		i = 1 ;
		while (true) {
			if(i >=10 ) {
				break;
			}
			System.out.println(" 5 * " + i + " = " + (5*i));
			i++;
		}
		
	}
}
