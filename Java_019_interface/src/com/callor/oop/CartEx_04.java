package com.callor.oop;

import com.callor.oop.service.CartService;
import com.callor.oop.service.impl.CartServiceimplV4;

public class CartEx_04 {
	
	public static void main(String[] args) {
		
		CartService cService = new CartServiceimplV4();
		cService.inputCart();
	}

}
