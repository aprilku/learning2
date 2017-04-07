package ru.loginov.learning;

public class IntToBit {

	public static void main(String[] args) {
		int number = 100500;
		System.out.println(Integer.toBinaryString(number) + "\n");
//		1010 & 0001 -> 0 == 0
//		1010 & 0010 -> 0010  != 0

		StringBuilder sb = new StringBuilder();
		for (int j = 31; j >= 0; j--) {
			boolean isZero = (number & (1 << j)) == 0;
			if (isZero) {
				if (sb.length() != 0) {
					sb.append("0");
				}
			} else {
				sb.append("1");
			}
		}
		System.out.print(sb.toString());

	}
		

			
}