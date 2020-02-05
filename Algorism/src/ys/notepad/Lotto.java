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

	// 숫자를 판단하고 isEuqalState 메서드가 true로 반환하면 숫자를 담는다.
//	private int temp;
	// 당첨 번호를 담는 값
	private int array[] = new int[7];

	private int counter = 0;

	public Lotto() {
		// TODO Auto-generated constructor stub
	}

	// 로또 확률에 맞는 숫자면
	private boolean isEqualState(int temp) {
		Random r = new Random();

		if (Math.random() < LOTTO_PERCENT) {
			System.out.println("확률 에 걸렸습니다." + temp + type.SUCCESS.type);
			return type.SUCCESS.type;

		} else {
			System.out.println("나가리 : " + temp + type.FAIL.type);
			return type.FAIL.type;
		}

	}

	// 중복을 배제하기 위함
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
				System.out.println("넌 뭐가 찍히야?" + lotto.isEqualState(temp));
				lotto.array[lotto.counter] = temp;
				System.out.println("당첨 숫자 : " + Arrays.toString(lotto.array));
				lotto.counter++;
			}
			if (lotto.counter == lotto.array.length) {
				break;
			}

		}

	}

}
