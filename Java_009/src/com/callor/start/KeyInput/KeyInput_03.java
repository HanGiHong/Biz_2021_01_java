package com.callor.start.KeyInput;

import java.util.Random;

import java.util.Scanner;

public class KeyInput_03 {

	public static void main(String[] args) {

		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt(100) + 1;

		System.out.print("숫자 입력 >>");
		int KeyNum = scan.nextInt();

		// 1. KeyNum > num1 이냐?
		// 맞으면 "큰수" 표시하고 종료
		if (KeyNum > num1) {
			System.out.println(KeyNum + "보다 큰수");

			// 2. 그렇지 않으면 KeyNum < num1 이냐?
			// 맞으면 "작은 수" 표시하고 종료
		} else if (KeyNum < num1) {
			System.out.println(KeyNum + "와 작은 수");

			// 3. 그렇지 않으면 KeyNum == num1 이냐?
			// 맞으면 "같은 수" 표시하고 종료
		} else if (KeyNum == num1) {
			System.out.println(KeyNum + "와 같은수");

		}
	}

}
