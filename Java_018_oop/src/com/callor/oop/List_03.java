package com.callor.oop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List_03 {

	public static void main(String[] args) {

		// java 프로젝트에서 List 객체를 생성하기
		// List 클래스를 사용하여 객체를 선언하고
		// ArrayList() 생성자를 호출하여
		// 객체를 초기화 한다.
		// 적극 권장하는 방법중 하나
		List<String> strList1 = new ArrayList<String>();
		
		List<Integer> intList;
		intList = new ArrayList<Integer>();
		intList = new LinkedList<Integer>();
		intList = new Vector<Integer>();
		
		ArrayList<Integer> intArrayList;
		intArrayList = new ArrayList<Integer>();
		//intArrayList = new LinkedList<Integer>();
		//intArrayList = new VectorList<Integer>();
	}

}
