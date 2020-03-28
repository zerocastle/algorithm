package ys.codeTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAnagrams {
	
	public static void main(String[] args) {
		FindAnagrams a = new FindAnagrams();
		
		String txt = "BACDGABCDA";
		String pat = "ABCD";
		a.findAnagrams(txt, pat);
	}
	
	public List<Integer> findAnagrams(String txt , String pat){
		//1
		List<Integer> result = new ArrayList<Integer>();
		
		int [] patArr = new int[256];
		
		for(int i = 0; i < pat.length(); i++) {
			patArr[pat.charAt(i)]++;
			System.out.println(Arrays.toString(patArr));
		}
		
		
		return result;
	}

}
