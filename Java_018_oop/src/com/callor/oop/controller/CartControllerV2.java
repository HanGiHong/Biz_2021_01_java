package com.callor.oop.controller;

import com.callor.oop.model.CartVO;

/*
 * CartVO 클래스를 사용하여 객체배열 3개선언
 * 객체배열 3개에 임의의 카트정보를 저장
 * 저장된 카트정보를 리스트로 출력
 */
public class CartControllerV2 {

	public static void main(String[] args) {

		CartVO[] cartVO = new CartVO[3];
		
		cartVO[0] = new CartVO();
		cartVO[0].setCartUserName("홍길동");
		cartVO[0].setCartPName("초코파이");
		cartVO[0].setCartDate("100");
		cartVO[0].setCartStd("50");
		
		cartVO[1] = new CartVO();
		cartVO[1].setCartUserName("홍길동");
		cartVO[1].setCartPName("칠성사이다");
		cartVO[1].setCartDate("100");
		cartVO[1].setCartStd("50");

		cartVO[2] = new CartVO();
		cartVO[2].setCartUserName("홍길동");
		cartVO[2].setCartPName("신라면");
		cartVO[2].setCartDate("300");
		cartVO[2].setCartStd("20");
		
		
		System.out.println(cartVO[2].toString());
		
	// cartVO의 개수가 3인 상태
		// 상품 한가지를 더 카트에 넣고 싶다
		cartVO = new CartVO[4];
		
		cartVO[3] = new CartVO();
		cartVO[3].setCartUserName("ghdrlfehd");
		cartVO[3].setCartPName("딸기우유");
		
		System.out.println("=========================");
		System.out.println("카트 내용");
		System.out.println("-------------------------");
		
		for(int i = 0 ; i < cartVO.length ; i++) {
			System.out.println(cartVO[i].toString());
			
		}
		
		
		
	

	}

}
