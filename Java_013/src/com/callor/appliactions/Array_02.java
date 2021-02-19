package com.callor.appliactions;

import java.util.Random;

public class Array_02 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] intNum = new int[100];
		
		for(int i = 0 ; i < 10 ; i++) {
			intNum[i] = rnd.nextInt(100) +1;
			System.out.println("합계 : " + intNum[i]);
			}
		
		
		for (int i = 0; i < 20; i++) {
			System.out.println(intNum[i]);
		}
		
		
		
		for(int i =0 ; i < 101; i++) {
			if( i % 2 == 0);
		System.out.println();
						
		}
		
		
		
		
		
		
				
		}
		
	}


