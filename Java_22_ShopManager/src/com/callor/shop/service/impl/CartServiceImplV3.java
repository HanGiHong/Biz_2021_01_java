package com.callor.shop.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.CartVO;
import com.callor.shop.service.CartServiceV2;

public class CartServiceImplV3 extends CartServiceImplV1
implements CartServiceV2{
	
	
	
	private Scanner scan;
	private List<CartVO> cartList;
	private String cartFileName;


	
	@Override
	public void saveCartToFile() {
		
		FileWriter fileWriter = null;
		PrintWriter printer = null;
		
		try {
			fileWriter = new FileWriter(cartFileName);
			printer = new PrintWriter(fileWriter);
			
			printer.println("대한민국");
			printer.println("우리나라");
			printer.println("Republic Of Korea");
			
			printer.close();
			fileWriter.close();
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	
	@Override
	public void loadCartFromFile() {
		// TODO Auto-generated method stub
		
	}

}
