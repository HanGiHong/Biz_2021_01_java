package com.callor.start.loop;

public class Loop_02 {

	public static void main(String atgs[]) {

		// i = index의 약자
		for (int i = 0; i < 10; i += 1) {

			int num = 0;
			num = num + 1;
			num += 1;
			num = +1; // 이 코드는 사용하지 말 것
			num++; // num변수를 1증가 시켜라
			++num; // 단항연산자

			num = num - 1;
			num -= 1;
			num--;
			--num;
			// 시작값 지정
			// 몇번 반복되는지 결정할 비교문
			// i 라는 값을 어떻게 바꿀것인가
			// 증가값은 1씩 증가하는것을 기본으로 하자
			for (int I = 0; i < 10; i++) {
			}
			// i값이 100부터 시작하여 i < 0 까지
			// 1씩 감소하면서 반복한다.
			for (int I = 100; i > 0; i--) {

			}

			System.out.println(i);
			{

			}

		}

	}
}
