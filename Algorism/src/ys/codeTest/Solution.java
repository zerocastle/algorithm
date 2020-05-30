package ys.codeTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

	/*
	 * 3,8,2,3,3,2 => 3
	 * 
	 * 7,1,2,8,2 => 2
	 * 
	 * 3,1,4,1,5 => 0
	 * 
	 * 5,5,5,5,5 => 5
	 */

	public static void main(String[] args) {
		//int[] array = { 3, 8, 2, 3, 3, 2 };
		//int [] array = {3, 1, 4, 1, 5};
		int [] array = {5,5,5,5,5};
		System.out.println("결과  : " + new Solution().solution(array));;
	}

	public int solution(int[] A) {
		// write your code in Java SE 8
		int result = 0;

		//Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Set<Integer> set = new HashSet<Integer>();

		List<Integer> list = new ArrayList<>();
		

		for (int i = 0; i < A.length; i++) {
			int a1 = A[i];
			for (int j = 0; j < A.length; j++) {

				if (i == j)
					continue;
				int a2 = A[j];
				if (a1 == a2) {
					System.out.println("중복 => " + i + ". " + a1);
					set.add(a1);
					list.add(a1);
					break;

				}

			}

		}
		
		Integer compareValue =Collections.max(set);
		System.out.println(compareValue);
		
		int signal = 0;
		
		for(int i = 0; i < A.length; i++) {
			
		/*	if(Collections.max(list) == compareValue)
				signal ++;*/
			
			if(A[i] < compareValue) 
				signal ++;
			else
				result = 0;
			if(signal >= 1) {
				result = compareValue;
			}
		}
		
		for(int i = 0; i < A.length; i++) {
			if(compareValue == A[i]) {
				signal++;
			}

		}
		if(signal == A.length) {
			result = compareValue;
		}
		
		
		
		return result;
	}

}
