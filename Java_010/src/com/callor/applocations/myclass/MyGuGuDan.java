package com.callor.applocations.myclass;

import java.util.Scanner;

/*
 * main() method가 없는 클래스 선언
 */
public class MyGuGuDan {

	/*
	 * public (누구나 사용할 수 있는) gugu() method 선언
	 *
	 * 임의로 어떤 일을 수행하기 위한 명령문 생성
	 * 
	 */

	public void gugu() {

		Scanner scan = new Scanner(System.in);
		System.out.print("숫자입력 (2 ~ 9,-1:Quit ) >> ");
		int num = scan.nextInt();

		if (num < 0) {
			System.out.print("Game Over!!!");
			break;
		}

		System.out.println("===================");
		System.out.println("구구단" + num + "단");
		System.out.println("===================");

		for (int i = 0; i < 8; i++) {

			int num2 = i + 2;
			System.out.print(num);
			System.out.print(" X ");
			System.out.print(num2);
			System.out.print(" = ");
			System.out.println(num * num2);
		}
	} // gugu () end

	public void print(int num) {
		// TODO Auto-generated method stub

	}

	public void print1(int num) {
		// TODO Auto-generated method stub

	}

	public void print11(int num) {
		// TODO Auto-generated method stub

	}
}
