package ys.chapter05;

import java.util.Scanner;

/*
 * 재귀 함수 
 */

public class Factorial {

	public static Scanner s = new Scanner(System.in);

	private int num = 0;

	static int factorial(int x) {
		
		System.out.println("나 실행함...");
		if(x > 0) {
			System.out.println("x : " + x);
			return x * factorial(x - 1);
		}
		else {
			System.out.println("나까지 찍히냐??" + x);
			return 1;
					
		}
	}

	public static void main(String[] args) {
		Factorial obj = new Factorial();
		System.out.println("얼마에 숫자를 입력 하세겠어요?");

		obj.num = s.nextInt();

		System.out.println("결과 값은 : " + factorial(obj.num));

	}

}
