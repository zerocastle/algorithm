package ys.codeTest;

import java.util.Arrays;
import java.util.Comparator;

/*
 * 
 * input [0,30],[5,10] ,[15,20] => false
 * 
 * input [7,10],[2,4] = > true
 * 
 * 첫번째 예시를 보면 처번째 회의실이 0 ~ 30분 그안에 회의실을 잡으면 => false
 * 두번째는 겹치지 않기에  = > true
 * 
 * solution ) 
 * 정력을 한뒤 첫번째 배역에 마지막 시간과 뒤에 오는 객체들의 앞에 시간을 비교
 */

class Interval {

	public int start;
	public int end;

	Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}
}

public class MeetingRooms {

	

	public static void main(String[] args) {

		MeetingRooms obj = new MeetingRooms();

		/*Interval inter1 = new Interval(0, 30);
		Interval inter2 = new Interval(5, 10);
		Interval inter3 = new Interval(15, 20);*/
		
		Interval inter1 = new Interval(7, 10);
		Interval inter2 = new Interval(2, 4);
		
		//Interval[] array = { inter1, inter2, inter3 };
		
		Interval[] array = {inter1 , inter2};
		
		// 1 정력을 한다.
		
		Arrays.sort(array, new Comparator<Interval>() {
			
			@Override
			public int compare(Interval o1, Interval o2) {
				// TODO Auto-generated method stub
				return o1.start - o2.start;
			}
			
		});
		
		obj.print(array,obj.solve(array));
	
	} 
	
	
	public boolean solve(Interval[] array) {
		
		if(array == null)
			return false;
		
		for(int i = 1; i < array.length; i++) {
			if(array[i - 1].end > array[i].start) {
				return false;
			}
		}
		
		return true;
	}
	
	

	public void print(Interval[] array , boolean solveResult) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].start + " " + array[i].end);

		}
		System.out.println(solveResult);
	}
}
