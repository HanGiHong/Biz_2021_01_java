package com.callor.oop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartServiceV1 {
	
	/*
	 * Service 클래스
	 * main()method 에서 구현한 코드들을
	 * 별도의 클래스로 분리하고
	 * 작은 method 단위로 코드를 작성하여
	 * 전체적으로 단위코드가 작아지도록 하기 위한 기법
	 * 이후에 유지보수(업그레이드 및 오류정정)를 유리하게 하기 위한 방법
	 */
	private Scanner scan = new Scanner(System.in);
	/*
	 * inputCart() method에서 계속 사용할
	 * 키보드 입력을 처리할 Scanner를
	 * 인스턴스 영역으로 이동
	 * 인스턴스 영역에 선언된 객체들은 특별한 경우가 아니면
	 * private으로 일단 선언
	 */
	
	private List<CartVO> cartList = new ArrayList<CartVO>();;
	
	private CartVO cartVO;

	/*
	 * 사용자로부터 키보드로 상품정보를 입력받아 
	 * 카트리스트에 추가코드
	 */
	public void inputCart() {
		
		// cartVO 불러오기
		this.cartVO = new CartVO();
		
		//Scanner 선언
		//Scanner scan = new Scanner(System.in);

		/*
		 * Scanner. File Network 이러한 클래스들은
		 * 운영체와 연동하여 컴퓨터 자체의 자원(Resouce)을
		 * 사용하게 된다.
		 * 컴퓨터 자체의 자원(Resouce)는 유한하다.
		 * 때문에 자원은 무턱대고 열고 사용한 해서는 안된다.
		 * 자원을 사용하기 위해서 선언을 한 후
		 * 사용이 끝나면 반드시 반납(close)해 줘야 한다.
		 * 그래야만 Application이 실행되는 과정에서
		 * 자원의 누수(leak)가 발생하지 않는다.
		 * 
		 * 여기(inputCart() method)는 
		 * 사용방법에 따라서 수회 반복적으로 호출이 될 것이다.
		 * 수회 반복적으로 호출되는 동안에
		 * Scanner가 열리고(연결) 닫히는 과정이 계속 반복된다.
		 * Resouce를 열고, 닫는 과정은 실제 컴퓨터, 운영체제, 어플리케이션
		 * 입장에서는 상당히 많은 일을 수행해야 한다.
		 * 
		 * 이러한 과정은 어플리케이션의 성능을 저하시키는
		 * 중대한 원인이 될 수 있다.
		 * 
		 * 그래서 
		 * Scanner 를 method() 내부에서 선언하지 않고
		 * 클래스의 인스턴스 영역으로 보낸다.
		 */
		System.out.println("======================");
		System.out.println("상품정보 입력");
		System.out.println("----------------------");

		// 상품정보 입력
		System.out.print("이름>> ");
		String strUserName = scan.nextLine();

		System.out.print("상품명>> ");
		String strPName = scan.nextLine();

		//반복문 선언
		int intQty = 0;
		while (true) {
			System.out.print("수량>> ");
			String strQty = scan.nextLine();
			try {
				intQty = Integer.valueOf(strQty);
				if (intQty < 2) {
					System.out.println("수량는 2이상");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("수량는 숫자로 입력해주세요");
			}
		} // while end

		
		int intPrice = 0;
		while (true) {
			System.out.print("단가>> ");
			String strPrice = scan.nextLine();
			try {
				intPrice = Integer.valueOf(strPrice);
				if (intPrice < 1000) {
					System.out.println("단가는 1000이상!!");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("단가는 숫자로 입력해주세요!!");
			}
		} // while end

		// 카트정보 생성
		cartVO.setCartUserName(strUserName);
		cartVO.setCartPName(strPName);
		cartVO.setCartQty(intQty);
		cartVO.setCartPrice(intPrice);

		// 카트정보 리스트에 추가하기
		cartList.add(cartVO);
	}// inputCart end

	public void printCartList() {
		// 상품정보 출력
		int size = cartList.size();
		for (int i = 0; i < size; i++) {
			System.out.println("\n=====================================");
			System.out.println("\t상품정보");
			System.out.println("-------------------------------------");
			System.out.println("이름\t상품명\t수량\t단가");
			System.out.printf("%s\t%s\t%d\t%d\n",
					cartList.get(i).getCartUserName(), 
					cartList.get(i).getCartPName(),
					cartList.get(i).getCartQty(),
					cartList.get(i).getCartPrice());
			System.out.println("=====================================");
		} // for end
	}// printCartList end

}// class end