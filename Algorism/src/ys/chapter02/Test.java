package ys.chapter02;

import java.util.Arrays;

public class Test {
	
	public Test() {
		// TODO Auto-generated constructor stub
	}
	
	static void test(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i] = i;
		}
	}
	
	public static void test2(int[] array) {
		System.out.println("다신 변환");
		for(int i = 0; i < array.length; i++) {
			array[i] = 0;
		}
	}
	
	public static void main(String[] args) {
		int []array = new int[5];
		
		System.out.println("변하기전 : " + Arrays.toString(array));
		
		test(array);
		
		System.out.println("뭐가 찍히냐?" + Arrays.toString(array));
		
		test2(array);
		System.out.println("마지막 : " + Arrays.toString(array));
	}

}
