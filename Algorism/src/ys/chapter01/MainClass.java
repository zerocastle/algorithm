package ys.chapter01;

import java.util.Scanner;

/*�߰� ũ�� ���� ���ϱ�*/
//decision tree
public class MainClass {

	private Scanner s = new Scanner(System.in);

	static int med3(int a, int b, int c) {

		if (a >= b) 
			if (b >= c)
				return b;
			else if(a <= c)
				return a;
			else
				return c;
		else if(a > c)
			return a;
		else if(b > c)
			return c;
		else
			return b;
	}

	public MainClass() {
		// TODO Auto-generated constructor stub
		System.out.println("�� ������ �߾� ���� ���մϴ�.");

		System.out.print("a �� �� : ");
		int a = s.nextInt();

		System.out.print("b �� �� : ");
		int b = s.nextInt();

		System.out.print("c �� �� : ");
		int c = s.nextInt();

		System.out.println("�߰��� ���� : " + MainClass.med3(a, b, c));

	}

	public static void main(String[] args) {
		new MainClass();
	}

}
