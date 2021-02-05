package com.callor.start.pay;

public class pay_03 {
	
	public static void main(String[] args) {
		
		//5만원권 계산
		int pay = 4_789_800;
		int paper = 50_000;
		
		
		//for() 반복문이 무한 반복된다.
		//for() 문을 종료하는 조건을 부여해야 한다.
		
		    for (int i = 0 ;  pay > 0 ; i++ )     {
	    	int count = pay / paper;
	        pay -= (paper * count);
	        System.out.println(paper + "원권 : " + count);
	        
	        if(i % 2 == 0) { //i가 짝수이면
	            paper = paper / 5;
	 	    } else { 
	 	    	paper = paper / 2;
	 	    	
	 	    }
	        

	        
	    
	    }
		
		
	}

}
