package com.callor.oop;

import com.callor.oop.service.impl.MenuServiceimplV3;

public class Cart_06 {
	
	public static void main(String[] args) {
		
		MenuService mService = new MenuServiceimplV3();
		mService.selectMenu();
		
		
		/*
		 * MenuService 에는 선언되지 않고
		 * MenuServiceimplV3에만 선언된 menuItem 변수값을
		 * 읽어오기 위해서
		 * 인터페이스 -> 클래스 형변환을 시킨다.
		 */
		MenuServiceimplV3 mV3 = (MenuServiceimplV3)mService;
		Integer menuItem = mV3.MenuItem;
		
		//인터페이스를 클래스로 형변환 형과 동시에 변수에 접근하기
		Integer selectMenu
		= ((MenuServiceimplV3)mService).MenuItem;
		
		CartServiceimplV4 cService = new CartServiceimplV4();
		
		if(selectMenu == 1) {
			//카트 추가
		}else if(selectMenu == 2) {
			//카트 삭제
		}else if(selectMenu == 3) {
			//카트리스트
			cService.printCart();
		}
	}

}
