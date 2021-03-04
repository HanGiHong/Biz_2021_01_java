package com.callor.shop.service;

import com.callor.shop.values.Values;

public interface CartService {
	
	public void inputCart(); //시스템에서 사용
	
	
	
	public void printAllCart(); //관리자용
	
	
		
	
	public void printUserCart(); //일반사용자용



	public void loadCartFromFile();
	
	

}
