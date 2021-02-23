/*
 *  1. Scanner 클래스를 사용하여 2 이상의 정수를 입력 받아 변수에 저장
 *  
 *  2. 변수에 저장한 정수가 소수(prime)인가를 판별하여 출력
 *  
 *   소 수
 *   1. 1과 자신 이외의 값으로 나누어지지 않는 수
 *   2. 1과 자신 이외의 약수를 갖지 않는 수
 */

package com.callor.applications;

import java.util.Scanner;

public class Prime_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("2이상의 정수 입력");
		System.out.print(">>");
		int KeyNum = scan.nextInt();

		boolean bYes = bYes = 4 % 2 == 0;
		bYes = 4 % 3 == 0;

		for (int i = 2; i < KeyNum; i++) {
			bYes = KeyNum % i == 0;
			if (bYes) {
				System.out.println("소수가 아니다");
				{
					break;
				}
			}

			int pos = 0;
			for (pos = 2; pos < KeyNum; pos++) {
				if (KeyNum % pos == 0) {
					break;
				}
			}

			// pos의 값은?
			System.out.println(pos);
			// for 반복문이 중간에 break 되면
			// 항상 pos < KeyNum 관계가 된다.
			// if(pos == KeyNum)
			// 코드는 확실한 방법으로!

			if (pos < KeyNum) {
				System.out.println(KeyNum + " 는 소수가 아님");
			}

			// for 반복문이 break 없이 모두 완료되었으면
			else {
				System.out.println(KeyNum + " 는 소수임");
			}

		}

	}
}
