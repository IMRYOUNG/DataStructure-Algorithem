package practiceCh01;

import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
		System.out.println("가우스 덧셈 방법을 이용한 합 구하기");
		Scanner scanner = new Scanner(System.in);
		System.out.print("n을 입력하세요 : ");
		int n =scanner.nextInt();
		int sum=n*(n+1)/2;
		
		System.out.print("1부터 "+n+"까지의 합은 "+sum+"입니다.");
	
	}

}
