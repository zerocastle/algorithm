package ys.al;

public class Recursion {

	public static void main(String[] args) {

		/*
		 * double result = power(3, 4);
		 * 
		 * System.out.println("result : " + result);
		 */

		int result2 = fibonacci(8);

		System.out.println("피보나치 : " + result2);
	}

	public static double power(double x, int n) {
		if (n == 0)
			return 1;
		else {

			double hellow = x * power(x, n - 1);
			System.out.println(hellow);
			return hellow;
		}
	}

	public static int fibonacci(int n) {

		if (n < 2) {
			System.out.println("들어오는 n : " + n);
			return n;
		}

		else {
			int hellow = fibonacci(n - 1) + fibonacci(n - 2);
			System.out.println(hellow);
			return hellow;
		}
	}

}
