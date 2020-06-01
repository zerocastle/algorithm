package ys.codeTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/*
 * ex ) input {3,2,1,5,6,4}
 * 		k = 2
 * 		output => 5
 * 
 * 		input {1,4,8,3,7}
 * 		output => 7
 * 
 */

public class Kth {

	public static void main(String[] args) {
		//int num[] = { 3, 2, 1, 5, 6, 4 };
		int num[] = {1,4,8,3,7};
		int k = 2;

		Kth obj = new Kth();

		System.out.println("solve1 =>" + obj.solve(num, k));
		System.out.println("solve2 =>" + obj.solve2(num, k));

	}

	private int solve(int[] nums, int k) {
		// TODO Auto-generated method stub
		int[] num = nums;
		int length = nums.length;

		Arrays.sort(num);

		return nums[length - k];

	}

	private int solve2(int nums[], int k) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<>(comp);

		for (int num : nums) {
			pq.offer(num);

			if (pq.size() > k) {
				pq.poll();
			}
		}

		return pq.peek();

	}

	Comparator<Integer> comp = new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o1 - o2;
		}
	};

}
