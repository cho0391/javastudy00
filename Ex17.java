package com.ict.day10;

public class Ex17 {
	private String name;
	private int kor ;
	private int eng ;
	private int math ; 
	private int sum ;
	private double avg ;
	private String hak ;	
	private int rank ;

	public void play01(String k1, int k2, int k3, int k4) {
		name = k1;
		kor = k2;
		eng = k3;
		math = k4;
		// 1.여기서 총점, 평균, 학점 구할수 있다. (대부분 재활용 가능성이 있다면 따로 뺌)
		// 2. 메서드가 메서드를 호출할 수 있음 
		//    (main()에서 play01(), play02(), play03(), play04() 호출해도 된다.)
		play02();
		play03();
		play04();
		play05();
	}
	// 총점
	public void play02() {
		sum = kor + eng + math;
	}
	// 평균
	public void play03() {
		avg = (int)(sum/3.0*10) / 10.0;
	}
	// 학점
	public void play04() {
		if (avg>=90) {
			hak = "A학점";
		} else if (avg>=80) {
			hak = "B학점";
		} else if (avg>=70) {
			hak = "C학점";
		} else{
			hak = "F학점";
		}
	}
	
	// rank의 초기값을 1로 만드는 메서드
	public void play05() {
		rank = 1;
	}
	
	// 변수가 private 이므로 변수를 내보내는 메서드가 필요(get)
	//	이름
	public String getName() {
		return name;
	}
	// 	총점
	public int getSum() {
		return sum;
	}
	//	평균
	public double getAvg() {
		return avg;
	}
	//	학점
	public String getHak() {
		return hak;
	}
	//	순위
	public int getRank() {
		return rank;
	}
	
	// rank는 변수가 가지고 있는 데이터를 변경하는 메서드가 필요(set)	
	public void setRank(int k1) {
		rank = k1;
	}
	
	
	
	
}
