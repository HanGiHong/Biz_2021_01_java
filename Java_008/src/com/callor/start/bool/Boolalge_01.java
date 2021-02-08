package com.callor.start.bool;


/*
 * Boolean algebra
 * 
 * (3x * 3) + (4x * 2) + (5x* 3)
 * A          B          C
 * A + B + C
 * 
 */
public class Boolalge_01 {
	
	public static void main(String[] args) {
		
		boolean bYes = true;     //1
		boolean bNo = false;    //0
		
		// && : AND ( * 으로 생각하면 쉽다)
		System.out.println(bYes && bNo);
		
		// || : filter기호 or ( + 으로 생각하면 쉽다)
		System.out.println(bYes || bNo);
		
		//bYes1 or bYes2   = 1
		//1     +  0	   = 1
		//0     +  0       = 0
		//1     +  1       = 2(1이상은 무조건 true)
		
		// true or true   == true
		// true or false  == true
		// false or true  == true
		// false or false == false
		
		// 1    +   1    == 1
		// true And true == true
		
		// 1    *   0
		// true and false == false
		
		
		// 0    *    1
		// false and true == false
		
		// 0    *    0
		// false And false == false
		System.out.println("================================");
		System.out.println("t && t : " + (true && true));		
		System.out.println("t && t : " + (true && false));
		System.out.println("t && t : " + (false && true));
		System.out.println("t && t : " + (false && false));
		System.out.println("================================");
		System.out.println("t && t : " + (true || true));		
		System.out.println("t && t : " + (true || false));
		System.out.println("t && t : " + (false || true));
		System.out.println("t && t : " + (false || false));
		System.out.println("================================");
		System.out.println("true && true && true && true && true");
		}

}
