package practiceCh01;

import java.util.Scanner;

public class Practice4 {
		static int med3(int a, int b, int c) {
			if(a>=b)
				if(b>=c)
					return b;
				else if(a<=c)
					return a;
				else
					return c;
					
			else if(a>c)
				return a;
			else if(b>c)
				return c;
			else
				return b;
		}
	public static void main(String[] args) {
			
		System.out.println("세 정수의 중앙값을 구합니다.");
		System.out.println("med3(3,2,1) = "+med3(3,2,1));
		System.out.println("med3(3,2,2) = "+med3(3,2,2));
		System.out.println("med3(3,1,2) = "+med3(3,1,2));
		System.out.println("med3(3,2,3) = "+med3(3,2,3));
	}

}
