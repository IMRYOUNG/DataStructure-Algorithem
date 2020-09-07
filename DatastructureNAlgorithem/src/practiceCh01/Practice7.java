package practiceCh01;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n값을 입력하세요 : ");
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
