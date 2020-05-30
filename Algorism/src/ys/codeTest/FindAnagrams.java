package ys.codeTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAnagrams {
	
	public static void main(String[] args) {
		FindAnagrams a = new FindAnagrams();
		
		String txt = "BACDGABCDA";
		String pat = "ABCD";
		
		
		System.out.println(a.findAnagrams(txt, pat));
	}
	
	public List<Integer> findAnagrams(String txt , String pat){
		//1
		List<Integer> result = new ArrayList<Integer>(); 
		
		if(txt == null || txt.length() == 0 || pat == null || pat.length() == 0)
			return result;
		
		int [] patArr = new int[256];
		
		for(int i = 0; i < pat.length(); i++) {
			patArr[pat.charAt(i)]++;
			//System.out.println(Arrays.toString(patArr));
		}
		
		for(int i = 0; i < txt.length() - pat.length() + 1; i++) {
			int []txtArr = new int[256];
			for(int j = 0; j <pat.length(); j++) {
				System.out.println(txtArr[txt.charAt(i + j)] ++); // 0+ 1+
				System.out.println(Arrays.toString(patArr));
			}
			
			if(check(patArr , txtArr)) {
				result.add(i);
			}
		}
		
		
		return result;
	}
	
	private boolean check(int[] patArr , int[] txtArr) {
		
		for(int i = 0; i < patArr.length; i++) {
			if(patArr[i] != txtArr[i]) {
				return false;
			}
				
		}
		return true;
	}

}
