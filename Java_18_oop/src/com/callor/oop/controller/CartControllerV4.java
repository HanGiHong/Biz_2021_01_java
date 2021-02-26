/*
 * CartControllerV3를 복사
 * 
 * 수량은 1이상의 정수, 가격은 1000원 이상만 입력 가능하도록 유효성 검사 코드를 추가
 */
package com.callor.oop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartControllerV4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<CartVO> cartList = new ArrayList<CartVO>();

		for (int i = 0; i < 3; i++) {

			System.out.println("========================");
			System.out.println("쇼핑카트 상품추가");
			System.out.println("------------------------");

			System.out.print("구매자 >> ");
			String strUserName = scan.nextLine();

			System.out.print("상품명 >> ");
			String strPName = scan.nextLine();

			/*
			 * 데이터를 키보드에서 입력받는 부분과
			 * VO에 담아 리스트에 추가하는 부분을
			 * 분리하여 코딩할 경우
			 * 키보드에 입력한 값을 정수변환하여
			 * 값을 담아둘 intQty변수를
			 * while() 실행 이전에 선언해 두어야 한다.
			 */
			int intQty = 0;
			while(true) {
			System.out.print("수량 >> ");
			String strQty = scan.nextLine();
			intQty = Integer.valueOf(strQty);

			try {
				int intNum = Integer.valueOf(intQty);
				if (intNum < 1 ) {
					System.out.println("수량은 1 이상");
					continue;
				} 		
			} catch (Exception e) {
				System.out.println("숫자로 입력해 주세요");
			}
			break;
			}
			
					
			int intPrice = 0;
			while(true) {
							
			System.out.print("단가 >> ");
			String strPrice = scan.nextLine();
			intPrice = Integer.valueOf(strPrice);		
			try {
				int intNum = Integer.valueOf(intPrice);
				if (intNum < 1000) {
					
					System.out.println("단가는 1000원 이상 입력");
					continue;
				}
			
			} catch (Exception e) {
				System.out.println("숫자로 입력하세요");
			}break;
		}

		}
		System.out.println("========================================");
		System.out.println("구매자\t상품명\t단가\t수량");
		System.out.println("----------------------------------------");

		int nSize = cartList.size();
		for (int i = 0; i < nSize; i++) {
			System.out.printf("%s\t%s\t%d\t%d\n",
					cartList.get(i).getCartUserName(), 
					cartList.get(i).getCartPName(),
					cartList.get(i).getCartPrice(), 
					cartList.get(i).getCartQty());

		}	
		System.out.println("========================================");
	}
}