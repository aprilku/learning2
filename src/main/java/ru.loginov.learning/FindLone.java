package ru.loginov.learning;

public class FindLone {

	public static void main(String[] args) {

		int[] arr = { 1, 100500, 123, 123, 1 };
		int result = 0;

		for (int i : arr) {
			result ^= i;
		}
		System.out.println(result);
	}
}