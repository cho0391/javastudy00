package com.ict.day10;

public class Ex08 {
	
	public static void main(String[] args) {
			
		Ex07 minsu = new Ex07();
		Ex07 heejin = new Ex07();
		Ex07 sumi = new Ex07();
		Ex07 yoon = new Ex07();
		
		
		System.out.println("minsu - id : " + minsu.id);          // 0
		System.out.println("heejin - id : " + heejin.id);		 // 0
		System.out.println("sumi - id : " + sumi.id);			 // 0
		System.out.println("yoon - id : " + yoon.id);			 // 0	
		System.out.println("-----------------------");
		
		System.out.println("minsu - nextId : " + Ex07.nextId);   // 1
		System.out.println("minsu - nextId : " + minsu.nextId);   // 1
		System.out.println("heejin - nextId : " + Ex07.nextId);  // 1
		System.out.println("sumi - nextId : " + Ex07.nextId);    // 1
		System.out.println("yoon - nextId : " + Ex07.nextId);    // 1
		
		
		
		minsu.setId();
		System.out.println(minsu.getNextId());
		
		System.out.println("minsu - nextId : " + Ex07.nextId);   // 2
		System.out.println("minsu - nextId : " + minsu.nextId);   // 2
		System.out.println("heejin - nextId : " + Ex07.nextId);  // 2
		System.out.println("sumi - nextId : " + Ex07.nextId);    // 2
		System.out.println("yoon - nextId : " + Ex07.nextId);    // 2
		
		Ex07.nextId = 15;
		System.out.println("minsu - nextId : " + Ex07.nextId);   // 15
		System.out.println("minsu - nextId : " + minsu.nextId);   // 15
		System.out.println("heejin - nextId : " + Ex07.nextId);  // 15
		System.out.println("sumi - nextId : " + Ex07.nextId);    // 15
		System.out.println("yoon - nextId : " + Ex07.nextId);    // 15
		
		Ex07 hong = new Ex07();
		System.out.println("hong - id : " + hong.id);   // 0
		System.out.println("hong - nextId : " + hong.nextId);   // 15
		
		
		
		
		heejin.setId();
		System.out.println(heejin.getNextId());
		
		sumi.setId();
		System.out.println(sumi.getNextId());
		
		yoon.setId();
		System.out.println(yoon.getNextId());
		
		
	}
}
