/*
 * 1. 100개의 요소를 저장할 수 있는
	정수형 배열 intNums 선언 및 생성(초기화)

2. Random 클래스를 사용하여 1 ~ 100까지의 정수를 생성하여 
	intNums 배열에 저장

3. intNums 배열에 저장된 값중
	3의 배수이면서 5의 배수인 값들의 리스트와
	합을 계산하여 출력
 */

package com.callor.applications;

import java.util.Random;

public class Array_05 {

	public static void main(String[] args) {

		int[] intNums = new int[100];

		Random rnd = new Random();

		int intSum = 0;

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(100) + 1;

			int num1 = i;
			boolean bYes3 = intNums[i] % 3 == 0;
			boolean bYes5 = intNums[i] % 5 == 0;

			if (bYes3 && bYes5) {

				intSum += num1;
			}

		}
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(100) + 1;

			int num1 = i 
					;
			boolean bYes3 = intNums[i] % 3 == 0;
			boolean bYes5 = intNums[i] % 5 == 0;

			if (bYes3 && bYes5) {

				System.out.println("3과 5의 배수인 값 : " + intNums[i]);
					
			}

		}

		System.out.printf("3과 5의 배수의 합계 : " + intSum);

	}

}
