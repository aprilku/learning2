package ru.loginov.learning;

public class LazyAnd {
	/*
	x  y   x||y
	1	1	1
	1	0	1
	0	1	1
	0	0	0
	
	x	y	x^y  ����
	1	1	0
	1	0	1
	0	1	1
	0	0	0
	*/
	


	public static void main(String[] args) {
		
//		f1(n), f2(n)
//		n -> +inf:     f1(n) / f2(n)   ->   K != 0
		
//		100 pcs - 1000$
//		1 man - 1000$ -- 1000 per each
//		2 man - 1000$ -- 500 per each
//
//		1 000 000 - 10 000 * 1000 / 1 000 000 = 10$ per each
//		1 000 001 - 10 001 * 1000 / 1 000 001 = ...
//
//		O(n) = n
//
//
//
//		1 ==  2
//		|
//		3  - 4
//
//		1 { 2, 2, 3}
//		2 { 1, 1 }
//		3 { 1, 4 }
//		4 { 3 }
//
//		������ ������ { 1, 2 }, { 1, 3}, {4, 3}
		
		
//		if (f1() && f2() ) {
//			System.out.println("yes");
//		}
		//		String s = null;
		//		if ((s != null && s.length() > 5) && ..) {
		//			System.out.println(s.length());
		//		}
		String s = "abc";
		System.out.println( s == null ? "empty" : s.length());

		int i = 2;
		switch(i) {
			case 0: System.out.println("exit"); break;
			case 1: System.out.println("open file"); break;
			//default: System.out.println("illegal option");
		}
		
		char c1 = 'a';
		int z1 = (int) c1;
			System.out.println(z1);
			
			long l = Integer.MAX_VALUE + 1L;
			System.out.println(l);
			int i2 = (int) l;
			System.out.println(i2);
			//01111111 11111111 11111111 11111111
			//10000000 00000000 00000000 00000000
//
//		boolean breakCondition = false;
//		for (int j = 0; j < J; j++) {
//			if (breakCondition) {
//				break;
//			}
//			for (int k = 0; k < K; k++) {
//				if (k == 8) {
//					continue;
//				}
//				System.out.println(j + " " + k);
//				if (j == 5 && k == 5) {
//					breakCondition = true;
//					break;
//				}
//			}
//		}
	}
	
	static boolean f1() {
		System.out.println("f1");
		return false;
	}
	
	static boolean f2() {
		System.out.println("f2");
		return true;
	}
	
}
