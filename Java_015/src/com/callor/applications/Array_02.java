/*1. 100개의 요소를 저장할 수 있는
	정수형 배열 intNums 선언 및 생성(초기화)

2. Random 클래스를 사용하여 1 ~ 10까지의 정수를 생성하여 
	intNums 배열에 저장

3. Scanner 클래스를 사용하여 키보드를 통해 1 ~ 10까지중 정수를 입력받아
  입력받은 정수가 배열 intNums에 몇 번째에 저장되어 있는지 찾아 개수를 출력
*/

package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_02 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] intNums = new int[100];
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(10) + 1;
		}

		Scanner scan = new Scanner(System.in);
		System.out.println("1 ~ 10까지 정수 입력");
		System.out.print("숫자 >> ");
		int keyNum = scan.nextInt();

		System.out.printf("값 %d가 저장된 위치!!!\n", keyNum);
		for (int positon = 0; positon < intNums.length; positon++) {
			if (intNums[positon] == keyNum) {
				System.out.print(positon + ", ");
			}
		}
	}

}