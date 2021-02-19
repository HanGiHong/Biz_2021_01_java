package com.callor.appliaction.service;

import java.util.Scanner;

public class ScoreServiceV1 {

	/*
	 * 클래스 영역에 선언된 변수들 클래스 영역 = 멤버 영역 인스턴스 변수 ScoreServiceV1 ssV1; : 클래스를 객체로 선언
	 * =new SSV1() : 객체의 초기화 인스턴스 : 객체가 초기화 되면 자동으로 사용할 준비가 되는 변수들
	 */

	private Scanner scan = new Scanner(System.in);

	private int intKor = 0;
	private int intEng = 0;
	private int intMath = 0;
	private int intSum = 0;
	private float floatAvg = 0;

	// input () method가 호출되면
	// 키보드를 통해서 국어,영어,수학 점수를 입력받고
	// intKor, intEng, intMath에 저장

	public void input() {

		// input()method의 지역변수(멤버 변수)
		int intNum = 0;

		System.out.print("국어점수 입력 >> ");
		intKor = scan.nextInt();
		System.out.print("영어점수 입력 >> ");
		intEng = scan.nextInt();
		System.out.print("수학점수 입력 >> ");
		intMath = scan.nextInt();

	}

	public void sum() {
		
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;

	}

	public void avg() {
		
		floatAvg = (float)intSum / 3f;
		

	}

	public void print() {
		
		// %s : 문자열 formattiog
		System.out.printf("이름 : %s\n", strName);
		
		System.out.println("국어 : " + intKor);
		System.out.println("영어 : " + intEng);
		System.out.println("수학 : " + intMath);
		
		System.out.println("총점 : " + intSum);
		
		
		System.out.println();
		
		System.out.println("평균 :  + %3.2f\n" + floatAvg);
		

	}

}
