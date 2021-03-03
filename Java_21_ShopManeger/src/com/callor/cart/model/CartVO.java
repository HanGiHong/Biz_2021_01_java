// VO = 값, 오브젝트

//인스턴트 변수 선언

package com.callor.cart.model;

public class CartVO {
	
	//클래스 파일을 만들어서 각각의 
	
	private String userName; //손님이름 
	
	private String proName; //상품이름
	
	private String date; //추가날짜
	
	private String time; //추가시각
	
	private int Qty; //수량 (정수형)
	
	private int Price; //단가 (정수형)
	
	private int Total; //합계 (정수형)

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

	@Override
	public String toString() {
		return "CartVO [userName=" + userName + ", proName=" + proName + ", date=" + date + ", time=" + time + ", Qty="
				+ Qty + ", Price=" + Price + ", Total=" + Total + "]";
	}

}
