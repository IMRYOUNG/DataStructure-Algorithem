package practiceCh01;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("While문의 종료값을 구합니다.");
		System.out.print("n의 값 : ");
		int n = stdIn.nextInt();

		int sum = 0;
		int i = 1;

		while (i <= n) {
			sum += i;
			i++;
		}
		System.out.println("1부터 " + n + " 까지의 합은 " + sum + " 이고, while문 종료시의 변수 i의 값은 "+i+"입니다.");

	}

}
