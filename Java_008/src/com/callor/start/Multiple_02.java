package com.callor.start;

public class Multiple_02 {
	
	// for(int i = 0 ; i < 100 ; i++) 를 이용하여
	// 7 ~106 중 3의 배수가 아닌 합을 구하시오.
	
	public static void main(String[] args) {
		
		int int2M = 0;
		
		for(int i = 0 ; i < 100 ; i++) {
			
			int num = i + 7;
			boolean bYes = num % 3 == 0;
			if(!bYes) {
				int2M += num;
				System.out.println(num + "는 3의 배수가 아님");
			}			
		}
		System.out.println("3의 배수가 아닌 합 : " + int2M);
	}

}
