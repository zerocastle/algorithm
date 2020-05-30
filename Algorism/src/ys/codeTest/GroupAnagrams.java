package ys.codeTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 배열에 있는 문자열 값들을 sort 한뒤 key를 만들어 만들어놓은 담을것에 담아 반환한다.
 * 
 */

public class GroupAnagrams {

	public static void main(String[] args) {
		String[] input = { "eat", "tea", "tan", "ate", "nat", "bat" };

		System.out.println(solve(input));
	}

	public static List<List<String>> solve(String[] strs) {
		// TODO Auto-generated method stub
		// 1
		List<List<String>> result = new ArrayList<>();

		if (strs == null || strs.length == 0)
			return result;

		Map<String, List<String>> map = new HashMap();

		// 2
		for (String str : strs) {
			System.out.println("str : " + str);

			char[] charArray = str.toCharArray();
			Arrays.sort(charArray);
			String key = String.valueOf(charArray);
			System.out.println("key : " + key);
			System.out.println("===========");
			if (map.containsKey(key)) {
				map.get(key).add(str);
			} else {
				List<String> list = new ArrayList<String>();
				list.add(str);
				map.put(key, list);
			}

		}
		result.addAll(map.values());
		return result;

	}

}
