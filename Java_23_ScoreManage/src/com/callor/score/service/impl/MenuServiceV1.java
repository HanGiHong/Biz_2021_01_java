package com.callor.score.service.impl;

import java.util.Scanner;

import com.callor.score.service.MenuService;

public class MenuServiceV1 implements MenuService {
	
	private Scanner scan;
	  
	public MenuServiceV1() {
		
		scan = new Scanner(System.in);
		
	}

	public Integer Menu() {
		
		while(true) {
			
			System.out.println("==========================");
			System.out.println("빛나라 고교 성적처리 시스템");
			System.out.println("---------------------------");
			System.out.println("1 : 학생성적 점수 생성");
			System.out.println("2 : 학생성적 점수 파일에 저장");
			System.out.println("3 : 성적 결과 확인");
			System.out.println("QUIT : 끝내기");
			System.out.println("=============================");
			System.out.print("선택 >> ");
				
			String strMenu = scan.nextLine();
			
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

	@Override
	public Integer selectMenu() {
		// TODO Auto-generated method stub
		return null;
	}

}
			
			
	