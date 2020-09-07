package practiceCh01;

import java.util.Scanner;

public class Practice9 {
	static int start;
	static int end;
	static int sumof(int a, int b) {
		if(a>=b) {
			start=b;
			end=a;
		}else {
			start=a;
			end=b;}
			
		int total=0;
		int i=start;
		for(int start; i<=end; i++) {
			total+=i;
		}
			
		return total;

	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("a의 값을 입력하세요 :");
		int a= scanner.nextInt();
		System.out.print("b의 값의 값을 입력하세요 :");
		int b= scanner.nextInt();
		System.out.print(a+" 와 "+b+"사이의 모든 정수의 합은 "+sumof(a,b)+"입니다.");
	}
}
