package com.ict.day10;

public class Ex06 {
  public static void main(String[] args) {
	  Ex05 t = new Ex05();
	  int res1 = t.cnt1;
	  int res2 = Ex05.cnt2;
	  int res3 = t.cnt2;
	  System.out.println("res1 = " + res1); // 0
	  System.out.println("res2 = " + res2); // 0
	  System.out.println("res3 = " + res3); // 0
	  System.out.println();

	  t.countUp1();
	  Ex05.countUp2();
	  t.countUp2();
	  
	  res1 = t.cnt1;
	  res2 = Ex05.cnt2;
	  System.out.println("res1 = " + res1); // 1
	  System.out.println("res2 = " + res2); // 2
	  System.out.println();
	  
	  Ex05 t2 = new Ex05();
	  int result1 = t2.cnt1;
	  int result2 = t2.cnt2;
	  System.out.println("res1 = " + result1); // 0
	  System.out.println("res2 = " + result2); // 2
	  System.out.println();
	  
	  t2.countUp1();
	  t2.countUp2();
	  
	  result1 = t2.cnt1;
	  result2 = t2.cnt2;
	  System.out.println("res1 = " + result1); // 1
	  System.out.println("res2 = " + result2); // 3
	  System.out.println();
	  
	  
  }
}
