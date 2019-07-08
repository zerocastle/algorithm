package ys.chapter02;

import java.util.Arrays;
import java.util.Scanner;

/*진수 -> 기수 변화*/
public class ZeroCastle2 {

	static int change(char[] array, int num, int cno) {
		// TODO Auto-generated constructor stub
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int digi = 0;

		do {
			array[digi++] = dchar.charAt(num % cno);
			num = num / cno;
		} while (num != 0);
		System.out.println(Arrays.toString(array));
		return digi;
	}


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cno = 0; // 기수
		int num = 0; // 정수값
		int dno = 0; // 자릿수
		int retry = 0; // 다시한번 할까
		char[] array = new char[32]; // 변환 된값

		do {
			do {
				System.out.printf("정수값을 입력하세요 : ");
				num = s.nextInt();
			} while (num <= 0);
			do {
				System.out.printf("기수를 입력하세요 : ");
				cno = s.nextInt();
			} while (cno < 2 || cno > 36);
			dno = change(array, num, cno);
			System.out.println(dno);

			System.out.printf("10진수 %d를 %d 로 변환 \n ",num,cno);
			for(int i = dno - 1 ; i >=0; i--)
				System.out.printf("%2c",array[i]);
			System.out.println();
			
			System.out.println("넌 왜 안되니 ?" + Arrays.toString(array));

			System.out.println("다시 하겠니 ? 1 , 0");
			retry = s.nextInt();
		} while (retry != 0);

	}

}
