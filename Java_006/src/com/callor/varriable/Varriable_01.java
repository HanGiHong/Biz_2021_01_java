package com.callor.varriable;

public class Varriable_01 {
	
	public static void main(String[] args) {
		
		
		//연산하고자 하는 원래값이 저장되는 변수
		int intNum1 = 0;
		int intNum2 = 0;
		
		
		
		//변수에 연산할 값을 저장하기
		intNum1 = 30;
		intNum2 = 40;
		
		
		//연산결과를 저장할 변수 선언과 초기화
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		int result4 = 0;
		int result5 = 0;
		
		
		//연산결과를 변수에 저장하기
		result1 = intNum1 + intNum2;
		result2 = intNum2 - intNum1;
		result3 = intNum1 * intNum2;
		result4 = intNum2 / intNum1;
		result5 = intNum2 % intNum1;
		
		
		
		//변수에 저장된 결과를 Console에 출력
		// 30 + 40 = 70
		System.out.println("30+40 =" + (30+40));
		
		
		System.out.println(intNum1 + "+" + intNum2 + "=" + (result1 + intNum2));
		System.out.println(intNum2 + "-" + intNum1 + "=" + (result2 - intNum1));
		System.out.println(intNum1 + "*" + intNum2 + "=" + (result3 * intNum2));
		System.out.println(intNum1 + "/" + intNum2 + "=" + (result4 / intNum2));
		System.out.println(intNum1 + "%" + intNum2 + "=" + (result5 % intNum2));
		
		
		
	
	
	 
	
	
	 
	 
	 
			 
	}

}
