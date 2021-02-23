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
		int[] intNum = new int[100];

		
		for (int i = 0; i < intNum.length; i++) {

			// 1 ~ 1000까지 정수중 100까지의 임의의 랜덤한 정수가 저장
			intNum[i] = rnd.nextInt(1000) + 1;

		}

		// PrimeServiceV2 매서드 호출
		PrimeServiceV2 psV2 = new PrimeServiceV2();

		int sum = 0;

		// i값이 임의의 정수보다 작을 경우 1+ 한다.
		for (int i = 0; i < intNum.length; i++) {

			//결과값은 
			int result = psV2.prime(intNum[i]);

			
			if (result > 1) {
				System.out.println(intNum[i] + "는 소수");
				sum += intNum[i];
			}
		}

		System.out.println("임의의 소수들의 합 : " + sum);

	}

}
