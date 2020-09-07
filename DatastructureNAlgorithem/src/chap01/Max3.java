package chap01;

import java.util.Scanner;

//3개의 정수값 가운데 최댓값을 구하는 프로그램
public class Max3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.println("a의 값 : ");
		int a = stdIn.nextInt();
		System.out.println("b의 값 : ");
		int b = stdIn.nextInt();
		System.out.println("c의 값 : ");
		int c = stdIn.nextInt();

		// a,b,c의 최댓값을 구하여 max에 대입
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		/*위에서 아래로 순서대로 실행되는 구조는 순차적 구조라고한다.
		 * if문과같이 식의 평가 결과에 따라 프로그램의 실행 흐름ㅇ르 변경하는 if문을 선택 구조라고한다.*/

		System.out.println("최댓값은 " + max + "입니다.");
	}

}
