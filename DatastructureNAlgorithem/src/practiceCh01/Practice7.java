package practiceCh01;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n���� �Է��ϼ��� : ");
		int n = scanner.nextInt();

		int total = 0;
		int i = 1;
		while (i <= n) {
			total += i;
			if (i == n)
				System.out.print(i);
			else
				System.out.print(i + "+");
			i++;

		}
		System.out.print("=" + total);

	}

}
