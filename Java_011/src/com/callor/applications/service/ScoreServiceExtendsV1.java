package com.callor.applications.service;

import java.util.Scanner;

/*
 *  클래스의 extends(확장, 상속)
 *  
 *  ScoreServiceV4 : parant(부모) 클래스
 *  ScoreServiceExtendsV1 : child(자식) 클래스
 *  
 *  단순한 extends
 *  	부모 클래스에 정의된 모든 method를
 *  	코드한줄 추가, 수정없이 그대로 사용할 수 있다.
 *  
 *  추가 extends
 *  	부모 클래스에 정의된 method와
 *  	새롭게 추가된 method가 있는
 *  	확장된 클래스의 생성
 */

public class ScoreServiceExtendsV1 extends ScoreServiceV4 {

	public int input(String Subject) {
		System.out.print("여기는 ExtendsV1d의 input()");

		// 문자열형변수 1개를 매개변수로 갖는 input()method
		

			// 사용자에게 입력을 받아 그 값을 변수에 저장
			Scanner scan = new Scanner(System.in);

			// intScore 를 우선 0으로 선언 (초기화)
			int intScore = 0;

			// while문을 작성하여 조건식에 적합할 때 까지 계속으로 동작시킨다.
			while (true) {
				System.out.print(subject + "점수 입력 >>");
				intScore = scan.nextInt();

				// 만일 입력값이 0 미만일 경우 입력한 문구 출력후 다시 입력
				if (intScore < 0) {
					System.out.println(subject + "점수는 0점 이상 입력!!!");

					// 입력값이 100을 초과할 경우 입력한 문구 출력후 다시 입력
				} else if (intScore > 100) {
					System.out.println(subject + "점수는 100점 이하 입력!!!");

					// 입력값이 0 초과 100미만의 수일 경우 while문의 동작을 중지
				} else {
					break;
				}
			}
	}

		// 이후 결과값을 console에 출력
		// System.out.println("입력한 정수 : " + intScore);
		return intScore;
}
	
}
