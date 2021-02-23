/*
 * 1) c.c.a.service.PrimeServiceV1 클래스를 생성
 * 
 * 2) 정수형 매개변수 1개를 갖는 prime() method를 생성하고 매개변수 값이
 *    소수인지 판별하여 출력하는 코드 작성
 * 
 * 3) main()method 에서 키보드로 부터 숫자를 입력받고
 *    PrimeServiceV1의 prime()method 를 호출하여
 *    소수인지 아닌지를 판별하여 출력 
 */

package com.callor.applications.service;

public class PrimeServiceV1 {

	public void prime(int KeyNum) {

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

			System.out.println(pos);

			if (pos < KeyNum) {
				System.out.printf(KeyNum + " 는 소수가 아님");
			}

			else {
				System.out.printf(KeyNum + " 는 소수임");
			}

		}

	}

}
