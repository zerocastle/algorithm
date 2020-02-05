package ys.notepad;

import java.util.Scanner;

public class AlClass {

	public static final char orderList[] = { 'a', 'b', 'c', 'd', 'f' };
	public static final Scanner s = new Scanner(System.in);

	public AlClass() {
		// TODO Auto-generated constructor stub
		int num = 0;
		char order;
		int jurdge;
		do {
			this.start();
			num = s.nextInt();
			if (num == 1) {
				System.out.println("�Է��� ��ɾ �־��ּ���");
				order = s.next().charAt(0);
				jurdge = this.errorCheck(order);
				if (jurdge == 0)
					this.error();
				else
					this.printStrat(order);
			}
		} while (num != 2);
	}

	public void start() {
		System.out.println("Leg's git it ~!!!");
		System.out.println("1.��ɾ� �Է� 2.����");
	}

	public int errorCheck(char order) {
		int f = 0;
		int s = 0;
		for (int i = 0; i < orderList.length; i++) {
			if (orderList[i] != order) {
				f = 1;
			} else
				s = 1;

		}

		if (s == 1 && f != 0)
			return 1;
		else
			return 0;
	}

	public void error() {
		System.out.println("�׷��� ��ɾ�� �����ϴ�.");
	}

	public void printStrat(char order) {
		int counter = 0;
		switch (order) {
		case 'a': {
			System.out.println("a�� ���� ��ɾ�� ");
			for (int i = 0; i < 6; i++) {
				System.out.printf("*");
				counter++;
			}
			System.out.println("���� : " + (counter));
		}
			break;
		case 'b': {
			System.out.println("a�� ���� ��ɾ�� ");
			for (int i = 0; i < 3; i++) {
				System.out.printf("*");
				counter++;
			}
			System.out.println("���� : " + (counter));
		}
			break;
		case 'c': {
			System.out.println("a�� ���� ��ɾ�� ");
			for (int i = 0; i < 5; i++) {
				System.out.printf("*");
				counter++;
			}
			System.out.println("���� : " + (counter));
		}
			break;
		default:
			break;
		}
	}

	public static void main(String[] args) {
		new AlClass();
	}

}
