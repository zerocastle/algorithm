package ys.codeTest;

import java.util.Arrays;

public class PlusOne {
	
	public static void main(String[] args) {
		//int [] array = {1,2,3};
		
		int [] array = {9,9,9};
		
		int [] result = plusOne(array);
		
		for(int i : result) {
			System.out.println(i);
		}
	}
	
	public static int[] plusOne(int [] digiths) {
		for(int i = digiths.length - 1 ; i >= 0; i--) {
			if(digiths[i] != 9) {
				digiths[i]++;
				break;
			}else {
				digiths[i] = 0;
			}
		}
		
		if(digiths[0] == 0) { 
			int []result = new int[digiths.length + 1];
			
			result[0] = 1;
			
			return result; 
		}
		
		return digiths;
	}

}
