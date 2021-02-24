/*
 * 1) HomeWork_01의 main() method에서
 * 
 * 2) Random 클래스를 사용하여 임의의 정수 100개를 만들고
 * 
 * 3) primeServiceV2의 prime() 매서드를 호출하여
 * 
 * 4) 임의의 정수 100개중 소수인 수들의 리스트 출력
 * 
 * 5) 소수인 수들의 합을 계산하여 출력
 */

package com.callor.applications;

import java.util.Random;

import com.callor.applications.service.PrimeServiceV2;

public class HomeWork_01 {

	// main()method 선언
	public static void main(String[] args) {

		// Random 클래스 선언
		Random rnd = new Random();

		// 임의의 정수 100개 선언
		int[] Num = new int[100];

		for (int i = 0; i < Num.length; i++) {

			// 1 ~ 1000까지 정수중 100까지의 임의의 랜덤한 정수가 저장
			Num[i] = rnd.nextInt(200) + 2;

		}

		// PrimeServiceV2 매서드 호출
		PrimeServiceV2 psV2 = new PrimeServiceV2();

		int sum = 0;

		// i값이 임의의 정수보다 작을 경우 1+ 한다.
		for (int i = 0; i < Num.length; i++) {

			// 결과값은 PrimeServiceV2 패키지에 있는 입력값과 같다
			int result = psV2.prime(Num[i]);

			// 만일 결과값이 0보다 작을경우
			if (result < 0) {

				System.out.println(Num[i] + "는 소수");
				// 결과값으로 나온 100가지의 소수들이 전부 더해진다.
				sum += Num[i];
			}
		}

		System.out.println("임의의 소수들의 합 : " + sum);

	}

}
