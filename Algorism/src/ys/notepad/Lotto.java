package ys.notepad;

import java.util.Arrays;
import java.util.Random;

enum Type {
	SUCCESS(true), FAIL(false);

	boolean type;

	Type(boolean type) {
		this.type = type;
	}

	private boolean getType() {
		// TODO Auto-generated method stub
		return this.type;
	}
}

public class Lotto {

	private static final double LOTTO_PERCENT = 0.0000122774;
	private Type type;

	// ���ڸ� �Ǵ��ϰ� isEuqalState �޼��尡 true�� ��ȯ�ϸ� ���ڸ� ��´�.
//	private int temp;
	// ��÷ ��ȣ�� ��� ��
	private int array[] = new int[6];

	private int counter = 0;

	public Lotto() {
		// TODO Auto-generated constructor stub
	}

	// �ζ� Ȯ���� �´� ���ڸ�
	private boolean isEqualState(int temp) {
		Random r = new Random();

		if (Math.random() < LOTTO_PERCENT) {
			System.out.println("Ȯ�� �� �ɷȽ��ϴ�." + temp + type.SUCCESS.type);
			return type.SUCCESS.type;

		} else {
			System.out.println("������ : " + temp + type.FAIL.type);
			return type.FAIL.type;
		}

	}

	// �ߺ��� �����ϱ� ����
	private boolean isSamSam(int[] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Random r = new Random();
		Lotto lotto = new Lotto();
		int temp = 0;

		while (true) {
			temp = (int) (Math.random() * 45) + 1;
			if (lotto.isEqualState(temp) == true) {
				System.out.println("�� ���� ������?" + lotto.isEqualState(temp));
				lotto.array[lotto.counter] = temp;
//				Arrays.sort(lotto.array);
				System.out.println("��÷ ���� : " + Arrays.toString(lotto.array));
				lotto.counter++;
			}
			if (lotto.counter == lotto.array.length) {
				break;
			}

		}

	}

}
