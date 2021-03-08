package com.callor.score;

import com.callor.score.service.MenuService;
import com.callor.score.service.ScoreService;
import com.callor.score.service.Impl.MenuServiceImplV1;
import com.callor.score.service.Impl.ScoreServiceImplV1;
import com.callor.score.values.Values;

public class Start {

	public static void main(String[] args) {

		MenuService mService = new MenuServiceImplV1();
		
		ScoreService sService = new ScoreServiceImplV1();

		while(true) {
			Integer menu = mService.selectMenu();

			if(menu == Values.MENU_QUIT) { //QUIT 입력시 콘솔 정지
				break;
				
			} else if (menu == Values.MENU_MAKE_RND) { // 정수 1 입력시 학생성적 점수 생성
				
				sService.makeScore();  //ScoreServiceV1클래스 내에 있는 makeScore 매서드 불러오기?
				
			} else if (menu == Values.MENU_SAVE_FILE) { //정수 2 입력시 학생성적 점수 파일에 저장
				
				sService.saveScoreToFile(); //ScoreServiceV1클래스 내에 있는 saveScoreToFile 불러오기
				
			} else if (menu == Values.MENU_LOAD_TO_FILE) { //정수 3 입력시 성적결과 확인
				
				sService.loadScoreFromFile(); //ScoreServiceV1 클래스 내에 있는 loadScoreFromFile 불러오기
				
			}

		}


	}// main end
	
}// class end