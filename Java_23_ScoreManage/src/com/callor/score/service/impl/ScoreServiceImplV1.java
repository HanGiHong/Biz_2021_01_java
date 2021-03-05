package com.callor.score.service.impl;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService{
	
	protected List<ScoreVO> scoreList;
	
	public ScoreServiceImplV1() {
	scoreList = new ArrayList<ScoreVO>();
	}
	
	public void makeRnd() {
		Random rnd = new Random();
		for(int i = 0; i < 100; i++) {
			Integer num = rnd.nextInt(100) +1;
			scoreList.add(num);
		}
		
	}
	
	
	
	@Override
	public void makeScore() {
		
		FileWriter fileWriter = null;
		PrintWriter printer = null;
		
		
	}

	@Override
	public void saveScoreToFile() {
	
		
	}

	@Override
	public void loadScoreFromFile() {
		
		
	}

}
