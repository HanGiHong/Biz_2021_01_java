package com.callor.iolist.model;

/*
 * 거래일자[0], ioDate String
 * 상품명[4], ioPName String
 * 거래처명[5], ioDept String
 * 대표자명[6], ioDeptCeo String
 * 구분[7], ioInout : 1 == 매입, 2 == 매출, int
 * 매입단가[8], ioIprice : 합계를 계산해야할 데이터, int
 * 판매단가[9], ioOprice int
 * 수량[10], ioQty int
 * 
 */

public class IolistVO {

   private String ioDate;
   private String ioPName;
   private String ioDept;
   private String ioDeptCeo;

   private int inInout; // 구분
   private int ioIPrice; // 매입단가
   private int ioOPrice; // 판매단가
   private int ioQty;

   private int ioITotal; // 매입금액 : 매입단가 * 수량
   private int ioOTotal; // 판매금액 : 판매단가 * 수량

   /*
    * 기본 생성자 기본 생성자만 필요할 경우는 별도로 만들지 않아도 된다. 그런데 필드 생성자를 1개라도 만들면 기본 생성자도 반드시 만들어
    * 줘야 한다. 필드 생성자를 만들면 기본생성자가 자동으로 구현되지 않는다.
    * 
    * 
    * 필드 생성자만 있고 기본 생성자를 만들지 않으면 다음 코드에서 오류가 발생 Iolist ioVO = new IoList();
    * 
    */

   public IolistVO() {
      super();
      // TODO Auto-generated constructor stub
   }

   // 대표자명이 생략된 생성자
   public IolistVO(String ioDate, String inPName, String ioDept, int inInout, int ioIPrice, int ioOPrice, int ioQty) {
      super();
      this.ioDate = ioDate;
      this.ioPName = inPName;
      this.ioDept = ioDept;
      this.inInout = inInout;
      this.ioIPrice = ioIPrice;
      this.ioOPrice = ioOPrice;
      this.ioQty = ioQty;
   }

   // 전체 필드가 포함된 생성자
   public IolistVO(String ioDate, String inPName, String ioDept, String ioDeptCeo, int inInout, int ioIPrice,
         int ioOPrice, int ioQty) {
      super();
      this.ioDate = ioDate;
      this.ioPName = inPName;
      this.ioDept = ioDept;
      this.ioDeptCeo = ioDeptCeo;
      this.inInout = inInout;
      this.ioIPrice = ioIPrice;
      this.ioOPrice = ioOPrice;
      
      
      
      this.ioQty = ioQty;
   }

   public String getIoDate() {
      return ioDate;
   }

   public void setIoDate(String ioDate) {
      this.ioDate = ioDate;
   }

   public String getIoPName() {
      return ioPName;
   }

   public void setInPName(String ioPName) {
      this.ioPName = ioPName;
   }

   public String getIoDept() {
      return ioDept;
   }

   public void setIoDept(String ioDept) {
      this.ioDept = ioDept;
   }

   public String getIoDeptCeo() {
      return ioDeptCeo;
   }

   public void setIoDeptCeo(String ioDeptCeo) {
      this.ioDeptCeo = ioDeptCeo;
   }

   public int getInInout() {
      return inInout;
   }

   public void setInInout(int inInout) {
      this.inInout = inInout;
   }

   public int getIoIPrice() {
      return ioIPrice;
   }

   public void setIoIPrice(int ioIPrice) {
      this.ioIPrice = ioIPrice;
   }

   public int getIoOPrice() {
      return ioOPrice;
   }

   public void setIoOPrice(int ioOPrice) {
      this.ioOPrice = ioOPrice;
   }

   public int getIoQty() {
      return ioQty;
   }

   public void setIoQty(int ioQty) {
      this.ioQty = ioQty;
   }

   public int getIoITotal() {
      return ioITotal;
   }

   public void setIoITotal(int ioITotal) {
      this.ioITotal = ioITotal;
   }

   public int getIoOTotal() {
      return ioOTotal;
   }

   public void setIoOTotal(int ioOTotal) {
      this.ioOTotal = ioOTotal;
   }

   @Override
   public String toString() {
      return "IoListVO [ioDate=" + ioDate + ", inPName=" + ioPName + ", ioDept=" + ioDept + ", ioDeptCeo=" + ioDeptCeo
            + ", inInout=" + inInout + ", ioIPrice=" + ioIPrice + ", ioOPrice=" + ioOPrice + ", ioQty=" + ioQty
            + ", ioITotal=" + ioITotal + ", ioOTotal=" + ioOTotal + "]";
   }

}