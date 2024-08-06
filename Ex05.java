package com.ict.day06;

public class Ex05 {
	public static void main(String[] args) {
		// String 클래스 : 문자열을 처리하기 위한 클래스
		String str = "신수동 한국 ICT 인재 개발원 5강의실";
		
		// 멤버 메서드() : 자바에서 클래스안에 존재하며 기능을 담당
		// 메서드이름([인자=매개변수...] : 반환형
		// 반환형이란 메서드가 기능을 실행하고 자기를 호출한 곳으로 되돌아 갈때 가지고 가는 데이터의 자료형을 말한다.
		// void는 되돌아 갈때 데이터을 가지고 가지 않아 자료형이 없다는 뜻이다.
		// main메서드은 void이다. 이 말은 main메서드를 호출하는 JVM에게 되돌아 갈때 아무것도 가지고 가지 않는다는 뜻이다.
		// 인자 또는 매개 변수 는 해당 메서드가 외부에서 데이터를 받을 수 있도록 사용되는 변수(변수, 배열, 클래스(객체))
		
		// 1. charAt(int index) : char
		//    위치값(index = 0부터시작)을 받아서 해당 문자열(String)의 위치에 있는 문자(char)를 반환한다.
		char c1 = str.charAt(12);
		System.out.println(c1);
		System.out.println();
		
		
		str = "한국 I Love You 1004";
		// 2.  length(): int 
		//     해당 문자열의 길이를 구한다.
		
		// charAt()이용해서 str 문자열에 한글자씩 접근해서 소문자를 대문자로 변환 시키자 (소문자 - 32 = 대문자)
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch>='a' && ch<='z') {
				ch = (char)(ch-32) ;
			}
			System.out.print(ch);
		}
		System.out.println();
		
		str = "010-9797-7979";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(i>=4 && i <= 7) {
				System.out.print("*");
			}else {
				System.out.print(ch);
			}
		}
		System.out.println();
		
		// 3. concat(String str) : String
		// 현재 문자열과 입력된 문자열을 합치는 메서드 ("문자열" + "문자열" 와 같은 역할)
		String s1 = "대한민국";
		String s2 = s1 + " 파이팅";
		System.out.println(s2);
		
		String s3 = s1.concat(" KOREA");
		System.out.println(s3);
		
		// 4. contains(CharSequence s) : boolean
		// CharSequence는 지금 String 이라고 생각하자 
		// CharSequence 문자 시퀀스를 나타내는 인터페이스 (String, StringBufffer, StringBuilder를 자유롭게 사용할 수 있다.)
		// 해당 문자열에 입력된 String이 있으면 true, 없으면 false ;
		
		String s4 = "nojm73@naver.com";
		boolean result = s4.contains("@");
		System.out.print("결과 : " + result);
		
		// 5. equals(Object anObject) : boolean
		//    현재 문자열과 입력된 객체의 내용이 같으면 true, 아니면 false(대,소문자 구별함)
		//    객체(String)에서 == 는 내용이 같냐가 아니라 주소가 같냐 의 의미미다.
		//    그러나 기본자료형에서 == 는 데이터(값)가 같냐 라는 의미
		
		// 6. equalsIgnoreCase(String anotherString)
		//    현재 문자열과 입력된 문자열의 내용이 같으면 true, 아니면 false(대,소문자 구별 하지 않음)
		System.out.println();
		String s5 = "Korea";
		String s6 = "KOREA";
		
		System.out.println();
		if(s5.equals(s6)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다.");
		}
		
		System.out.println();
		if(s5.equalsIgnoreCase(s6)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다.");
		}
		System.out.println();
		
		// 7. getBytes[] : byte[]
		// 해당 문자열을 byte[]로 반환한다. => 입출력스트림에 사용 
		// byte 는 대소문자, 숫자, 일부 특수문자를 숫자로 표현할 수 있다.
		// 영어를 제외한 나머지 글자들은 제대로 안나옴 => toCharArray()가 해결한다.
		String s7 = "abc 뉴스 channel 24 들어와";
		byte[] b1 = s7.getBytes();
		for (int i = 0; i < b1.length; i++) {
			System.out.println(b1[i] + " : " + (char)(b1[i]));
		}
		
		
		// 8. toCharArray() : char[]
		char[] ch2 = s7.toCharArray();
		for (int i = 0; i < ch2.length; i++) {
			System.out.println( ch2[i] + ":" + (int)(ch2[i]) );
		}
	}
}










