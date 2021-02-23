/*
 * 1. 100개의 요소를 저장할 수 있는
	정수형 배열 intNums 선언 및 생성(초기화)

2. Random 클래스를 사용하여 1 ~ 10까지의 정수를 생성하여 
	intNums 배열에 저장

3. Scanner 클래스를 사용하여 키보드를 통해 1 ~ 10까지중 정수를 입력받고
  입력받은 정수가 배열 intNums의 가장 마지막으로 나타나는 위치 번호 만 출력
 */

package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] intNums = new int[100];

		Random rnd = new Random();

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(10) + 1;
		}

		System.out.print("입력 >> ");
		int keyScan = scan.nextInt();

		/*
		 * 변수는 앞에서 어떤값을 저장했던 상관없이 가장 마지막에 저장한 값만 가지고 있다.
		 */
		int lastnum = 0;

		for (int i = 0; i < intNums.length; i++) {

			if (intNums[i] == keyScan) {
				System.out.println("위치 : " + i);
				// 키보드로 입력한 값이 일치할 때마다
				// 그 위치를 lastnum에 저장한다.
				lastnum = i;

			}
		}

		/*
		 * 여기 오면 lastnum에 저장된 값은 가장 마지막으로 lastnum = position이 실행된 결과만 담고 있다.
		 */
	}

}
