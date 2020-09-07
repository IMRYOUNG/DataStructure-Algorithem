package chap01;

//3개의 정수값 가운데 최댓값을 구하여 출력합니다.
//Max3클래스와는 다르게 한 번에 값을 입력받아 구현한다.
public class Max3m {
	// a,b,c의 최댓값을 구하여 반환한다.
	static int max3(int a, int b, int c) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;

		return max;
	}

	public static void main(String[] args) {
		System.out.println("max3(3,2,1)=" + max3(3, 2, 1));
		System.out.println();
		System.out.println("max3(3,2,2)=" + max3(3, 2, 2));
		System.out.println();
		System.out.println("max3(3,1,2)=" + max3(3, 1, 2));
		System.out.println();
		System.out.println("max3(3,2,3)=" + max3(3, 2, 3));
		System.out.println();
		System.out.println("max3(2,1,3)=" + max3(2, 1, 3));

	}

}
