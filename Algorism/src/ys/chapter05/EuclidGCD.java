package ys.chapter05;

import java.util.Scanner;
/*재귀 함수를 통한 유클리드 호제 법*/

public class EuclidGCD {

	public static Scanner s = new Scanner(System.in);

	public EuclidGCD() {
		// TODO Auto-generated constructor stub

	}

	private boolean isError(int num1, int num2) {
		// TODO Auto-generated method stub

		if (num1 > num2)
			return true;
		else {
			System.out.println("첫번째 숫자가 크도록 숫자를 다시 입력 해주세요 ...");
			return false;
		}

	}

	private int empGcd(int num1, int num2) {

		int mok = 0;
		int nmg = 0;

		while (num2 != 0) {
			int r = num1 % num2;
			num1 = num2;
			num2 = r;
		}

		return num1;
	}

	private int gcd(int num1, int num2) {

		if (num2 == 0)
			return num1;
		else
			return gcd(num2, num1 % num2);

	}

	public static void main(String[] args) {
		EuclidGCD obj = new EuclidGCD();
		int num1, num2 = 0;

		do {
			System.out.println("첫번째 숫자를 입력하세요 : ");
			num1 = s.nextInt();
			System.out.println("두번째 숫자를 입력하세요 : ");
			num2 = s.nextInt();
		} while (obj.isError(num1, num2) == false);

		System.out.println("재귀를 통한 최대공약수 : " + obj.gcd(num1, num2) + "입니다.");
		System.out.println("일반 while 문을 통한 최대 공약수 : " + obj.empGcd(num1, num2) + "입니다.");

	}

}
