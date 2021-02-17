package com.callor.applications;

import java.util.Scanner;

public class Score_01_self {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("국어 점수입력 >>");
		int num = scan.nextInt();
		
		System.out.print("영어 점수입력 >>");
		int num2 = scan.nextInt();
		
		System.out.print("수학 점수입력 >>");
		int num3 = scan.nextInt();
		
		float num4 = (num + num2 + num3);
		
		float num5 = (num4 / 3);
	
			
		
		System.out.println("=======================================================");
		System.out.println("국어"+"\t" +  "영어"+"\t"+"수학"+"\t"+"총점"+"\t"+"평균");
		System.out.println("-------------------------------------------------------");
		System.out.print(num);
		System.out.print("\t" + num2);
		System.out.print("\t" + num3);
		System.out.print("\t" + num4);
		System.out.print("\t" + num5);

		
	}

}
