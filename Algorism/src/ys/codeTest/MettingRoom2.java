package ys.codeTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * problemn) 서로 겹치는 시간데를 비교 겹치는 갯수 즉 예약 방에 갯수를 구하는 문제
 * [0,30],[5,10] ,[15,20]
 * solution) 1. 소팅 -> 2.PriorityQueue 를 이용 (end time을 비교하여 우선순위를 스왑한다 -> 3. End <= start 합치기
 * 
 */

class Room {

	int start;
	int end;

	Room() {

		this.start = 0;
		this.end = 0;
	}

	Room(int start, int end) {
		this.start = start;
		this.end = end;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.start + " : " + this.end;
	}

}

public class MettingRoom2 {

	//
	public static void main(String[] args) {

		System.out.println("exe");

		MettingRoom2 obj = new MettingRoom2();

		Room room1 = new Room(0, 30);
		Room room2 = new Room(5, 10);
		Room room3 = new Room(15, 20);

		Room[] array = { room3, room1, room2 };

		Arrays.sort(array, new Comparator<Room>() {
			public int compare(Room o1, Room o2) {
				return o1.start - o2.start;
			}

		});

		obj.solve(array);

	}

	public int solve(Room[] array) {

		PriorityQueue<Room> heap = new PriorityQueue<Room>(array.length, new Comparator<Room>() {
			@Override
			public int compare(Room o1, Room o2) {
				// TODO Auto-generated method stub
				return o1.end - o2.end;
			}
		});

		heap.offer(array[0]);

		for (int i = 1; i < array.length; i++) {
			Room room = heap.poll();

			if (array[i].start < room.end) {
				heap.offer(array[i]);
			}

			heap.offer(room);
		}

		this.print(heap);

		return heap.size();
	}

	public void print(Queue<Room> heap) {

		int size = heap.size();

		while (!heap.isEmpty()) {

			System.out.println("들어 있는 큐값은 : " + heap.poll().toString());
		}
		System.out.println("미팅 룸 갯수 : " + size);

	}

}
