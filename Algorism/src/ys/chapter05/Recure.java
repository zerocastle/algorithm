package ys.chapter05;

import java.util.Scanner;

/*
 * ����Լ��� �м��ϴ� ��
 * 
 */

public class Recure {

	public static Scanner s = new Scanner(System.in);

	public Recure() {
		// TODO Auto-generated constructor stub
	}

	static void recure(int n) {
		if (n > 0) {
			recure(n - 2);
			System.out.println(n);
			recure(n - 1);
		}
	}

	public static void main(String[] args) {
		int n = 0;
		System.out.println("���ڸ� �Է� : ");

		n = s.nextInt();
		
		recure(n);

	}

}
