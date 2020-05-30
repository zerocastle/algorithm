package ys.codeTest;
/*
 * input : points = [[1,3],[-2,2]], k = 1
 * ouput : [[-2,2]]
 * 
 * 
 * @solution)
 * 
 */

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class KClosest {

	public static void main(String[] args) {
		String[] input = { "test.email+james@coding.com", "test.e.mail+toto.jane@coding.com",
				"testemail+tom@cod.ing.com" };
		KClosest obj = new KClosest();
		System.out.println(obj.solve(input));

	}

	public int solve(String[] input) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();

		for (String str : input) {
			String connect = "";
			connect += this.makeLocal(str);
			connect += "@"+this.domain(str);
			
			
			set.add(connect);
		}
		
		System.out.println(set.toString() + "\n");

		return set.size();

	}

	private String makeLocal(String str) {
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '.') {
				continue;
			}
			if(str.charAt(i) == '+' || str.charAt(i) =='@') {
				break;
			}
			sb.append(str.charAt(i));
		}

		System.out.println(sb.toString());
		return sb.toString();

	}

	private String domain(String str) {
		
		
		
		return str.substring(str.indexOf("@") + 1);
	}

}
