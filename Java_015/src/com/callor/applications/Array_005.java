package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_005 {
	
	public static void main(String[] args) {
		
		
		Random rnd = new Random();
		int[] intNums = new int[100];
		
		for(int i = 0; i < intNums.length ; i++) {
			intNums[i] = rnd.nextInt(10) + 1;
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 1 ~ 10중에 입력");
		System.out.print(" >> ");
		
		int KeyNum  = scan.nextInt();
		
		int pos = 0;
		for(pos = 0 ; pos < intNums.length ; pos++) {
			if(intNums[pos] == KeyNum) {
				break;
			}
		}
		if(pos < intNums.length) {
			System.out.println(pos + " 위치에서 최초 발견");
		}
		else {
			System.out.print("배열에 찾은 값이 없음");
		}
	}

}
