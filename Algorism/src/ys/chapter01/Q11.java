package ys.chapter01;

/*�ڸ��� ���ϱ�*/
import java.util.Scanner;

public class Q11 {

	private int num;
	private int counter = 0;
	public static Scanner s = new Scanner(System.in);
	public Q11() {
		// TODO Auto-generated constructor stub

		do {
			System.out.printf("���ڸ� �Է��ϼ��� (���� ���ڸ� �Է� ����)");
			num = s.nextInt();
		} while (num <= 0);
		
		for(int i = 1; i <= 100000; i = i * 10) {
			if((num / i ) >= 1) {
				counter ++;
			}else
				break;
		}
		
		System.out.println("�� ������ �ڸ����� : " + counter);

	}

	public static void main(String[] args) {
		new Q11();
	}

}
