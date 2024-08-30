package com.ict.day10;

public class Ex15 {
		// private 은 외부에서 접근할 수 없다. 
	private String name = "hong" ;
	private static int sum = 297;
	
	String addr = "서울";
	static int total = 135;

	// private 변수를 위해서 메서드를 이용해 데이터 보내기
	public String getName() {
		return name;
	}
	
	public int getSum() {
		return sum;
	}
	
	// private 변수를 위해서 메서드를 이용해 데이터 변경하기
	public void setName(String k1) {
		name = k1;
	}
	public void setSum(int k1) {
		sum = k1;
	}











}