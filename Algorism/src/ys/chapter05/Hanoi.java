package ys.chapter05;

public class Hanoi {
	
	public Hanoi() {
		// TODO Auto-generated constructor stub
	}
	
	public static void move(int from , int to) {
		System.out.println("�̵� �մϴ� " + from + " ���� ���� " + to + " �� �̵��� �մϴ�.");
	}
	
	public static void hanoi(int n , int from , int by , int to) {
		if(n == 1)
			move(from,to);
		else {
			hanoi(n - 1, from , to , by);
			move(from ,to);
			hanoi(n-1 , by , from , to);
		}
	}

	
	public static void main(String[] args) {
		hanoi(5,1,2,3);
	}
	
	
}
