package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.PrimeServiceV2;

public class Prime_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("2이상 정수 입력");
		System.out.print(" >> ");
		int Num = scan.nextInt();

		PrimeServiceV2 psV2 = new PrimeServiceV2();

		// 결과값은 PrimeServiceV2 패키지에 있는 입력값과 같다
		int result = psV2.prime(Num);
		
		//만약 입력값이 0보다 클 경우
		if (result < 0) {
			System.out.println(Num + "는 소수가 아님");
			// 입력값이 0보다 작을경우
		} else {
			System.out.println(Num + "는 소수");

		}

	}

}
