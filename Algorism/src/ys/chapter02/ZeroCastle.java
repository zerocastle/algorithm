package ys.chapter02;

import java.util.Arrays;
import java.util.Scanner;

public class ZeroCastle {
	
	public static Scanner s = new Scanner(System.in);
	
//	public int[] array = new int[5];
	
	public int[] array = {10,7,4,8,1,6};
	
	public ZeroCastle() {
		// TODO Auto-generated constructor stub
		System.out.println("정렬 하기전 : " + Arrays.toString(this.array));
		
		System.out.println("정렬 해라 : " + Arrays.toString(this.reverse(array)));
		
	}
	
	public int[] reverse(int[] array) {
		
//		int[]changeArray = new int[6];
		int vmc = array.length / 2;
		int temp = 0;
		for(int i = 0; i < vmc; i++) {
			temp = array[i];
			array[i] = array[array.length - i -1];
			array[array.length - i -1] = temp;
		}
		
		return array;
		
	}
	
	
	
	public static void main(String[] args) {
		
		new ZeroCastle();
	}

}
