package com.callor.studeant;

import com.callor.studeant.model.StudentVO;

public class Ex_04 {
	
	public static void main(String[] args) {
		
		//배열 10개를 선언
		StudentVO[] stdArray = new StudentVO[10];
		
		
		int index = 2;
		
		//1번째 방법
		stdArray[index] = new StudentVO();
		
		// 2번째 방법
		for(int i = 0 ; i < stdArray.length ; i++) {
			stdArray[i] = new StudentVO();
		}
		
		stdArray[index].setStName("홍길동");
		stdArray[index].setStNum("0001");
		
		System.out.println("이름 : " + stdArray[index].getStName());
		System.out.println("학번 : " + stdArray[index].getStNum());
	}
	

}
