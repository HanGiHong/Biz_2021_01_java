package com.callor.applications;

import java.util.Random;

public class Score_04 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int num1 = 0;

		num1 = rnd.nextInt(100);

		int intKor[] = new int[3];
		int intEng[] = new int[3];
		int intMath[] = new int[3];

		String strName[] = new String[] { "홍길동", "이몽룡", "성춘향" };

		for (int index = 0; index < 3; index++) {
			intKor[index] = rnd.nextInt(100) + 1;
			intEng[index] = rnd.nextInt(100) + 1;
			intMath[index] = rnd.nextInt(100) + 1;
			
		
		}
		System.out.println("==============================");
		System.out.println("이름\t국어\t수학\t영어\t");
		System.out.println("--------------------------------");
	    for(int i = 0; i < 3; i++) {
	    	System.out.printf("%s\t%d\t%d\t%d\n",strName[i],intKor[i],intEng[i],intMath[i]);
	    	
	    	
	    }
	    	
	    System.out.println("==============================");	
	    	
	    	

	}

}
