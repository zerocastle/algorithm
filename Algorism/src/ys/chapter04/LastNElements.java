package ys.chapter04;

import java.util.Scanner;

public class LastNElements {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		final int N = 10; // 최근 10개의 데이터만 버퍼에 담갰다.
		int[] array = new int[12];
		int cnt = 0;
		int retry = 0;

		System.out.println("정수를 입력하세요");
		do {
			System.out.printf("%d 번쨰 정수를 입력 하세요", (cnt + 1));
			array[cnt++ % array.length] = s.nextInt();

			System.out.println("계속 시도 하시겠습니까?");
			retry = s.nextInt();
		} while (retry == 1);

		for (int i = 0; i < N; i++) {
			System.out.printf("%d 들이 있다.", array[i]);
		}

	}

}
