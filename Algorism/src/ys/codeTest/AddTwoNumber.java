package ys.codeTest;

class Node {

	int val;

	Node next;

	Node(int val) {
		this.val = val;
	}
}

public class AddTwoNumber {

	public static void main(String[] args) {

		Node l1 = new Node(2);
		l1.next = new Node(4);
		l1.next.next = new Node(3);

		Node l2 = new Node(5);
		l2.next = new Node(6);
		l2.next.next = new Node(2);

		Node result = solve(l1, l2);

		while (result != null) {
			System.out.println(result.val);
			result = result.next;
		}

	}

	public static Node solve(Node l1, Node l2) {
		Node newHead = new Node(0);
		// 데이터에 조작이 이루어지므로 카피에서 쓰는게 자바의 일반적인 방법
		Node p1 = l1, p2 = l2, p3 = newHead;
		int carry = 0;

		// 2
		while (p1 != null || p2 != null) {
			if (p1 != null) {
				carry += p1.val;
				p1 = p1.next;
			}
			if (p2 != null) {
				carry += p2.val;
				p2 = p2.next;
			}

			p3.next = new Node(carry % 10);
			p3 = p3.next;

			// 다음 노드에 목을 넘겨준다.
			carry /= 10;
		}
		
		// 마지막 노드에 값이 오버 될수도 있기 때문이다.
		if(carry == 1) p3.next = new Node(1);

		return newHead.next;
	}

}
