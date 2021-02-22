package com.callor.applications;

import java.util.Random;

public class Score_05 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int num = rnd.nextInt(100) + 1;

		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		int[] intSum = new int[3];
		float[] favg = new float[3];

		String strName[] = new String[] { "홍길동", "이몽룡", "성춘향" };

		System.out.println("================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------------------");

		for (int i = 0; i < strName.length; i++) {

			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
			intSum[i] = intKor[i] + intEng[i] + intMath[i];
			favg[i] = (float) intSum[i] / 3.0f;

		} // for end
		for (int i = 0; i < strName.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%f\n", strName[i], intKor[i], intEng[i], intMath[i], intSum[i],
					favg[i]);
		}
	}
 
}
