package ys.chapter01;

import java.util.Scanner;

/*중간 크기 값을 구하기*/
//decision tree
public class MainClass {

	private Scanner s = new Scanner(System.in);

	static int med3(int a, int b, int c) {

		if (a >= b) 
			if (b >= c)
				return b;
			else if(a <= c)
				return a;
			else
				return c;
		else if(a > c)
			return a;
		else if(b > c)
			return c;
		else
			return b;
	}

	public MainClass() {
		// TODO Auto-generated constructor stub
		System.out.println("세 정수의 중앙 값을 구합니다.");

		System.out.print("a 의 값 : ");
		int a = s.nextInt();

		System.out.print("b 의 값 : ");
		int b = s.nextInt();

		System.out.print("c 의 값 : ");
		int c = s.nextInt();

		System.out.println("중간의 값은 : " + MainClass.med3(a, b, c));

	}

	public static void main(String[] args) {
		new MainClass();
	}

}
