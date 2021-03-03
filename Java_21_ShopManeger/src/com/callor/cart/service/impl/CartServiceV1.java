package com.callor.cart.service.impl;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

import com.callor.cart.model.CartVO;

import com.callor.cart.service.CartService;

public class CartServiceV1 implements CartService {

	private List<CartVO> cartList; // CartVO에 있는 인스턴스 변수를 가져와서 리스트로 선언

	private Scanner scan; // 스캐너 선언

	public CartServiceV1() { // CartServiceV1매서드 생성

		cartList = new ArrayList<CartVO>(); // CartList,scan 값을 초기화

		scan = new Scanner(System.in);
	}

	public void inputCart() { // 1번을 입력했을 때 나오는 명령문으로 설정

		System.out.println("=============================");
		System.out.println("장바구니에 상품 추가");
		System.out.println("-----------------------------");

		System.out.print("구매자 이름 >> ");
		String struserName = scan.nextLine();

		System.out.print("상품명 이름 >> ");
		String strproName = scan.nextLine();

		int intQty = 0; // 수량을 입력하기전에 0으로 초기화

		while (true) { // while문을 만들어서 수량에 맞는 입력값

			System.out.print("수량 입력 >> ");

			String strQty = scan.nextLine();

			try {

				intQty = Integer.valueOf(strQty); // 문자열을 정수/ 실수를 정수로 바꿀때 Integer.valueOf() 사용

				if (intQty < 1) { // 수량이 1보다 작을경우 밑의 출력문 출력

					System.out.println("수량은 1 이상 입력해주세요.");

				} else { // 1보다 크다면 수량입력을 멈춰라.

					break;
				}

			} catch (Exception e) { // 입력을 숫자가 아닌 문자로 입력했을 경우 밑의 출력문 출력

				System.out.println("수량은 숫자로 입력해 주세요.");

			}

		}

		int intPrice = 0; // 단가를 입력하기전 0으로 초기화

		while (true) { // 반복문 선언

			System.out.print("단가 입력 >> ");

			String strPrice = scan.nextLine();

			try {

				intPrice = Integer.valueOf(strPrice);

				if (intPrice < 1) { // 단가가 1보다 작다면 밑의 출력문

					System.out.println("단가는 1개 이상 입력해주세요.");
				}

				else { // 단가가 1보다 크다면 단가입력을 멈춰라

					break;

				}

			} catch (Exception e) { // 수량과 마찬가지로 입력을 숫자가 아닌 문자로 입력했을 경우 밑의 출력문 출력

				System.out.println("단가는 숫자로만 입력해주세요.");

			}

		}

		CartVO cartVO = new CartVO(); // cartVO 클래스를 초기화
		cartVO.setUserName(struserName);// 새로만든 cartVO에 위에 입력했던 문자 및 정수를 저장을 해놓는다.
		cartVO.setProName(strproName);
		cartVO.setQty(intQty);
		cartVO.setPrice(intPrice);
		cartVO.setTotal(intPrice * intQty);
		cartList.add(cartVO);

	} // 1번을 입력했을 때 나오는 명령문 끝
	

	public void printCart() { // 2번을 입력했을 때 나오는 명령문 - 장바구니 전체리스트 보기 -

		int nSize = cartList.size();

		System.out.println("========================================================");
		System.out.println("구매자이름\t상품명\t수량\t단가\t금액");

		for (int i = 0; i < nSize; i++) {
			System.out.print(cartList.get(i).getUserName() + "\t\t");
			System.out.print(cartList.get(i).getProName() + "\t");
			System.out.print(cartList.get(i).getQty() + "\t");
			System.out.print(cartList.get(i).getPrice() + "\t");
			System.out.print(cartList.get(i).getTotal() + "\n");

		}
		System.out.println("========================================================");
	} // 2번을 입력했을 때 나오는 명령문 끝

	public void aprintCart() { // 3번을 입력했을 때 나오는 명령문 - 구매자별 장바구니 리스트 보기 -

		System.out.println("====================================");
		System.out.println("출력할 구매자 이름을 입력하세요");
		System.out.println("------------------------------------");

		System.out.println("구매자 이름 >> ");
		String name = scan.nextLine();

		System.out.println("*" + name + "의 장바구니 리스트"); //입력한 이름
		System.out.println("==================================");
		System.out.println("구매자이름\t상품명\t수량\t단가\t금액");
		System.out.println("-------------------------------------");

		int nSize = cartList.size();

	

		int i = 0; // 정수형 i를 0으로 초기화

		for (i = 0; i < nSize; i++) { // i가 nSize보다 작을경우 +1

			if (cartList.get(i).getUserName().equals(name)) {
				System.out.print(cartList.get(i).getUserName() + "\t");
				System.out.print(cartList.get(i).getProName() + "\t");
				System.out.print(cartList.get(i).getQty() + "\t");
				System.out.print(cartList.get(i).getPrice() + "\t");
				System.out.print(cartList.get(i).getTotal() + "\n");
		
			}


		}
	}// 3번을 입력했을 때 나오는 명령문 끝

}
