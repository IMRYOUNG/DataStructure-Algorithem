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
		System.out.print("a�� ���� �Է��ϼ��� :");
		int a= scanner.nextInt();
		System.out.print("b�� ���� ���� �Է��ϼ��� :");
		int b= scanner.nextInt();
		System.out.print(a+" �� "+b+"������ ��� ������ ���� "+sumof(a,b)+"�Դϴ�.");
	}
}
