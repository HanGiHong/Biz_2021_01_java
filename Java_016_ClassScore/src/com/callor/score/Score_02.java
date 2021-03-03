/*
 * ScoreServiceV1클래스에 method 생성
 * 총점계산 : scoreSum().
 * 평균계산 : scoreAvg(),
 * 성적리스트 : scorePrint()
 * 
 *  2. Score_02 main() 메서드에서
 *  "홍길동,이몽룡,성춘향,장녹수,임꺽정 학생의
 *  국어, 영어, 수학 성적 정보를 생성하고
 *  
 *  3. SSV1의 method를 호출하여
 *  총점, 평균,계산 및 성적 리스트 출력
 *
 */

package com.callor.score;

import java.util.Scanner;

public class Score_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] strName = new String[3];
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];

		for (int index = 0; index < strName.length; index++) {
			System.out.println("학생이름을 입력하세요");
			System.out.print("이름 >> ");
			strName[index] = scan.nextLine();

			System.out.println("과목 점수를 입력하세요");
			System.out.print("국어 >> ");

			// 문자열형으로 입력받고
			String strSubj = scan.nextLine();
			// 문자열형숫자를 정수로 변경하여 저장
			intKor[index] = Integer.valueOf(strSubj);

			System.out.print("영어 >> ");
			strSubj = scan.nextLine();
			intEng[index] = Integer.valueOf(strSubj);

			System.out.print("수학 >> ");
			strSubj = scan.nextLine();
			intMath[index] = Integer.valueOf(strSubj);

		}

	}

}