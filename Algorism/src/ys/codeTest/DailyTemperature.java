package ys.codeTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
 * problem)
 * => 배열들중에 다음 나오는 배열안에 값이 현재 값보다 클경우 그 인덱스를 뺀값을 구한다. 
 * 
 * solution) 
 * => for loop 를 돌면서 현재 인덱스에 있는 배열값과 next 하는 배열에 인덱스를 비교하는데 비교를 하기 위해서 담을공간이 
 * 필요하다 그것을 stack 자료 구조를 이용하여 도는 인데스에 번호를 현재 값보다 큰 값이 나올때까지 담아 꺼내어 비교한다.
 * 
 */

public class DailyTemperature {

	public static void main(String[] args) {
		int[] nums = { 73, 74, 75, 71, 69, 72, 76, 73 };

		int[] result = new DailyTemperature().solve(nums);

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i : result) {
			System.out.print(i + " ");

		}

	}

	public int[] solve(int[] nums) {

		int[] result = new int[nums.length];
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < nums.length; i++) {

			while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {

				int index = stack.pop();

				result[index] = i - index;

			}
			// 비교할 인덱스를 넣어준다.
			stack.push(i);
		}

		return result;

	}

}
