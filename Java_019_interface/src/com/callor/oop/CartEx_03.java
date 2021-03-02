
package com.callor.oop;

import com.callor.oop.service.CartService;
import com.callor.oop.service.impl.CartServiceimplV2;

public class CartEx_03 {

	public static void main(String[] args) {

		CartService cServ = new CartServiceimplV2();
		cServ.inputCart();
		cServ.printCart();

	}

}