package com.callor.oop.model;

/*
 * 카트 정보를 담아 App에서 사용할
 * Value Object 클래스
 * 구매자, 상품명, 규격, 날짜, 시각, 수량, 구매단가, 구매금액
 * 
 */
public class CartVO {
	
	private String UserName;
	private String productName;
	private String standard;
	private String date;
	private String intputTime;
	private int qty;
	private int price;
	private int total;
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getIntputTime() {
		return intputTime;
	}
	public void setIntputTime(String intputTime) {
		this.intputTime = intputTime;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "CartVO [UserName=" + UserName + ", productName=" + productName + ", standard=" + standard + ", date="
				+ date + ", intputTime=" + intputTime + ", qty=" + qty + ", price=" + price + ", total=" + total + "]";
	}
	
	
	
	
}
