package com.callor.score.service.impl;

import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.values.Values;
import com.callor.service.MenuService;

public class MenuServiceimplV1 implements MenuService {
	
	
	public Integer selectMenu() {
		
		Scanner scan = new Scanner(System.in);
		
		int intNum= 0;
		int intKor= 0;
		int intEng= 0;
		int intMath= 0;
		int intMusic= 0;
		
		while(true) {
			
			System.out.println(Values.dLine);
			System.out.println("학번 입력 >> ");
			System.out.println(Values.sLine);
			String strNum = scan.nextLine();
			try{
				intNum = Integer.valueOf(strNum);
				
				if (intNum < 0) {
					System.out.println("학번은 0001 이상 입력");
				}else {
					break;
				}
			}catch (Exception e) {
				
				System.out.println("학번은 숫자만 입력");
			}
			
			
			System.out.println(Values.dLine);
			System.out.println("국어점수 입력 >> ");
			System.out.println(Values.sLine);
			String strKor = scan.nextLine();
			try{
				intKor = Integer.valueOf(strKor);
				
				if (intKor < -1 && intKor < 101) {
					System.out.println("점수는 0점에서 100점내로 입력");
				}else {
					break;
				}
			}catch (Exception e) {
				
				System.out.println("점수는 숫자만 입력");
			}
			
			System.out.println(Values.dLine);
			System.out.println("영어점수 입력 >> ");
			System.out.println(Values.sLine);
			String strEng = scan.nextLine();
			try{
				intEng = Integer.valueOf(strEng);
				
				if (intEng < -1 && intEng < 101) {
					System.out.println("점수는 0점에서 100점내로 입력");
				}else {
					break;
				}
			}catch (Exception e) {
				
				System.out.println("점수는 숫자만 입력");
			}
			
			System.out.println(Values.dLine);
			System.out.println("수학 입력 >> ");
			System.out.println(Values.sLine);
			String strMath = scan.nextLine();
			try{
				intMath = Integer.valueOf(strMath);
				
				if (intMath < -1 && intMath < 101) {
					System.out.println("점수는 0점에서 100점내로 입력");
				}else {
					break;
				}
			}catch (Exception e) {
				
				System.out.println("점수는 숫자만 입력");
			}
			
			System.out.println(Values.dLine);
			System.out.println("음악 입력 >> ");
			System.out.println(Values.sLine);
			String strMusic = scan.nextLine();
			try{
				intMusic = Integer.valueOf(strMusic);
				
				if (intMusic < -1 && intMusic < 101) {
					System.out.println("점수는 0점에서 100점내로 입력");
				}else {
					break;
				}
			}catch (Exception e) {
				
				System.out.println("점수는 숫자만 입력");
			}
				
		}
		
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setStNum(strNum);
		scoreVO.setKor(strKor);
		scoreVO.setEng(strEng);
		scoreVO.setMath(strMath);
		scoreVO.setMusic(strMusic);
		
		ScoreList.add(scoreVO);
		
		
	}
	
	

}
