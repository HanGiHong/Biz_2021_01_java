package com.callor.studeant;

import java.util.Random;

/*
 * 정수형 배열 100개를 선언하여
 * 10 ~ 100까지 임의의 정수를 생성하여 저장
 * 
 * 100개의 배열에 담긴 정수중에 소수들만 찾아서
 * Console 출력
 */
public class Ex_08 {

	public static void main(String[] args) {

		Random rnd = new Random(); //랜덤클래스 선언

		int num[] = new int[100]; // 정수형 배열 100개 선언

		for (int i = 0; i < num.length; i++) { // i 가 배열보다 작으면 +1

			num[i] = rnd.nextInt(91) + 10; //배열에는 10 ~ 100까지 임의의 정수가 들어있음

			int j = 0;
			for (j = 2; j < num[i] -1; j++) { // i 값이 소수인지 검사

				if (num[i] % j == 0) { // 임의의 정수가 소수일경우
					
					break;
				} 
			}
			if( j < num[i]) {
				System.out.println();
			}else {
				System.out.println(num[i] + "는 소수");
	
		}
		
		
	}
	

}
}
