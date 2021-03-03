/*
 * CartServiceV1 클래스에
 * cartList 객체를 인스턴스변수로 선언
 * 
 * inputCart()method 를 선언하고
 * 
 * 키보드에서 상품정보를 입력받은 후
 * cartList에 추가
 * 
 * 수량은 2 이상, 단가는1000원 이상만 가능
 * 
 * printCartList()method 를 선언하여
 * cartList를 console에 출력
 */
package com.callor.oop.controller;

/*
 * Controller 클래스
 * web application 프로젝트를 수행할 때
 * 처음 시작하는 시작점 클래스
 * 
 * Service 등 모듈클래스를 객체로 선언하고
 * 모듈클래스의 method 들을 호출하는 일만 수행
 */


import com.callor.oop.service.CartServiceV1;

public class CartControllerV5 {
	
	public static void main(String[] args) {
		
		
		CartServiceV1 csV1 = new CartServiceV1();
		
		csV1.inputCart();
		csV1.printCartList();
		
	}

}
