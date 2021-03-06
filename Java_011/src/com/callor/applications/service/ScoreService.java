package com.callor.applications.service;

import java.util.Scanner;

/*
 * java의 class와 method()호출 
 * ScoreService 클래스에는 main() method 가 없어서
 * 여기에 있는 코드는 직접 Run(^F11)하여 실행할 수 없다
 * 누군가가 ScoreService를 객체, 인스턴스로 만들고
 * Score() method를 호출해주어야만 코드를 실행 할 수 있다.
 * 
 * 다른 언어에서는 module 등의 이름으로 사용한다.
 * 
 * 
 */

public class ScoreService {

	/*
	 * 클래스와 메서드(메소드, method)의 명명법 클래스 : 첫글자 영문대문자, 이후 영문대소문자 숫자 메서드 : 첫글자 영문소문자, 이후
	 * 영문대소문자 숫자
	 * 
	 * 클래스 명명법 (Upper) CamelCaes 라고 한다. 메서드 명명볍 (Lower) CamelCaes 라고 한다.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("국어점수를 입력하세요 >> ");

		int intKor = scan.nextInt();

		System.out.print("영어점수를 입력하세요 >> ");
		int intEng = scan.nextInt();

		System.out.print("수학점수를 입력하세요 >> ");
		int intMath = scan.nextInt();

		System.out.println("==============================");
		System.out.println("국어\t영어\t수학\t총점\t평균\t");
		System.out.println("------------------------------");

		System.out.print(intEng + "\t");
		System.out.print(intMath + "\t");

		int intSum = intKor;
		intSum += intEng;
		intSum += intMath;

		float fAvg = intSum / 3;

		fAvg = (float) intSum / 3;

		fAvg = intSum / 3.0f;
		fAvg = intSum / (float) 3;

		System.out.print(intKor + "\t");
		System.out.println(fAvg);
		System.out.println("==============================");
	}

}