package com.callor.score.model;

public class ScoreVO {
	
	private int stNum; //학번
	private int Kor;  //국어
	private int Eng; //영어
	private int Math; //수학
	private int Music; //음악
	
	private int total; //총점
	private float avg; //평균
	public int getStNum() {
		return stNum;
	}
	public void setStNum(int stNum) {
		this.stNum = stNum;
	}
	public int getKor() {
		return Kor;
	}
	public void setKor(int kor) {
		Kor = kor;
	}
	public int getEng() {
		return Eng;
	}
	public void setEng(int eng) {
		Eng = eng;
	}
	public int getMath() {
		return Math;
	}
	public void setMath(int math) {
		Math = math;
	}
	public int getMusic() {
		return Music;
	}
	public void setMusic(int music) {
		Music = music;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "ScoreVO [stNum=" + stNum + ", Kor=" + Kor + ", Eng=" + Eng + ", Math=" + Math + ", Music=" + Music
				+ ", total=" + total + ", avg=" + avg + "]";
	}
	
	
	
	
	
}
