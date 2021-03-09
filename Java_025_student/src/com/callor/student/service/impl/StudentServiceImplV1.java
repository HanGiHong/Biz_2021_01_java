package com.callor.student.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.student.model.StudentVO;
import com.callor.student.service.StudentService;
import com.callor.sutdent.values.Valstlist;

public class StudentServiceImplV1 implements StudentService {
	
	
	private List<StudentVO> strList;
	
	private String fileName;
	
	public StudentServiceImplV1() {
			
		
		strList = new ArrayList<StudentVO>();
		
		fileName = "src/com/callor/student/학생정보리스트.txt";
		
	}
	
	public void loadDateFromFile() {
		
		String fileName = "src/com/callor/student/학생정보리스트.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			while(true) {
				
				String reader = buffer.readLine();
				
				if(reader == null) {
					break;
				}
				
				String[] StuDatas = reader.split(",");
				
				// 1 2 3 String
				// 4 1 2 5 6 3 7   
          
		StudentVO stuVO = new StudentVO(StuDatas[Valstlist.stNum4],
        		  Integer.valueOf(StuDatas[Valstlist.stNum1]),
        		  Integer.valueOf(StuDatas[Valstlist.stNum2]),
        		  StuDatas[Valstlist.stNum5],
        		  StuDatas[Valstlist.stNum6],
        		  Integer.valueOf(StuDatas[Valstlist.stNum3]),
        		  StuDatas[Valstlist.stNum7]
        				  
				);
        		   
          		strList.add(stuVO);
        		  		
			}
			
			buffer.close();
			fileReader.close();
			
			
	     }catch (FileNotFoundException e) {
	         System.out.println(fileName + "파일이 없음");

	      } catch (IOException e) {
	         System.out.println("파일을 읽는 도중 문제 발생!");
	      }
		
	} //loadDateFromFile end
	
	public void printList() {
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
	}

}
