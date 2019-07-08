package ys.chapter03;

import java.util.Arrays;
import java.util.Scanner;

public class BineTest {
	// 바이너리 서치

	public BineTest() {
		// TODO Auto-generated constructor stub
	}

	static int binSearch(int[] array, int num, int index) {

		int pl = 0;
		int pr = num - 1;
		int pc = 0;

		do {
			pc = (pl + pr) / 2;
			if (array[pc] == index)
				return pc;
			else if (array[pc] < index) {
				pl = pc + 1;
			
			} else
				pr = pc - 1;

		} while (pl <= pr);
		
		

		return -1;

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int num = 0;
		int[] array = null;
		int index = 0;

		System.out.printf("요솟수를 입력하세요(오름차순으로) : ");
		num = s.nextInt();
		array = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.printf("요솟값 array[" + i + "] :");
			array[i] = s.nextInt();
			System.out.println();
		}

		System.out.printf("넣은 여석들 : " + Arrays.toString(array) + "\n");
		System.out.printf("찾고자 하는 수 : ");
		index = s.nextInt();
		int result = binSearch(array, num, index);
		if(result == -1) 
			System.out.println("그런 인덱스는 없습니다.");

		System.out.println("그녀석이 있는 곳 : array[" + result + "] 곳 입니다.");

	}

}
