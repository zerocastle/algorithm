package ys.chapter03;

import java.util.Arrays;
import java.util.Comparator;

/*
 * 객체를 오름 차순으로 정리후 바이너리 서치
 */

public class PhysicalGeneric {

	static class PhyData {
		private String name;
		private int height;
		private double vision;

		public PhyData(String name, int height, double vision) {
			// TODO Auto-generated constructor stub
			this.name = name;
			this.height = height;
			this.vision = vision;
		}

		@Override
		public String toString() {
			return "PhyData [name=" + name + ", height=" + height + ", vision=" + vision + "]";
		}

		// 오름 차순으로 정렬
		public static final Comparator<PhyData> ORDER = new HeightOrderCompator();

		private static class HeightOrderCompator implements Comparator<PhyData> {

			// 객체안에 필드값인 키대로 순서를 정렬하기 윈한 작업
			@Override
			public int compare(PhyData o1, PhyData o2) {
				// TODO Auto-generated method stub
				int send = (o1.height > o2.height) ? 1 : (o1.height < o2.height) ? -1 : 0;
				this.print(send);
				return (o1.height > o2.height) ? 1 : (o1.height < o2.height) ? -1 : 0;
			}

			private void print(int send) {
				// TODO Auto-generated method stub
				System.out.println("뭐가 나오냐 ? " + send);

			}

		}

	}

	public static void main(String[] args) {
		PhyData[] phyData = { new PhyData("김영성", 160, 2.0), new PhyData("김재근", 170, 1.0),
				new PhyData("김진수(돼지)", 180, 2.7), new PhyData("아무개(돼지)", 190, 2.7),
				new PhyData("hallow(돼지)", 200, 2.7) };

		int result = Arrays.binarySearch(phyData, new PhyData("", 181, 0.0), PhyData.ORDER);
		// 바이너리 서치를 할때 PhyData에 오름차순으로 정리를 한다는 뜻이다.
		System.out.println("result : " + result);

		if (result < 0) {
			System.out.println("요소가 없습니다.");
		} else
			System.out.println("result : [" + result + "] 인덱스에 있다.");
	}

}
