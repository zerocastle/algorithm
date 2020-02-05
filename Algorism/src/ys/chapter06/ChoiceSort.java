package ys.chapter06;

import java.util.Arrays;

/*
 * 선택정렬
 */
public class ChoiceSort {

	public int[] array = { 1, 10, 5, 8, 7, 6, 4, 3, 2, 9 };

	public ChoiceSort() {
		// TODO Auto-generated constructor stub
		int i , j , min , index = 0, temp = 0;
		System.out.println("실행");
		for(i = 0; i < array.length; i++) {
			min = 9999; // 배열 값중에서 가장 작은 수수자를 찾아 차례대로 정리하기 위해서 사용하기 위해 min 변수에 가장 큰값을 집어 넣는다.
			for(j = i; j < array.length; j++ ) {
				//작은 숫자대로 찾아서 정렬을 하기위한 장치 
				if(min > array[j]) {
					min = array[j]; // 값이 작은 것을 집어넣는다.
					index = j; // 값이 작은 인데스 값을 넣어두고 
				}
			}
			// 스와핑을 해준다. 
			temp = array[i];
			array[i] = array[index];
			array[index] = temp;
		}
		
		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {
		new ChoiceSort();
	}

}
