package com.callor.cart.service.impl;

import java.util.Scanner;

import com.callor.cart.service.MenuService;

public class MenuServiceV1 implements MenuService {

	private Scanner scan;

	public MenuServiceV1() {

		scan = new Scanner(System.in);

	}

	public Integer Menu() { // 콘솔키를 눌렀을때 나오는 리스트(출력문)

		while (true) { // 반복문 선언
			System.out.println("==========================");
			System.out.println("빛나라 쇼핑몰 2021");
			System.out.println("---------------------------");
			System.out.println("1 : 장바구니 상품담기");
			System.out.println("2 : 장바구니 전체 리스트 보기");
			System.out.println("3 : 구매자별 장바구니 리스트 보기");
			System.out.println("QUIT : 끝내기");
			System.out.println("=============================");
			System.out.print("입력하세요 >> ");

			String strMenu = scan.nextLine(); // 입력문

			if (strMenu.equals("QUIT")) { // QUIT 를 입력시 콘솔기능 종료
				break;
			}
			try { // 정수 1 ~ 3을 입력했을시 기능을 수행
					// 만약 0 및 음수를 입력하거나 문자를 입력했을시 아래의 출력문을 출력

				Integer intMenu = Integer.valueOf(strMenu);

				if (intMenu >= 1 && intMenu <= 3) {

					return intMenu; // 밑의 출력문을 출력하고 다시 리턴

				} else {

					System.out.println("메뉴는 1 ~ 3 까지 선택해주세요.");

				}

			} catch (Exception e) { // 정수나 문자를 입력했을 경우 Exception을 밑의 출력문으로 전환

				System.out.println(" 메뉴선택은 Quit, 혹은 1 ~ 3까지 정수만 입력해주세요");

			}
		}

		return null; // 입력해놓은 객체가 없을경우 다시 리턴
	}

}
