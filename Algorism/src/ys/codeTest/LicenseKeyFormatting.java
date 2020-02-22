package ys.codeTest;

/*
 * 1. 한국말로 먼저 생각 -> 프로그램으로 만듬
 * 
 * String , StringBuffer , StringBuilder
 * 
 * 이 세가지중에 어떤걸 쓸지 결정을한다 
 * 기본 String 은 메모리를 할당 받을때 많이 필요로 함
 * StringBuffer => StringBuffer는 멀티 쓰레드 환경에서 유리함
 * StringBuilder => 싱글쓰레드 환경에서 유리함
 * 
 */

public class LicenseKeyFormatting {

	public static void main(String[] args) {
		String str = "8F3Z-2e-9-wabcdef";
		int k = 4;

		LicenseKeyFormatting obj = new LicenseKeyFormatting();

		System.out.println("결과는 : " + obj.solve(str, k));

	}

	public String solve(String str, int k) {

		String newStr = str.replace("-", "");

		System.out.println(newStr);

		newStr = newStr.toUpperCase();

		System.out.println("newStr : " + newStr);

		// StringBuilder에 담는다.
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < newStr.length(); i++) {
			builder.insert(i, newStr.charAt(i));
		}

		System.out.println("빌더 변환 : " + builder);

		// 4 ,8 ,12
		for (int i = k; i < newStr.length(); i = i + k) {
			builder = builder.insert(newStr.length() - i, "-");
		}

		return builder.toString();

	}

}
