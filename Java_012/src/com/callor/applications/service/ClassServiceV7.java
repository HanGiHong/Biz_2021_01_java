package com.callor.applications.service;

import java.util.Scanner;

public class ClassServiceV7 {

	public void guguDan(int dan) {
		/*
		 * 정수 1개를 매개변수 dan에 전달받아
		 * 구구단 출력
		 */
		
		System.out.println("====================");
		System.out.printf("%d단 구구단\n",dan);
		System.out.println("--------------------");
		
		for (int num = 2; num < 10; num++) {
			System.out.printf("%d x %d = %d\n",
					dan,num,dan*num);
						
						
		}
	}
}
