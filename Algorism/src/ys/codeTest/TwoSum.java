package ys.codeTest;

import java.util.*;

/*
 * TwoSum
 * example)
 * 	
 * 	input : 	int[] nums = {2,8,10,21};
 * 				int target = 10;
 * 		
 *  output :	int[] = {1,2}
 *  
 *  solution)
 *  	배열중 target 10으로 잡았을때 10이 만들어지는 방번호 
 * 
 */

public class TwoSum {

	public static void main(String[] args) {

		TwoSum obj = new TwoSum();

		int[] nums = { 11, 2 , 8, 21 };

		int target = 10;

		int[] result = obj.solve(nums, target);

		System.out.println(Arrays.toString(result));
		
		System.out.println("test");

	}

	public int[] solve(int[] nums, int target) {
		// TODO Auto-generated method stub
		// 담을 그릇 선언을 해줘야줘
		Map<Integer, Integer> map = new HashMap<>();
		int[] array = new int[2];

		for (int i = 0; i < nums.length; i++) {

			if (map.containsKey(nums[i])) {
				array[0] = map.get(nums[i]) + 1;
				array[1] = i + 1;
			} else {
				map.put(target - nums[i], i);
			}

		}

		return array;

	}

}
