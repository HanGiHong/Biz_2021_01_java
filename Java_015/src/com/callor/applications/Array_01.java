/*
 * 1. 100개의 요소를 저장할 수 있는
	정수형 배열 intNums 선언 및 생성(초기화)

2. Random 클래스를 사용하여 1 ~ 10까지의 정수를 생성하여 
	intNums 배열에 저장

3. Scanner 클래스를 사용하여 키보드를 통해 1 ~ 10까지중 정수를 입력받아
  입력받은 정수가 배열 intNums에 몇개 저장되어 있는지 찾아 개수를 출력
 */


package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_01 {

	public static void main(String[] args) {

		//Scanner 클래스 선언
		Scanner scan = new Scanner(System.in);
		//100개의 요소를 저장 할 수 있는 정수형 배열 선언
		int[] intNums = new int[100];
		//Random 클래스 선언
		Random rnd = new Random();
		// 정수형 횟수 선언
		int count = 0;

		for (int i = 0; i < intNums.length; i++) {
			 intNums[i] = rnd.nextInt(10) + 1;
		}
		
		//1 ~ 10까지 정수중 입력
		 System.out.print("입력 >> ");
	      int keyScan = scan.nextInt(); 

	      // 1 ~ 10까지 입력한 정수와 랜덤으로 저장되어있는 값과
	      // 일치하면 카운트 추가
	      for (int i = 0; i < intNums.length; i++) {
	          if (intNums[i] == keyScan) {
	             count ++;


		}		
	}
	      System.out.println("횟수 : " + count);
	}
}


