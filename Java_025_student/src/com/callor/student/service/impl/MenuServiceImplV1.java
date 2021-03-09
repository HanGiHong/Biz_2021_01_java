package com.callor.student.service.impl;

import java.util.Scanner;

import com.callor.student.service.MenuService;
import com.callor.sutdent.values.Values;

public class MenuServiceImplV1 implements MenuService{
	
	
	public Integer selectMenu() {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println(Values.dLine(50));
			System.out.println("찾는 학생 이름을 입력하세요(종료하려면 QUIT를 입력");
			System.out.println(Values.sLine(50));
			System.out.println("이름 >> ");
			
			String menu = scan.nextLine();
			
			
			if(menu.equals("QUIT")) {
				break;
			}
			
			Integer intMenu = 0;
			
			try {
				intMenu = Integer.valueOf(menu);
		
			} catch (Exception e) {
				
				System.out.println("데이터가 없습니다.");
			}
			
		}
		
		return null;
		
	}
	
	
}
