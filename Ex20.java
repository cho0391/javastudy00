package com.ict.day10;

public class Ex20 {

	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
	private String hak;
	private int rank;
	
	// get (값 가져올때 쓸놈들)
	public String getName () {
		return name;
	}
	
	public int getSum (int k1, int k2, int k3) {
		return sum = k1 + k2 + k3;
	}
	
	public int getSumm () {
		return sum;
	}
	
	
	public double getAvg (int sum) {
		return avg = (int)(sum / 3.0 * 10) / 10.0;
	}
	
	public String getHak(double avg) {
		String hak = "";
		if (avg>=90) {
			hak = "A학점";
		}else if (avg>=80) {
			hak = "B학점";
		}else if (avg>=70) {
			hak = "C학점";
		}else {
			hak = "F학점";
		}
		return hak;
	}
	
	public int getRank() {
		return rank = 1;
	}

	// set (값 변경할때 쓸놈들)
	public void setName(String k1) {
		name = k1;
	}
	
	public void setSum(int k1) {
		sum = k1;
	}
	
	public void setAvg(double k1) {
		avg = k1;
	}
	
	public void setHak(String k1) {
		hak = k1;
	}
	
	public void setRank(int k1) {
		rank = 1;
	}
	
	public void getOut() {
		System.out.println("이름 : " + name);
		System.out.println("총정 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + hak);
		System.out.println("등수 : " + rank);
		
	}
	
	
	
	
	
}
