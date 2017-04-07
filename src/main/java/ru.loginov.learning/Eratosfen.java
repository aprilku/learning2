package ru.loginov.learning;

public class Eratosfen {


	public static void zahlen(int n) {

		boolean[] crossed = new boolean[n + 1];
		for (int i = 2; i * i <= n; i++) {
			if (crossed[i]) {
				continue;
			}
			for (int j = i + 1; j <= n; j++) {
				if (j % i == 0) {
					crossed[j] = true;
				}
			}
		}
		for (int i = 2; i <= n; i++) {
			if (!crossed[i]) {
				System.out.print(i + " ");
			}
		}

	}

	public static void main(String[] args) {

		zahlen(1000);

		// ����� ����� ����� �������� ���: ������� ��� ������� �����
	}

}
