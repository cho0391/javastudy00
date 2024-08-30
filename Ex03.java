package com.ict.day10;

public class Ex03 {

	 String year = "2학년";
	static String name = "홍길동";
	static int kor = 80;
	static int eng = 80;
	static int math = 80;
	static int sum = 0;
	
	public static void play01() {
		// static 메서드에서는 instance 변수를 사용할 수 없다.
        // System.out.println(year);
		sum = kor + eng + math;
	}
	
	
	public static int play02() {
		// static 메서드 안에는 지역변수를 사용할 수 있다. 
		int k = kor + eng + math;
		return sum;
	}
	
	/*
	public static int play03() {
		// 지역변수에는 static 을 사용할 수 없다.  
		static int k = kor + eng + math;
		return k;
	}
	*/
	
	
	
	
	
	
	
	
	
}
