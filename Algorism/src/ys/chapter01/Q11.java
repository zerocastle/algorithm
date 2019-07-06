package ys.chapter01;

/*자릿수 구하기*/
import java.util.Scanner;

public class Q11 {

	private int num;
	private int counter = 0;
	public static Scanner s = new Scanner(System.in);
	public Q11() {
		// TODO Auto-generated constructor stub

		do {
			System.out.printf("숫자를 입력하세요 (양의 숫자만 입력 가능)");
			num = s.nextInt();
		} while (num <= 0);
		
		for(int i = 1; i <= 100000; i = i * 10) {
			if((num / i ) >= 1) {
				counter ++;
			}else
				break;
		}
		
		System.out.println("이 숫자의 자리값은 : " + counter);

	}

	public static void main(String[] args) {
		new Q11();
	}

}
