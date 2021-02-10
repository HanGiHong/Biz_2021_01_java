package com.callor.applocations;

import java.util.Scanner;

import com.callor.applocations.myclass.MyGuGuDan;

public class App_08 {

	public static void main(String[] args) {

		MyGuGuDan myDan = new MyGuGuDan();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("숫자 ( 2 ~ 9) >>");
		int num = scan.nextInt();

		((MyGuGuDan) myDan).print(num);

	}

}
