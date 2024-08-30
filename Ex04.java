package com.ict.day10;

public class Ex04 {
	int age = 18;
	public static void main(String[] args) {
		// main()도 static 이므로 age를 사용할 수 없다.
        // System.out.println(age);
		
		// static 멤버필드, 멤버메서드는 객체 생성없이 사용 가능
		// static 멤버필드, 멤버메서드에 접근하는 방법 : 
		// 클래스이름.변수이름, 클래스이름.메서드이름 
		
		// Ex03의 이름 정보 가져오기(get)
		String name = Ex03.name;
		System.out.println("이름 : " + name);
		
		// Ex03의 이름을 임꺽정으로 설정하기(set)
		Ex03.name = "임꺽정";
		
		name = Ex03.name;
		System.out.println("이름 : " + name);
		
		
		
	}
}
