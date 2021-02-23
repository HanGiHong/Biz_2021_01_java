/*
 * 1) c.c.a.servicePrimeServiceV2 클래스 생성
 * 
 * 2) 정수형 매개변수 1개를 갖는 prime()method 생성
 * 
 * 3) 매개변수값이 소수이면 매개변수 값, 아니면 -1을 return 
 * 
 * 4) prime_03 클래스의 main()method 에서 키보드로부터 숫자를 입력받고
 * 
 * 5) prime()method에 값을 전달하며 호출하고 
 * 	  return 값에 따라 소수인지 아닌지를 판별하여 출력
 */

package com.callor.applications.service;

public class PrimeServiceV2 {

	public int prime(int num) {

		// num 값이 소수이면 return num
		// 아니면 return -1

		// if(소수이면) return num;
		// else return -1;
		for (int i = 1; i < num; i++) {
			// true 이면 소수가 아니다
			if (num % (i + 1) == 0) {
				// prime() method 실행을 중단하고
				// main() method에게 -1을 되돌려줘라
				return -1;
			}
		}
		// num값이 소수이어서 for() 반복문을 모두 수행하고
		// 여기에 다다르면 num값을 그대로 return 하라
		return num;
	}
}