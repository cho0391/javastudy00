package com.ict.day05;

public class Ex11 {
	public static void main(String[] args) {
		// 배열 : 같은 자료형의 데이터들을 한 곳에 모아둔 묶음
		//       중요) 같은 자료형이어야 한다.(프로모션은 가능 )
		//       생성할 때 반드시 크기를 지정해야 된다.
		//       한번 지정한 크기는 변경할 수 없다.
		//       단, 배열복사를 하면서 크기변경을 할 수 있다.
		//       배열안에 데이터를 가져오기 위해서 보통은 for 문을 사용한다.
		
		// 배열 만드는 순서 : 선언 -> 배열 생성(new 예약어) -> 데이터 저장
		// 1. 선언 : 자료형[] 이름,  자료형 이름[]
		int[] su ;
		double num[] ;
		
		// 2. 생성 : 이름 = new 자료형[배열크기=방개수]
		//         배열크기는 방드시 지정해야 한다.
		//         new 예약어는 heap 메모리에 객체를 생성할 공간을 만든다
		//         => 인스턴스, 객체 생성
		//        객체 생성할 때 만들어진 주소를 이름에 저장 시킨다. (참조)
		
		su = new int[4];
		num = new double[5];
		
		// 객체 생성할 때 만들어진 주소(배열이 할당된 메모리 주소)
		System.out.println(su);
		System.out.println(num);
		
	   // 3. 데이터 저장 (프로모션이 됨)
		su[0] = 14 ;
		su[0] = 'c' ;
		su[1] = 100;
		su[2] = 200;
		su[3] = 300;
		// su[4] = 500;
		
		// 출력
		System.out.println(su[0]);
		System.out.println(su[1]);
		System.out.println(su[2]);
		System.out.println(su[3]);
		System.out.println();
		
		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
		}
		
	}
}












