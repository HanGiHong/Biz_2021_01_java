package com.callor.studeant;

/*
 * ====================
 * 구구단 7단
 * --------------------
 * 7 * 1 = 7
 * 7 * 2 = 14
 * 7 * 3 = 21
 * 7 * 4 = 28
 * 7 * 5 = 35
 * 7 * 6 = 42
 * 7 * 7 = 49
 * 7 * 8 = 56
 * 7 * 9 = 63
 *----------------------
 * 
 */
public class Ex_10 {
	
	public static void main(String[] args) {
		
		int dan = 7;
		System.out.println("====================");
		System.out.println("구구단 " + dan + " 단");
		System.out.println("--------------------");
		for (int i = 0; i < 8; i++) {
			int num2 = i + 2;
			System.out.print(dan);
			System.out.print(" x ");
			System.out.print(num2);
			System.out.print(" = ");
			System.out.println(dan * num2);
	}
	
	

	}
}
