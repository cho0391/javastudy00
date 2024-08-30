package com.ict.day10;

public class Ex05 {
	int cnt1 = 0;
	static int cnt2 = 0;

	public void countUp1() {
		cnt1 = cnt1 + 1;
		// 인스턴스 메서드는 static 변수 사용 가능
		// cnt2 = cnt2 + 1;
	}
	
	public static void countUp2() {
		// static 메서드는 instance 변수 사용 불가능
		// cnt1 = cnt1 + 1;
		cnt2 = cnt2 + 1;
	}

}
