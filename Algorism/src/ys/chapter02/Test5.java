package ys.chapter02;

public class Test5 {

	private int data = 50;

	public Test5() {
		// TODO Auto-generated constructor stub

	}

	class SubClass {

		private int a;
		private int b;

		SubClass(int a, int b) {
			this.a = a;
			this.b = b;
		}

		private void msg() {
			System.out.println("데이터는 : " + data);
			System.out.println("서브 클래스" + (a + b));
		}

	}

	public static void main(String[] args) {
		Test5 obj = new Test5();
		Test5.SubClass in = obj.new SubClass(5, 4);
		in.msg();
	}

}

final class Final {

	public Final() {

	}

}
