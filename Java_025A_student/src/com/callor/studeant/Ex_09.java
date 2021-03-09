package com.callor.studeant;

import java.util.ArrayList;
import java.util.List;

import com.callor.studeant.model.StudentVO;

public class Ex_09 {

	public static void main(String[] args) {
		
		List<StudentVO> stuList = null;
		
		stuList = new ArrayList<StudentVO>();
				
		for(int i = 0 ; i < 10 ; i++) {
					
			
			//오류가 안나도록 수정
			
			StudentVO stdVO = null;
			
			stdVO = new StudentVO();
			
			stdVO.setStName("홍길동");
			stdVO.setStNum("0001");
			stuList.add(stdVO);
		}
	}
}
