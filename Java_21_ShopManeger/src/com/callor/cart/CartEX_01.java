package com.callor.cart;

import com.callor.cart.service.CartService;
import com.callor.cart.service.MenuService;
import com.callor.cart.service.impl.CartServiceV1;
import com.callor.cart.service.impl.MenuServiceV1;

public class CartEX_01 {
	
	public static void main(String[] args) {
		
		MenuService mService = new MenuServiceV1();
		
		CartService cService = new CartServiceV1();
		
		while(true) { //반복문
			
			Integer menu = mService.Menu(); 
			
			System.out.println(menu);
			
			if(menu == null) { 
				
				break;				
			}
						
			if (menu == 1 ) {  //콘솔 실행을 했을때
				
				cService.inputCart(); // 1번을 누르면 장바구니 상품입력이 나오게끔
				
					
			}else if (menu == 2) {
				
				cService.printCart(); // 2번을 누르면 장바구니 전체리스트가 나오게
				
			}else if (menu == 3) {
				
				cService.aprintCart();// 3번을 누르면 구매자별 장바구니 리스트가 나오게
			}
		}
	}
}
