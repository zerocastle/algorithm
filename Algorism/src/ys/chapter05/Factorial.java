package ys.chapter05;

import java.util.Scanner;

/*
 * ��� �Լ� 
 */

public class Factorial {

	public static Scanner s = new Scanner(System.in);

	private int num = 0;

	static int factorial(int x) {
		
		System.out.println("�� ������...");
		if(x > 0) {
			System.out.println("x : " + x);
			return x * factorial(x - 1);
		}
		else {
			System.out.println("������ ������??" + x);
			return 1;
					
		}
	}

	public static void main(String[] args) {
		Factorial obj = new Factorial();
		System.out.println("�󸶿� ���ڸ� �Է� �ϼ��ھ��?");

		obj.num = s.nextInt();

		System.out.println("��� ���� : " + factorial(obj.num));

	}

}
