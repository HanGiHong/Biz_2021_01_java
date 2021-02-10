package com.callor.applocations;

import java.util.Scanner;

import com.callor.applocations.myclass.MyGuGuDan;

public class App_07 {

	public static void main(String[] args) {
		
		MyGuGuDan myGu = new My GuGuDan();
		
		/*
		 * MyGuGuDan 클래스에 정의된 print() method 호출
		 *    
		 * MyGuGuDan  클래스에 print() method 호춯
		 * 
		 *  //정수형 값을 넣어라
		 * print(int) ... arguments() 
		 * =>
		 */
		myGu. print(0);		
		
		Random rnd = new Random();
		//Random 클래스에
		//  nextInt() method를 호출하라
		rnd.nextInt(10); //호출하면서 정수 10을 주입
		rnd.nextInt();   //그냥 호출만 하라
		
		Scanner scan = new Scanner(System.in);
		scan.nextInt();
		
		Random rd = new Random();
		rd.nextInt(100);
	}

}
