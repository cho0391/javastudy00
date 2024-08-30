package com.ict.day10;

public class Ex12 {
    // 매개변수(파라미터) : 메서드 선언시 정의되는 변수, 
    //                메서드를 호출할때 전달될 데이터를 가리키는 입력슬롯과 같은 역할
	// 인자 : 실제로 메서드를 호출할때 전달되는 값.
	//      매개변수에 저장되는 실제적인 데이터
	
	String name ;
	int sum ;
	double avg ;
	String hak ;
	
	public void play01(String k1) {
		name = k1;
	}
	public void play02(int k1, int k2, int k3) {
		sum = k1 + k2 + k3;
		
		// 메서드는 다른 메서드를 호출 할 수 있음.
		play03();
	
	}
	
	public void play03() {
        avg = (int)(sum /3.0*10)/10.0;
        play04();
	}
	public void play04() {
        if (avg>=90) {
			hak = "A학점";
        }else if (avg>=80) {
			hak = "B학점";
    	}else if (avg>=70) {
    		hak = "C학점";
	    }else {
	    	hak = "F학점";
	    }
        play05();
	}
	public void play05() {
		System.out.print("이름 : " + name + " ");
		System.out.print("총점 : " + sum + " ");
		System.out.print("평균 : " + avg + " ");
		System.out.print("학점 : " + hak + " ");
		System.out.println();
		
	}
	
	
	
}
