package chap01;

import java.util.Scanner;

//3���� ������ ��� �ִ��� ���ϴ� ���α׷�
public class Max3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("�� ������ �ִ��� ���մϴ�.");
		System.out.println("a�� �� : ");
		int a = stdIn.nextInt();
		System.out.println("b�� �� : ");
		int b = stdIn.nextInt();
		System.out.println("c�� �� : ");
		int c = stdIn.nextInt();

		// a,b,c�� �ִ��� ���Ͽ� max�� ����
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		/*������ �Ʒ��� ������� ����Ǵ� ������ ������ ��������Ѵ�.
		 * if�������� ���� �� ����� ���� ���α׷��� ���� �帧���� �����ϴ� if���� ���� ��������Ѵ�.*/

		System.out.println("�ִ��� " + max + "�Դϴ�.");
	}

}
