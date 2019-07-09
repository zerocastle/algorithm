package ys.chapter03;

import java.util.Arrays;
import java.util.Scanner;

public class BinerySearchAPI {

	public BinerySearchAPI() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = 0;
		int array[] = null;

		System.out.println("요솟수를 입력하세요");
		num = s.nextInt();
		array = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.printf("array[" + i + "] = > " );
			array[i] = s.nextInt();
			System.out.println("");
		}
		
		int index  = Arrays.binarySearch(array, 2);
		
		System.out.println(" 결과  : " + index);

	}

}
