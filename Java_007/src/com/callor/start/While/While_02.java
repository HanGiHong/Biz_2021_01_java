package com.callor.start.While;

public class While_02 {

	    public static void main(String[] args) {
			
	    	int count = 0;
	    	
	    	while(count++ < 10) { //값을 비교하기 전에는 ++가 적용되지 않는다.
	    		                  //값을 비교 후 true시  sysout으로 넘어가기 전에 count의 ++값이 적용된다. 
	    		                  // ++count일 경우, ++값이 적용되어 값을 비교한다.
	    		System.out.println(count);
	    	}
	    	
	    	
	    	
	    	count = 0;
	    	while(count < 10); {
	    		System.out.println(++count);
	    	}
	    	
	    	
	    	//1
	    	System.out.println(count++);
	    	//풀어쓰면
	    	System.out.println(count);
	    	count += 1;
	    	
	    	
	    	//2
	    	System.out.println(++count);
	    	//풀어쓰면
	    	count++;
	    	System.out.println(count);
	    	
	    	
	    	
	 
	    	
	    	
	    	
		}
}
