package ru.loginov.learning;

public class BracesCheck {

	final static char OPEN = '(';
	final static char CLOSE = ')';

	public static void main(String[] args) {
		String line = "(f)(";
		System.out.println(check(line));
	}

	static boolean check(String line) {
		int sum = 0;
		for (char c: line.toCharArray()) {
			if (c == OPEN){
				sum+=1;
			} else if (c == CLOSE){
				sum-=1;
			}
			if (sum < 0){
				return false;
			}
		}
		return sum == 0;
	}

}

