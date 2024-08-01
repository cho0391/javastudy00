package com.ict.day04;

public class Ex05 {
	public static void main(String[] args) {
		// switch 문 : 다중 if 문과 같은 분기문이다.
		//            if문은 조건식 즉 논리형, 논리연산자, 비교연산자, 범위 일때 사용
		//            switch문은 int, char, String 일때 사용 (long, 실수형은 사용 못함)
		// 형식) switch(인자값 = int, char, String){
		//        case 조건값1: 인자값과 조건값1이 같은 경우에 수행할 문장 ; 
		//                    인자값과 조건값1이 같은 경우에 수행할 문장 ; break;
		//        case 조건값2: 인자값과 조건값2이 같은 경우에 수행할 문장 ; 
		//                    인자값과 조건값2이 같은 경우에 수행할 문장 ; break;
		//               * * * * 
		//        default :  위에 있는 조건값이 모두 아닐 때 (나머지)  실행할 문장;
		//                   위에 있는 조건값이 모두 아닐 때 (나머지)  실행할 문장;
		//     } 
		// 주의 사항 : break 가 없으면 다음 break 를 만날때까지 아래 실행문을 실행한다.
		//           break 문의 역할은 현재 switch 문이나 반복문을 탈출 할때 사용
		//           default 는 생략 가능
		
		// int k1이 1이면 카페모카, 2이면 카페라떼, 3이면 아메리카노, 4이면 과일쥬스
		int k1 = 3;
		String res = "";
		switch (k1) {
		  case 1:  System.out.println("카페모카");
		  case 2:  System.out.println("카페라떼");
		  case 3:  System.out.println("아메리카노"); 
		  case 4:  System.out.println("과일쥬스"); 
		}
		System.out.println();
		
		switch (k1) {
		  case 1:  System.out.println("카페모카"); break;
		  case 2:  System.out.println("카페라떼"); break;
		  case 3:  System.out.println("아메리카노"); break;
		  case 4:  System.out.println("과일쥬스"); break;
		}
		
		// char k2가 A 이거나 a이면 아프리카 B 이거나 b이면 브라질 C 이거나 c이면 캐나다 나머지 한국
		char k2 = 'a';
		String result = "";
		switch (k2) {
		   case 'A': result = "아프리카"; break;
		   case 'a': result = "아프리카"; break;
		   case 'B': result = "브라질"; break;
		   case 'b': result = "브라질"; break;
		   case 'C': result = "캐나다"; break;
		   case 'c': result = "캐나다"; break;
		   default: result = "한국";
		}
		System.out.println("결과 : " + result);
		
		result = "";
		switch (k2) {
		case 'A': 
		case 'a': result = "아프리카"; break;
		case 'B': 
		case 'b': result = "브라질"; break;
		case 'C':
		case 'c': result = "캐나다"; break;
		default: result = "한국";
		}
		System.out.println("결과 : " + result);
	}
}










