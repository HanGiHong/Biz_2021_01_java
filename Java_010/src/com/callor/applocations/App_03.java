package com.callor.applocations;

import java.util.Scanner;

public class App_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력( 2 ~ 9 ) = ");

		while (true) {
			int num1 = scan.nextInt();

			boolean bYes2 = num1 >= 2;
			boolean bYes9 = num1 <= 9;
			if (bYes2 && bYes9) {
				System.out.println("=====================");
				System.out.println("구구단" + num1 + "단");
				System.out.println("=====================");
				for (int i = 0; i < 8; i++) {
					int num2 = i + 2;
					System.out.print(num1);

					System.out.print(" X ");

					System.out.print(num2);

					System.out.print(" = ");

					System.out.println(num1 * num2);
				}
				System.out.println("==================");
				System.out.println("숫자입력 ( 2 ~ 9 ) = ");
			}
			if (!bYes2 || !bYes9) {
				System.out.println("입력한 숫자 : " + num1);
				System.out.println("Warning! 다시 입력하세요. 숫자 입력 (2 ~ 9) = ");
			}

		}
	}
}
