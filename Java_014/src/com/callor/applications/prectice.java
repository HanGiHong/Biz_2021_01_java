package com.callor.applications;

import java.util.Scanner;

public class prectice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("1번학생의 점수을 입력하세요");
		System.out.print("국어 >> ");
		String strKor = scan.nextLine();

		System.out.print("영어 >> ");
		String strEng = scan.nextLine();

		System.out.print("수학 >> ");
		String strMath = scan.nextLine();

		System.out.println("2번학생의 점수을 입력하세요");
		System.out.print("국어 >> ");
		String strKor1 = scan.nextLine();

		System.out.print("영어 >> ");
		String strEng1 = scan.nextLine();

		System.out.print("수학 >> ");
		String strMath1 = scan.nextLine();

		System.out.println("3번학생의 점수을 입력하세요");
		System.out.print("국어 >> ");
		String strKor2 = scan.nextLine();

		System.out.print("영어 >> ");
		String strEng2 = scan.nextLine();

		System.out.print("수학 >> ");
		String strMath2 = scan.nextLine();

		System.out.println("=============================");
		System.out.println("국어\t영어\t수학\t");
		System.out.println("=============================");

		System.out.print(strKor + "\t");
		System.out.print(strEng + "\t");
		System.out.print(strMath + "\n");
		System.out.println("-----------------------------");
		System.out.print(strKor1 + "\t");
		System.out.print(strEng1 + "\t");
		System.out.print(strMath1 + "\n");
		System.out.println("-----------------------------");
		System.out.print(strKor2 + "\t");
		System.out.print(strEng2 + "\t");
		System.out.print(strMath2 + "\n");
	}

}
