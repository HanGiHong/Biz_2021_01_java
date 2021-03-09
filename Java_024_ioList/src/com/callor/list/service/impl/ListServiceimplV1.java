package com.callor.list.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.list.model.ListVO;
import com.callor.list.values.Values;

public class ListServiceimplV1 implements ListService{
	
	private String fileName;
	
	private List<ListVO> listlist;
	
	public ListServiceimplV1() {
		
		listlist = new ArrayList<ListVO>();
		
		fileName = "src/com/callor/list/매입매출데이터.txt";
	
		
	}
	
	public void loadListFromFile() {

		listlist.removeAll(listlist);
		
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
							
				
				String list[] = reader.split(":");
				
				ListVO vo =  new ListVO(list[0], 
						Integer.valueOf(list[1]),
						Integer.valueOf(list[2]),
						Integer.valueOf(list[3]),
						Integer.valueOf(list[4]),
						Integer.valueOf(list[5]));			
				
			}
			
			buffer.close();
			fileReader.close();
			
			
		} catch(FileNotFoundException e) {
			
			System.out.println("fileName + 파일이 없습니다");
			
		} catch(IOException e ) {
			
			e.printStackTrace();
			
		}System.out.println("파일을 읽는 동안 문제 발생");
		

	this.printList();
	
	
}
	

	private void printList() {
		
		System.out.println(Values.dLine);
		System.out.println("거래일자\t거래채\t상품이름\t매입금액\t판매금액");
		System.out.println(Values.sLine);
			
		for(ListVO vo : listlist) {
			System.out.print(vo.getNum1() + "\t");
			System.out.print(vo.getName2() + "\t");
			System.out.print(vo.getName3() + "\t");
			System.out.print(vo.getNum3() + "\t");
			System.out.print(vo.getNum4() + "\n");
			
		}
		System.out.println(Values.dLine);
		
		
	}
}