package com.callor.shop.service;

//인터페이스는 인터페이스끼리만 상속 가능!

public interface CartServiceV2 extends CartService{
	
	public void saveCartToFile();
	
	public void loadCartFromFile();
	
	

}
