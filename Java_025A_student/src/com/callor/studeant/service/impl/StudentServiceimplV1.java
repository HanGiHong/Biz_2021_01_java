package com.callor.studeant.service.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.callor.studeant.model.StudentVO;
import com.callor.studeant.service.StudentService;

public class StudentServiceimplV1 implements StudentService{
	
	private List<StudentVO> stdList;
	public StudentServiceimplV1() {
		stdList = new ArrayList<StudentVO>();
	}

	@Override
	public void loadStudentFromFile() {
		
		String fileName = "src/com/callor/studeant/학생정보리스트.txt";
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
	
		
		
		
		
	}

	@Override
	public void searchStudent() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
