package practiceCh01;

public class Practice2 {
	static int min3(int a, int b, int c) {
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		return min;
	}

	public static void main(String[] args) {
		System.out.println(min3(3, 3, 3));
		System.out.println();
		System.out.println(min3(4, 7, 1));
		System.out.println();
		System.out.println(min3(9, 1, 10));
		System.out.println();
	}

}
