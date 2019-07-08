package ys.chapter03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraySearch {

	public ArraySearch() {
		// TODO Auto-generated constructor stub
	}

	static int search(int key, int[] array) {

		int j = 0;

		int findNum = 0;

		while (j < array.length) {
			if (array[j] == key) {
				findNum = j;
				break;
			} else {
				findNum = -1;
			}

			j++;

		}

		return findNum;
	}

	public static void main(String[] args) {
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		int num = 0;
		int key = 0;
		int[] array;

		System.out.println("몇 자리에배열을선언? ");
		num = s.nextInt();
		array = new int[num];

		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(50);
		}

		System.out.println("사전검사  : " + Arrays.toString(array));
		System.out.println("찾는 숫자를 입력학세요 : ");
		key = s.nextInt();
		int result = search(key, array);
		System.out.println("결과 : " + (result + 1) + "번쨰 있다.");

	}

}
