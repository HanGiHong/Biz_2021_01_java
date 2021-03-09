package com.callor.student.model;

public class StudentVO {

	private String stNum1; // 학생이름
	private String stNum2; // 학과
	private String stNum3; // 주소

	private int stNum4; // 학번
	private int stNum5; // 학년
	private int stNum6; // 반
	private int stNum7; // 전화번호

	// 4 1 2 5 6 3 7

	public StudentVO(String stDatas, Integer integer, Integer integer2, String stDatas2, String stDatas3,
			Integer integer3, String stDatas4) {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentVO(String stNum1, String stNum2, String stNum3, int stNum4, int stNum5, int stNum6, int stNum7) {
		super();
		this.stNum1 = stNum1;
		this.stNum2 = stNum2;
		this.stNum3 = stNum3;
		this.stNum4 = stNum4;
		this.stNum5 = stNum5;
		this.stNum6 = stNum6;
		this.stNum7 = stNum7;
	}

	public String getStNum1() {
		return stNum1;
	}

	public void setStNum1(String stNum1) {
		this.stNum1 = stNum1;
	}

	public String getStNum2() {
		return stNum2;
	}

	public void setStNum2(String stNum2) {
		this.stNum2 = stNum2;
	}

	public String getStNum3() {
		return stNum3;
	}

	public void setStNum3(String stNum3) {
		this.stNum3 = stNum3;
	}

	public int getStNum4() {
		return stNum4;
	}

	public void setStNum4(int stNum4) {
		this.stNum4 = stNum4;
	}

	public int getStNum5() {
		return stNum5;
	}

	public void setStNum5(int stNum5) {
		this.stNum5 = stNum5;
	}

	public int getStNum6() {
		return stNum6;
	}

	public void setStNum6(int stNum6) {
		this.stNum6 = stNum6;
	}

	public int getStNum7() {
		return stNum7;
	}

	public void setStNum7(int stNum7) {
		this.stNum7 = stNum7;
	}

	@Override
	public String toString() {
		return "StudentVO [stNum1=" + stNum1 + ", stNum2=" + stNum2 + ", stNum3=" + stNum3 + ", stNum4=" + stNum4
				+ ", stNum5=" + stNum5 + ", stNum6=" + stNum6 + ", stNum7=" + stNum7 + "]";
	}

}
