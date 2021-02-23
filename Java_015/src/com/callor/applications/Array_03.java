/*
 * 1. 100개의 요소를 저장할 수 있는
	정수형 배열 intNums 선언 및 생성(초기화)

2. Random 클래스를 사용하여 1 ~ 10까지의 정수를 생성하여 
	intNums 배열에 저장

3. Scanner 클래스를 사용하여 키보드를 통해 1 ~ 10까지중 정수를 입력받고
  입력받은 정수가 배열 intNums의 몇번째에서 최초로 나타내는 위치 번호만 출력
 */

package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] intNums = new int[100];

		Random rnd = new Random();

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(10) + 1;
		}

		System.out.print("입력 >> ");
		int keyScan = scan.nextInt();

		for (int i = 0; i < intNums.length; i++) {
			if (intNums[i] == keyScan) {
				System.out.println("위치 : " + i);
				break;

			}
		}

	}

}
