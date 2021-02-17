package com.callor.applications;

import com.callor.applications.service.ScoreServiceV4;

public class Score_05 {

	public static void main(String[] args) {

		ScoreServiceV4 scServiceV4 = new ScoreServiceV4();
		
		scServiceV4.print(90, 83, 77);

		ScoreServiceV4 scV4 = new ScoreServiceV4();

		scV4.score(242, 80.66666F);

	}

}
