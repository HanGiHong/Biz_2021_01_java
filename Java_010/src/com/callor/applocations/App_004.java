package com.callor.applocations;

import com.callor.applocations.myclass.MyGuGuDan;

/*
 * 
 * main() method 가 없는 클래스 선언
 * 
 * 프로젝트에서 클래스의 역활
 * 
 *  프로젝트의 코드가 길어져서 복잡해지는 현상을
 *  방지하고, 코드를 읽기 쉽고, 수정하기 쉽도록
 *  분산하는 방식
 * 
 *  main() method에 200줄 정도의 코드가 있다고 할 때
 *  일정한 분량만큼 잘라서 다른 클래스, 메서드()에 코드를 옮기고
 * 
 *  main()에서는 클래스를 객체로 생성한다음
 *       객체, 메서드() 방식으로 코드를 실행하여
 *       같은 효과를 내는 것
 *
 */

public class App_004 {

	public static void main(String[] args) {

		// 내가 프로젝트에 선언 (정의, 만든다)
		// MyGuGuDan 클래스에 있는 어떤 기능들을
		// 사용하기 위하여
		// 클래스를 객체로 선언하고
		// 초기화하여 준비를 하는 절차
		// 이후에는 myGu 객체를 사용하여
		// 매서드들을 실행하는 코드를 사용할 수 있다.

		MyGuGuDan mygu = new MyGuGuDan();

		// MyGuGuDan 클래스에 선언 (정의, 만들기)된
		// GuGu() 메서드를 실행하라
		// MyGu 객체(object, Instance, 인스턴스)의
		// gugu() method를 호출한다 (실행한
		mygu.gugu();

	}
}
