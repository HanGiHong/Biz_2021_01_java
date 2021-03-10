package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.values.Values;
import com.callor.service.ScoreService;

public class ScoreServiceimplV1 implements ScoreService {

	private List<String> scoreString;

	private List<ScoreVO> scoreList;

	private String fileName;
	

	public ScoreServiceimplV1() {

		scoreString = new ArrayList<String>();

		scoreList = new ArrayList<ScoreVO>();
			
		//입력값 저장소
		fileName = "src/com/callor/score/score/data/score.txt";

	}

	public void makeScore() { //점수입력 메서드

		scoreString = new ArrayList<String>();

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
					System.out.println("학번은 1 이상 입력");
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
		scoreVO.setStNum(intNum);
		scoreVO.setKor(intKor);
		scoreVO.setEng(intEng);
		scoreVO.setMath(intMath);
		scoreVO.setMusic(intMusic);
		
		scoreList.add(scoreVO);
		
		
		scoreString = new ArrayList<String>();
	}
		
		

	

	public void saveScoreToFile() { //입력값 저장 메서드

		FileWriter fileWriter;

		PrintWriter printWriter;

		try {

			fileWriter = new FileWriter(fileName);
			printWriter = new PrintWriter(fileWriter);

			int nsize = scoreList.size();
			for (int i = 0; i < nsize; i++) {
				ScoreVO scoreVO = scoreList.get(i);
				printWriter.print(scoreVO.getKor() + ":");
				printWriter.print(scoreVO.getEng() + ":");
				printWriter.print(scoreVO.getMath() + ":");
				printWriter.print(scoreVO.getMusic() + ":");

			}

			printWriter.close();

			fileWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		scoreString = new ArrayList<String>();

	}
	
	
	public void loadScoreFromfile() { //파일을 읽어서 출력하는 메서드
		
		scoreString = new ArrayList<String>();
		scoreList = new ArrayList<ScoreVO>();
		FileReader fileReader;
		BufferedReader buffer;

		// 파일을 읽어 들여서 '한줄씩' scoreString에 담기
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);

			while (true) {

				String str = buffer.readLine();

				if (str == null) {

					break;
				}

				scoreString.add(str);
			}

			buffer.close();
			fileReader.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}

		for (String str : scoreString) {
			String[] scores = str.split(":");
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setKor(Integer.valueOf(scores[0]));
			scoreVO.setEng(Integer.valueOf(scores[1]));
			scoreVO.setMath(Integer.valueOf(scores[2]));
			scoreVO.setMusic(Integer.valueOf(scores[3]));

			scoreList.add(scoreVO);
		}

	
		for (ScoreVO vo : scoreList) {
			int sum = vo.getKor();
			sum += vo.getEng();
			sum += vo.getMath();
			sum += vo.getMusic();

			float avg = (float) sum / 4; 

			vo.setTotal(sum); // 합계
			vo.setAvg(avg); // 평균
		}

		System.out.println(Values.dLine);
		System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");
		System.out.println(Values.sLine);

		int count = 0;
		for (ScoreVO vo : scoreList) {
			System.out.print(++count + "\t\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getMusic() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.print(vo.getAvg() + "\n");
		}

		System.out.println(Values.dLine);

		scoreString = new ArrayList<String>();
		scoreList = new ArrayList<ScoreVO>();

	}

	

	
}
	

