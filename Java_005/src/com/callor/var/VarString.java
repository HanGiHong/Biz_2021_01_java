package com.callor.var;

/*
 * 문자열형변수
 * 변수를 선언하는 곳만 변경하면 된다
 * 코드를 변경해야 할 경우 원하는 결과를 얻자
 * 
 * 앞으로 가장 많이 쓰일 키워드
 * -int
 * -float
 * -String
 */




public class VarString {

	public static void main(String[] args) {
		
		String str1 = "Korea";
		String str2 = "대한민국";
		
		String str3 = "Of";
		String str4 = "Korea";
		String str5 = "우리나라";
		

		System.out.println(str1);	
		System.out.println(str2);	
		System.out.println(str1 + str3 + str4);	
		System.out.println(str2 + str5);	
		
	}

}
