package com.callor.applocations;

import java.util.Scanner;

import com.callor.applocations.myclass.MyGuGuDan;

public class App_08 {

	public static void main(String[] args) {

		MyGuGuDan myDan = new MyGuGuDan();
		Scanner scan = new Scanner(System.in);

		System.out.print("숫자 (2 ~ 9) >> ");
		int num = scan.nextInt();

		myDan.print(num);

	}

}