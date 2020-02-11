package ys.codeTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * mergeInterval
 * input : [1,3],[2,6],[8,10],[15,18]
 * 
 * output : [1,6],[8,10],[15,18]
 * 
 * solution)
 * 	=> 1. 먼저 객체 배열에 대한 정렬을 한다 2.before에 객체와 current(비교대상) 의 객체를 비교를 하는데 before.end >= current.start 일때 max(before.end , current.end) 를 넣어준다
 * 		
 */

class Interver {
	public int start;
	public int end;

	Interver() {
		this.start = 0;
		this.end = 0;
	}

	Interver(int start, int end) {
		this.start = start;
		this.end = end;
	}
}

public class MergerInterval {

	public static void main(String[] args) {
		ArrayList<Interver> list = new ArrayList<Interver>();
		MergerInterval obj = new MergerInterval();
		Interver inter1 = new Interver(1, 3);
		Interver inter2 = new Interver(2, 6);
		Interver inter3 = new Interver(8, 10);
		Interver inter4 = new Interver(15, 18);
		list.add(inter2);
		list.add(inter1);
		list.add(inter3);
		list.add(inter4);

		Collections.sort(list, (a, b) -> a.start - b.start);

		/*
		 * Collections.sort(list , new Comparator<Interver>() { public int
		 * compare(Interver o1, Interver o2) { return o1.start - o2.start; } });
		 */

		// obj.print(list);

		obj.print(obj.solve(list));

	}

	public ArrayList<Interver> solve(ArrayList<Interver> list) {

		ArrayList<Interver> result = new ArrayList<Interver>();

		Interver before = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			Interver current = list.get(i);
			if (before.end >= current.start) {

				int tempMax = Math.max(before.end, current.end);
				before.end = tempMax;

			} else {
				// before가 합쳐지니깐 before를 추가하는것을 만든다
				result.add(before);
				// 다음 비포와 커런트비교
				before = current;
			}

		}
		// 마지막 before에 들어간 값이 추가가 안되어 있기 때문에 마지막 forloop 끝나는 시점에 interval을 넣어준다.
		if(!result.contains(before)) {
			result.add(before);
		}

		return result;
	}

	public void print(ArrayList<Interver> list) {

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).start + " " + list.get(i).end);
		}

	}

}
