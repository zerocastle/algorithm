package ys.chapter05;

import java.util.Scanner;

public class Main {

	public static final Scanner san = new Scanner(System.in);

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Main obj = new Main();
		int num = 0;
		System.out.println("숫자를 입력하세요 : ");

//		num = san.nextInt(5);
		System.out.println(obj.factoiralPrint(5));

	}

	public int factoiralPrint(int num) {

		if (num == 0)
			return 1;
		else
			return num * factoiralPrint(num - 1);
	}

}
