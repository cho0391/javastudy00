package com.ict.day01;

public class Ex03 {

	public static void main(String[] args) {
		// 문자형 : char : 숫자값이 저장된다(0~65535)
        //        만약 문자 사용하려면 홀따옴표를 사용한다.
		//        반드시 한 글자만 ('a', 'A', '대', '4')

		// 선언
		char res ; 
		res = 97 ;
		System.out.println(res);
	
		res = '대';
		System.out.println(res);
 
		// 변수 = (계산식)  -> 계산식의 결과만 저장된다. 
		res = 'a'-32 ;
		System.out.println(res);
	}

}
