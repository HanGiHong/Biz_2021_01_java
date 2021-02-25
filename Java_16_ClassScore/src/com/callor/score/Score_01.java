/*
 * 다음과 같은 데이터를 배열로 선언하여 저장하고
 * 총점, 평균을 구하여 성적리스트를 출력하시오
 * 
 * 1.이름 : "홍길동","이몽룡","성춘향","장녹수","임꺽정"
 * 2 주소 : "서울시","익산시","남원시","한양시","함흥시"
 * 3 과목 : "국어","영어","수학"
 * 4 점수 : Random 클래스 사용 1 ~ 100까지 임의
 */

package com.callor.score;

import java.util.Random;

public class Score_01 {

	public static void main(String[] args) {

		// Random 클래스 생성
		Random rnd = new Random();

		// 임의의 정수 1 ~ 100 생성
		int num = rnd.nextInt(100) + 1;

		// 각 과목과 합계, 평균값을 int[]선언
		// 문제에서 배열로 선언하라고 했기 때문에 []를 사용한다.
		int[] intKor = new int[5];
		int[] intEng = new int[5];
		int[] intMath = new int[5];
		int[] intSum = new int[5];
		float[] favg = new float[5];

		String strName[] = new String[] { "홍길동", "이몽룡", "성춘향", "장녹수", "임꺽정" };

		// 출력문
		System.out.println("======================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------------------------");

		// i의 값이 이름수보다 적을 경우 i는 + 1
		for (int i = 0; i < strName.length; i++) {

			// 국어, 영어, 수학을 임의의 정수로 생성
			// 그후 임의의 정수로 생성된 값을 더함
			// 더한 정수값을 %3 을 함 (과목은 3개이므로 3과목을 더한 값에 %3을 하는 것이다.)

			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
			intSum[i] = intKor[i] + intEng[i] + intMath[i];
			favg[i] = (float) intSum[i] / 3.0f;

		}

		// i가 이름수보다 적을 경우 밑의 출력문의 [i]값을 반복한다
		for (int i = 0; i < strName.length; i++) {

			// %s = 문장
			// \t = tap(띄어쓰기)
			// %d = 숫자(정수)
			// \f = 숫자(실수)
			// \n = Enter
			// system.out.printf 내에 있는[i]값이 strName.length보다 적을경우 위 for 문장을 반복한다.

			// 소수점을 1자리로 만들고 싶을때는 %3.1f 를 입력한다
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%3.1f\n", strName[i], intKor[i], intEng[i], intMath[i], intSum[i],
					favg[i]);

		}
		// 출력문
		System.out.println("------------------------------------------------------");
	}
}
