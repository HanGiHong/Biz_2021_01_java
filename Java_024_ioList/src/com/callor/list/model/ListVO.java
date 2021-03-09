package com.callor.list.model;

public class ListVO {
	
	
	private int num1; //거래일자 1
	
	private String name1; //상품명 3
	private String name2; //거래처 명2
	private String name3; //대표자 명	
	
	private int num2; //구분
	private int num3; //매입단가 4
	private int num4; //판매단가 5
	private int num5; //수량 
	
	
	
	public ListVO(int num1, String name1, String name2, String name3,
			      int num2, int num3, int num4, int num5) {
		
		super();
		this.num1 = num1;
		this.name1 = name1;
		this.name2 = name2;
		this.name3 = name3;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
		this.num5 = num5;	
	}
	

	
	public ListVO(String string, Integer valueOf, Integer valueOf2, Integer valueOf3, Integer valueOf4,
			Integer valueOf5) {
		// TODO Auto-generated constructor stub
	}



	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public String getName3() {
		return name3;
	}
	public void setName3(String name3) {
		this.name3 = name3;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getNum3() {
		return num3;
	}
	public void setNum3(int num3) {
		this.num3 = num3;
	}
	public int getNum4() {
		return num4;
	}
	public void setNum4(int num4) {
		this.num4 = num4;
	}
	public int getNum5() {
		return num5;
	}
	public void setNum5(int num5) {
		this.num5 = num5;
	}
	@Override
	public String toString() {
		return "ListVO [num1=" + num1 + ", name1=" + name1 + ", name2=" + name2 + ", name3=" + name3 + ", num2=" + num2
				+ ", num3=" + num3 + ", num4=" + num4 + ", num5=" + num5 + "]";
	}
	
}
	
