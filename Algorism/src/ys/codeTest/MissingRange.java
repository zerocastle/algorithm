package ys.codeTest;

import java.util.ArrayList;
import java.util.List;

public class MissingRange {

	// output : [0->1,4,6->49,51->74,76->99]

	public static void main(String[] args) {
		int[] nums = { 2, 3, 5, 50, 75 };
		int lower = 0, upper = 99;

		System.out.println(solve(nums, lower, upper));

	}

	public static List<String> solve(int nums[], int lower, int upper) {

		List<String> result = new ArrayList<String>();

		// error check
		if (nums == null || nums.length == 0) {
			return result;
		}
		// 1 - 1
		if (lower < nums[0]) {
			result.add(makerRange(lower, nums[0] - 1));
		}

		// 1 - 2
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i] != nums[i + 1] && nums[i] + 1 < nums[i + 1]) {
				result.add(makerRange(nums[i] + 1, nums[i + 1] - 1));
			}
		}

		// 1 - 3
		if (nums[nums.length - 1] < upper) {
			result.add(makerRange(nums[nums.length - 1]+1, upper));
		}

		return result;

	}

	public static String makerRange(int lower, int high) {
		return lower == high ? String.valueOf(lower) : (lower + "->" + high);
	}

}
