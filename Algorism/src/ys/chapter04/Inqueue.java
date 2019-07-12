package ys.chapter04;

public class Inqueue {
	/* 링 버퍼 큐 */

	private int max; // 최대값
	private int front; // 디큐하는 위치
	private int rear; // 인큐하는 위치
	private int num; // 현재 데이터 수
	private int[] queue; // 큐 본체

	public class EmptyIntQueueException extends RuntimeException {

	}

	public class OverflowIntQueueException extends RuntimeException {

	}

	public Inqueue(int capacity) {

		num = front = rear = 0;
		max = capacity;

		try {
			queue = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}

	}

	// 큐를 집어 넣는다
	public int enque(int x) throws OverflowIntQueueException {

		if (num >= max)
			throw new OverflowIntQueueException();

		queue[rear++] = x;
		num++;

		if (rear == max)
			rear = 0; // 집어 넣을때 끝으머리에 도달하면 다시 앞에 0번지에 보내주는것이다.

		return x;
	}
	
	//디큐하는 곳
	public int deque() throws EmptyIntQueueException{
		if(num <= 0)
			throw new EmptyIntQueueException();
	
		int index = queue[front++];
		num --;
		if(front == max)
			front = 0;
		
		return index;
		
	}
	
	// 데이터를 들어다보기 
	public int peek()throws EmptyIntQueueException{
		if(num <= 0)
			throw new EmptyIntQueueException();
		
		return queue[front]; // 앞에 나갈 데이터를 미리 확인함
	}

}
