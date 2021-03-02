package com.callor.oop;

import com.callor.oop.service.MenuService;
import com.callor.oop.service.impl.MenuServiceimplV3;

public class CartEX_07 {
	
	public static void main(String[] args) {
		
		MenuService mService = new MenuServiceimplV3();
		CartService sService = new CartServiceimplV4();
		
		while(true) {
			
			mService.selectMenu();
			Integer menuItem = ((MenuServiceimplV3)mService).MenuItem;
			if(menuItem == null) {
				break;								
			}else if(menuItem == 1) {
				cService.inputCart();
			}else if(menuItem == 3) {
				cService.printCart();
			}
		}
		System.out.println("임무종료 야 퇴근이다!!!");
	}

}
