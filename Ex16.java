package com.ict.day10;

public class Ex16 {
	public static void main(String[] args) {
		// static 으로 접근하기
		int s1 = Ex15.total ;
		// static 이라도 private 이면 접근 불가
		// String s2 = Ex15.sum;
		
		Ex15 test = new Ex15();
		String str1 = test.addr;
		// String str2 = test.name;
		
		int str3 = test.total;
		// int str4 = test.sum;
		
		// private이면 직접 데이터를 가져오지도 못하고 변경하지도 못한다.
		// Ex15.name = "둘리";
		// Ex15.sum = 957;
		
		// 메서드에 접근해서 데이터 얻기
		String name = test.getName();
		System.out.println("이름 : " + name);
		
		int sum = test.getSum();
		System.out.println("합계 : " + sum);

		// 메서드에 접근해서 데이터 변경
		// 이름을 마이콜, sum을 975로 변경하고 확인하자
		
		test.setName("마이콜");
		test.setSum(975);
		
		name = test.getName();
		System.out.println("이름 : " + name);
		
		sum = test.getSum();
		System.out.println("합계 : " + sum);

	}
}
