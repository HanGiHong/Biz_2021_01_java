/*
 * VO = 값 오브젝트
 * 
 * 인스턴스 변수 선언
 */


package com.callor.cart.model;

public class CartVO {

	private String userName;
	private String proName;
	private String date;
	private String time;
	private int Qty;
	private int Price;
	private int Total;

	//Alt + Shift + S
	//Generate Getter and Setter
	

	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getQty() {
		return Qty;
	}

	public void setQty(int qty) {
		Qty = qty;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public int getTotal() {
		return Total;
	}

	public void setTotal(int total) {
		Total = total;
	}
	
	
	//Alt + Shift + S
	//Generate toString()
	
	

	@Override
	
	public String toString() {
		return "CartVO [userName=" + userName + ", proName=" + proName + ", date=" + date + ", time=" + time + ", Qty="
				+ Qty + ", Price=" + Price + ", Total=" + Total + "]";
	}

}
