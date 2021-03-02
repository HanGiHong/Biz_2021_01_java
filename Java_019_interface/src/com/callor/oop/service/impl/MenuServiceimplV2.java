/*
 * selectMenu() method를 선언하고
 * 다음과 같은 메뉴를 구현하시오
 * 
 * 문자열Q를 입력하면 종료, 1 ~ 3 까지 입력하면 선택된
 * 메뉴 문자열 출력, 그 외 입력하면 계속 입력 반복
 * 
 */

package com.callor.oop.service.impl;

import java.util.Scanner;

public class MenuServiceimplV2 {

	/*
	 * 인스턴스 객체변수 선언 생성자에서 객체변수 초기화하여 사용할 준비
	 */
	private Scanner scan;
	
	

	public MenuServiceimplV2() {
		scan = new Scanner(System.in);
		// TODO Auto-generated constructor stub
	}
	
	
	public  void selectMenu() {
				
		
		
		while(true) {
			
		
		
		System.out.println("=====================");
		System.out.println(" 카트메뉴 system V1 ");
		System.out.println("---------------------");
		System.out.println(" 1. 카트추가");
		System.out.println(" 2. 카트삭제");
		System.out.println(" 3. 카트리스트");
		System.out.println(" QUIT. 끝내기");
		System.out.println("----------------------");
	
		System.out.print("선택 >> ");
		String strMenu = scan.nextLine();
		
		// 1. Q를 입력하면 끝내기
		if(strMenu.equals("QUIT")) {
			System.out.println("끝내기");
			return;
		}
		
		//2. Q가 아니면 숫자로 변경하여 매뉴 선택 처리
		try {
			int intMenu = Integer.valueOf(strMenu);
			if(intMenu == 1) {
				System.out.println("1. 카트추가");
			}else if (intMenu ==2 ) {
				System.out.println("2. 카트 삭제");	
			}else if(intMenu ==3) {
				System.out.println("3. 카트리스트");				
			}else {
				System.out.println("메뉴는 1 ~ 3 까지만 입력");
				continue;
			}
		}
	
		}
		
}

}
