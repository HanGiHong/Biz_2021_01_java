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

		Random[] rnd = new Random[100];
		
		int num = rnd.length +1;
		

		int count = 0;

		for (int i = 10; i <= 100; i++)
			

		{

			for (int j = 2; j <= i; j++)

			{

				if (i % j == 0) {
					count++;
				}
			}

			// 소수는 1과 자기자신으로만 나눠지므로 자기자신으로 한번만 나눠질때 소수
			if (count == 1) {
				System.out.print(i + " ");
			}
			count = 0;
		}

	}

}
