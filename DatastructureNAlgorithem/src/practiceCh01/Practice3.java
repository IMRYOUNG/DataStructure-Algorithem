package practiceCh01;

public class Practice3 {
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		if (d < min)
			min = d;

		return min;
	}

	public static void main(String[] args) {
		System.out.println(min4(5, 8, 3, 6));
		System.out.println();
		System.out.println(min4(9, 2, 3, 1));
		System.out.println();
		System.out.println(min4(1, 2, 3, 6));
		System.out.println();

	}

}
