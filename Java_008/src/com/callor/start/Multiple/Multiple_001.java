package com.callor.start.Multiple;

public class Multiple_001 {

	public static void main(String[] args) {

		int intSum = 0;
		// 1 ~ 100까지 범위에서 찾아
		for (int i = 0; i < 100; i++) {

			int num1 = i + 1;
			boolean bYes3M = num1 % 3 == 0;
			boolean bYes9M = num1 % 9 == 0;

			// 3의 배수이면서 9의 배수
			if (bYes3M && bYes9M) {
				intSum += num1; // i를 더하지 않는다.
				System.out.println(num1 + " 는 3과 9의 배수");
			}
		}
		System.out.println("3과 9의 배수합 : " + intSum);
		System.out.println("============================");

		intSum = 0;
		for (int i = 0; i < 100; i++) {
			int num1 = i + 1;
			boolean bYes3M = num1 % 3 == 0;
			boolean bYes9M = num1 % 9 == 0;

			// if() 비교연산문을 중복처리하는 방식
			if (bYes3M) { // 3의 배수를 검사하고 맞으면
				if (bYes9M) { // 다시 9의 배수를 검사
					intSum += num1;
					System.out.println(num1);
				}
			}
		}
		System.out.println(intSum);
	}

}

// 1 ~ 100 까지 범위 수중에서
// 3의 배수이면서 9의 배수인 수들의 합을 구하시오.

//		int int3M = 0;
//		int int9M = 0; 
//		for(int i = 0 ; i < 100 ; i++) {
//			
//			int num1 = i + 3;
//			boolean bYes = num1 % 3 == 0;
//			if(bYes) {
//				int3M += num1;
//							}
//			
//		}
//			System.out.println("3의 배수의 합 = " + int3M);
//			
//			
//		    int i = 0 ;
//		   (int i = 0 ; i < 100 ; i++){
//			   
//		   
//		   int num2 = i + 9;
//		   boolean bYes2 = num2 % 9 == 0;
//		   if(bYes2) {
//			   int9M += num2;
//		   }
//		   }
//		   System.out.println("9의 배수의 합 = " + int9M);
//	}
//
// }
