package ys.codeTest;

import java.util.Arrays;

/*
 * 배역 num을 감안할 때 0이 아닌 요소의 상대적인 수서를 유지하면서 0을 맨끝으로 이동
 * ex)
 * 		input => [0,3,2,0,8,5]
 * 		output => [3,2,8,5,0,0]
 * 
 * solution ) index를 선언 0이 아닌 값을 왼쪽으로 밀어넣은뒤 인덱스를 증가 그리고 나머지를 0으로 채운다.
 */

public class MoveZeros {
	
	public static int []ARRAY = {0,3,2,0,8,5};
	
	public static void main(String[] args) {
		MoveZeros obj = new MoveZeros();
		obj.solve(ARRAY);
		
	}
	
	public void solve(int []ARRAY) {
		
		int index = 0;
		int nmg = 0;
		for(int i = 0; i < ARRAY.length; i++) {
			if(ARRAY[i] != 0) {
				ARRAY[index] = ARRAY[i];
				index++;
			}
		}
		nmg = ARRAY.length - index;
		
		for(int i = index; i < ARRAY.length; i++) {
			ARRAY[i] = 0;
		}
		
		print();
		
	}
	
	public void print() {
		
		System.out.println(Arrays.toString(ARRAY));
	}

}
