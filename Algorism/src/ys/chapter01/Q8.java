package ys.chapter01;

import java.util.Scanner;

/*���콺�� ����*/
public class Q8 {

	Scanner s = new Scanner(System.in);

	public Q8() {
		// TODO Auto-generated constructor stub
		System.out.println("1 ~ ����� ���� ���ڸ� ���ϳ���??");
		int n = s.nextInt();
		int sum = 0;
		int reuslt = 0;
		for (int i = 1; i <= n; i++) {
			sum += (i + ((n + 1) - i)); // (1 + 10) + (2 + 9) ...
		}
		System.out.println("sum : " + sum * n);
		System.out.println("result : " + (sum / 2));
	}

	public static void main(String[] args) {
		new Q8();
	}
}
