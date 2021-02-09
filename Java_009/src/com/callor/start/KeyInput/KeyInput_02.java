package com.callor.start.KeyInput;

import java.util.Scanner;

public class KeyInput_02 {

	public static void main(String[] args) {

		// Scanner 클래스를 객체로 생성하면서
		// 운영체제의 키보드 시스템과 연결한다.
		Scanner scan = new Scanner(System.in);

		System.out.print("임의의 숫자 >>");
		int intNum1 = scan.nextInt();

		if (intNum1 % 2 == 0)

		{
			System.out.print(intNum1 + "은(는)짝수");
		}

		if (intNum1 % 2 == 1)

		{
			System.out.print(intNum1 + "은(는)홀수");
		}

	}

}
