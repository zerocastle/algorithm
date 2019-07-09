package ys.chapter04;

import java.util.Scanner;

public class Instack {
	
	/*스텍 구현 */

	private int max;
	private int ptr;
	private int[] stack;

	public Instack(int capacity) {
		this.stack = new int[capacity];
		ptr = 0; // 스텍 포인트
		max = capacity;
		try {
			stack = new int[max];
			System.out.println(max + "만큼의 스텍을 구현한다.");
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

	// 스텍에 내용이 없으면 호출 (내부 클래스)
	public class EmptyInStackException extends RuntimeException {
		public EmptyInStackException() {
		}
	}

	// 스텍에 범위를 넘어스면 호출(내부 클래스)

	public class OverflowInStackException extends RuntimeException {
		public OverflowInStackException() {
		}
	}

	// 데이터를 넣어줌
	public int push(int x) throws OverflowInStackException {
		if (ptr >= max)
			throw new OverflowInStackException();
		return stack[ptr++] = x;
	}

	// 데이터를 뺴내어 줌
	public int pop() throws EmptyInStackException {

		if (ptr <= 0)
			throw new EmptyInStackException();
		return stack[ptr--];
	}

	// 탑에 있는 데이터 보기
	public int peek() throws EmptyInStackException {

		if (ptr <= 0)
			throw new EmptyInStackException();
		return stack[ptr - 1]; // stack 에 push를 할때 값을 넣고 다음 위치를 가르키기에 -1을 해주는것이다.
	}

	// 입력한 데이터의 인덱스 위치보기
	public int indexOf(int x) {

		// lifo이기에 꼭대기 부터 선형 검색을 한다.
		for (int i = 0; i < ptr - 1; i++) {
			if (stack[i] == x)
				return i;
		}

		return -1;

	}

	// 스텍이 비었는가
	public boolean isEmpty() {

		return ptr <= 0;
	}

	// 스텍이 가득 찾니
	public boolean isFull() {
		return ptr == max;
	}

	// 스텍 구조 보여주기
	public void dump() {
		if (ptr <= 0)
			System.out.println("스텍이 비어 있습니다.");
		else {
			for (int i = 0; i < ptr; i++) {
				System.out.print(stack[i] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num;
		int capacity;
		int value;
		System.out.println("몇까지의 스텍을 구현 하시겠습니까?");
		capacity = s.nextInt();
		Instack stack = new Instack(capacity);

		while (true) {
			System.out.println("=== 매뉴얼 선택해주세요 ===");
			System.out.println("(1) 푸쉬  (2) 팝 (3)비었니? (4)꽉찾니? (5)픽 (6)인덱스 오프 (7)모양세보기 (8)종료");
			System.out.println("====================");
			num = s.nextInt();
			if(num == 8) {
				System.out.println("bye bye ~~");
				break;
			}

			switch (num) {
			case 1: {
				value = s.nextInt();
				System.out.println(stack.push(value));
				break;

			}
			case 2: {
				System.out.println(stack.pop());
				break;
			}
			case 3: {
				System.out.println(stack.isEmpty());
				break;
			}
			case 4: {
				System.out.println(stack.isFull());
				break;
			}
			case 5: {
				System.out.println(stack.peek());
				break;
			}
			case 6: {
				value = s.nextInt();
				System.out.println(stack.indexOf(value));
				break;
			}
			case 7: {
				stack.dump();
				break;
			}
			}
			
			

		}

	}

}
