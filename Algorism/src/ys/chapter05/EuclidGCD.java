package ys.chapter05;

import java.util.Scanner;
/*��� �Լ��� ���� ��Ŭ���� ȣ�� ��*/

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
			System.out.println("ù��° ���ڰ� ũ���� ���ڸ� �ٽ� �Է� ���ּ��� ...");
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
			System.out.println("ù��° ���ڸ� �Է��ϼ��� : ");
			num1 = s.nextInt();
			System.out.println("�ι�° ���ڸ� �Է��ϼ��� : ");
			num2 = s.nextInt();
		} while (obj.isError(num1, num2) == false);

		System.out.println("��͸� ���� �ִ����� : " + obj.gcd(num1, num2) + "�Դϴ�.");
		System.out.println("�Ϲ� while ���� ���� �ִ� ����� : " + obj.empGcd(num1, num2) + "�Դϴ�.");

	}

}
