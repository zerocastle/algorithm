package ys.chapter06;

import java.util.Arrays;

/*
 * ��������
 */
public class ChoiceSort {

	public int[] array = { 1, 10, 5, 8, 7, 6, 4, 3, 2, 9 };

	public ChoiceSort() {
		// TODO Auto-generated constructor stub
		int i , j , min , index = 0, temp = 0;
		System.out.println("����");
		for(i = 0; i < array.length; i++) {
			min = 9999; // �迭 ���߿��� ���� ���� �����ڸ� ã�� ���ʴ�� �����ϱ� ���ؼ� ����ϱ� ���� min ������ ���� ū���� ���� �ִ´�.
			for(j = i; j < array.length; j++ ) {
				//���� ���ڴ�� ã�Ƽ� ������ �ϱ����� ��ġ 
				if(min > array[j]) {
					min = array[j]; // ���� ���� ���� ����ִ´�.
					index = j; // ���� ���� �ε��� ���� �־�ΰ� 
				}
			}
			// �������� ���ش�. 
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
