package ys.chapter03;

public class GenericClassTest {
	/*generic ㅎㅎ*/

	static class GenericClass<T> {
		private T haha;

		public GenericClass(T haha) {
			// TODO Auto-generated constructor stub
			this.haha = haha;
		}

		public T getHaha() {
			return haha;
		}

		public void setHaha(T haha) {
			this.haha = haha;
		}

	}

	public static void main(String[] args) {
		GenericClass<String> string = new GenericClass<String>("hellow");

		System.out.println("스트링 타입이 온다 : " + string.getHaha());
		GenericClass<Integer> n = new GenericClass<Integer>(1);
		System.out.println("인티져가 온다 : " + n.getHaha());

	}

}
