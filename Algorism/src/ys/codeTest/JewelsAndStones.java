package ys.codeTest;

import java.util.HashSet;
import java.util.Set;

/*
 * input : 보석 : "aA" , 스톤 : "aAAbbb"
 * 
 * output : 3개
 * 
 * solution)
 * 
 * I can image
 * 
 * 1.보석은 대소문자를 구분하여 들고 있는다.
 * 2.aA -> 2개
 * 3.스톤에 가서 aA가 개별적으로 몇개를 들고 있는지 체크를 한다.
 * 
 * 
 */

public class JewelsAndStones {

	public static void main(String []args) {
		JewelsAndStones obj = new JewelsAndStones();
		String j = "aA";
		String s = "aAAbbb";
		System.out.println("보석에 갯수는 : " + obj.solve(j, s));
	}

	public int solve(String j, String s) {
		int counter = 0;
		Set set = new HashSet<Character>();

		for (char jc : j.toCharArray()) {
			set.add(jc);
		}

		for (char sc : s.toCharArray()) {
			if (set.contains(sc)) {
				counter++;
			}
		}

		return counter;
	}
}
