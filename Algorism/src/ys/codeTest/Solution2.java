package ys.codeTest;



public class Solution2 {

	//c = Example
	// s = John Doe
	// 다 로우
	
	//John Doe;
	
	//John Doe <doe_john@example.com>
	
	public static void main(String[] args) {
		Solution2 s = new Solution2();
		s.solution("John Doe;","Example");
	}
	
	public String solution(String S, String C) {
		// write your code in Java SE 8
		String s = S.toLowerCase();
		String c = C.toLowerCase();
		StringBuilder result = new StringBuilder();
	
		
		String head = S.substring(0,S.length() - 1);
		System.out.println(head);
		
		String[] str = s.split(" ");
		
		for(String t : str) {
			System.out.println(t);
		}
		String coll = str[1].substring(str[1].length() - 1);
		System.out.println(coll);
		
		result.append(head + " <" + str[1].substring(0,str[1].length() - 1) + "_" + str[0] + "@" + c + ".com>" + coll);
		System.out.println(result.toString());
		
		return result.toString();
	}
	
	public int count(String S) {
		String[] oo = S.split("\\;");
		for(String str : oo) {
			System.out.println(str);
		}
		
		return 0;
	}

}
