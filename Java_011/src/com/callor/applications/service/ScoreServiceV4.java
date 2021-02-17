package com.callor.applications.service;

public class ScoreServiceV4 {

	public void score(int intSum, float floatAvg) {
		System.out.print(intSum);
		System.out.print(floatAvg);
	}

	public void print(int intKor, int intEng, int intMath) {

		// 연산, 계산부분을 처리
		// 출력부분처리
		int intSum = intKor + intEng + intMath;
		
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;

		System.out.println("====================================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------");

		System.out.print(intKor + "\t");
		System.out.print(intEng + "\t");
		System.out.print(intMath + "\t");
	}

}
