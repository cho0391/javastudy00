package com.ict.day10;

public class Ex13 {
	public int getSum(int k1, int k2, int k3){
			return k1 + k2 + k3;
	}	
	
	public double getAvg(int sum) {
		return (int)(sum/3.0*10)/10.0;
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
	
	
}
