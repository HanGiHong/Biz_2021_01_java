package com.callor.applications.service;

import java.util.Random;
import java.util.Scanner;

public class ScoreServiceV1 {

	// 인스턴스변수 선언

	private String[] strName;
	private int[] intKor;
	private int[] intEng;
	private int[] intMath;

	private int[] intSum;
	private float[] floatAvg;

	// scanner.Random 선언만
	private Scanner scan;
	private Random rnd;
	//배열, 객체 등을 초기화하여 사용한 준비를 하는 method
	public void init() {

		scan = new Scanner(System.in);
		rnd = new Random();

		System.out.println("몇명의 학생 성적을 처리하려고 하나요?");
		System.out.print("학생 수 >> ");
		String strNums = scan.nextLine();
		int intNums = Integer.valueOf(strNums);

		strName = new String[intNums];
		intKor = new int[intNums];
		intEng = new int[intNums];
		intMath = new int[intNums];

		intSum = new int[intNums];
		floatAvg = new float[intNums];
	}// end init

	public void inputNames() {

		System.out.println("학생의 이름을 입력하세요");
		for (int i = 0; i < strName.length; i++) {
			System.out.print((i + 1) + "반 학생 이름 >> ");
			strName[i] = scan.nextLine();
		}
	}

	/*
	 * test를 위한 데이터 생성준비 학생이름 리스트를 미리 배열로 만들고 학생이름 수 만큼 성적, 총점 ,평균 배열 생성
	 */
	public void makeNamesAndArrayInit() {

		strName = new String[] { "홍길동", "이몽룡", "성춘향", "창록수", "임꺽정", "김태연", "설운도", "장윤정" };

		intKor = new int[strName.length];
		intEng = new int[strName.length];
		intMath = new int[strName.length];

		intSum = new int[strName.length];
		floatAvg = new float[strName.length];
		
		//rnd. nextInt() method를 사용하기 전에
		// 반드시 어디에선가 호출 시켜놔야 한다
		rnd = new Random();

	}

	public void makeScore() {

		
		for (int i = 0; i < strName.length; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;

		}
	}

	public void makeSum() {

		for (int i = 0; i < strName.length; i++) {
			intSum[i] = intKor[i];
			intSum[i] += intEng[i];
			intSum[i] += intMath[i];

		}
	}

	public void makeAvg() {

		for (int i = 0; i < strName.length; i++) {
			floatAvg[i] = (float) intSum[i] / 3;
		}
	}

	public void inputScore() {

		for (int i = 0; i < strName.length; i++) {
			System.out.println(strName[i] + "학생의 성적 입력");

			System.out.print("국어 >>");
			String strKor = scan.nextLine();
			intKor[i] = Integer.valueOf(strKor);

			System.out.print("영어 >>");
			String strEng = scan.nextLine();
			intEng[i] = Integer.valueOf(strEng);

			System.out.print("수학 >>");
			String strMath = scan.nextLine();
			intMath[i] = Integer.valueOf(strMath);
		}
	}

	public void print() {
		System.out.println("==============================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------");

		for (int i = 0; i < strName.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d/3f\n", strName[i], intKor[i], intEng[i], intMath[i], intSum[i],
					floatAvg[i]);
			
		}System.out.println("=============================================");
	}

}
