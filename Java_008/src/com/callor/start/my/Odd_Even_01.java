package com.callor.start.my;

public class Odd_Even_01 {
	
	public static void main(String args []) {
		
		int Num1 = 0;
		
		for(int sw = 0 ; sw <= 100 ; sw++ ) {
			
			if ( sw % 2 == 0 ) 
			{ Num1 += sw; }
			
		}
		
		System.out.println("1 ~ 100까지 짝수의 합 = " + Num1);
	
	    int Num2 = 0;
		
		  for(int sw = 0 ; sw <= 100 ; sw++ ) {
			  
			  if ( sw % 2 == 1 )
			  { Num2 += sw; }
	     
		  }
	    System.out.println("1 ~ 100까지 홀수의 합 = " + Num2); 
	    
	    System.out.println("=============================================");
	    
	    int intSumodd = 0;
	    for(int i = 0 ; i < 100 ; i++) {
	    	int num = i +1;
	    	boolean bYes = num % 2 == 1;
	    	if(bYes) {
	    		intSumodd += num;
	    	}
	    }
		  System.out.println("홀수의 합 : " + intSumodd);
		  
		  //위에서 선언하고 사용했던 변수를 "재사용" 하기위해
		  //반드시 초기화(clear) 해야 한다.
		  intSumodd = 0;
		  for(int i = 0 ; i < 100 ; i++ ) {
			  int num = i + 1;
			  boolean bYes = num % 2 == 0;
			  
			  //if(bYes == false) { 
			  
			  //bYes가 true가 아니면
			  if( !bYes ) {
				  intSumodd += num;
			  }
		  }
		  System.out.println("홀수의 합 : " + intSumodd);
     }
		  
}



			    		
