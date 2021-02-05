package com.callor.start.pay;

public class pay_02 {
	
	public static void main(String[] args) {
		
	
		int pay = 4_789_800;
		int paper = 50_000;
		
	
		/*
		 * for - 시작하는 값과 횟수가 정해질 때 사용
		 * while - 횟수가 정해지지 않고 어떠한 조건에 의해서 
		 *         반복문을 수행하거나 종료할 필요가 있을때 사용
		 *         조건문이 true 일때만 반복하고
		 *         조건문이 false가 되면 종료한다.
		 */
		
		
		int sw = -1;
		while ( pay > 0 ){
	    	int count = pay / paper;
	        pay -= (paper * count);
	        System.out.println(paper + "원권 : " + count);
	        
	        if(sw < 0) { // sw가 0보다 작으면 
	            paper = paper / 5;
	            
	 	    } else //그렇지 않으면
	            paper = paper /2;
	        }
	        
	        sw *= (-1);
	       
	        
	    
	    }
		
		
}