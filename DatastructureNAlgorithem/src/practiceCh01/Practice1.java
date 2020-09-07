package practiceCh01;

public class Practice1 {
	static int max4(int a, int b, int c, int d) {
		int max=a;
		if(b>max)
			max=b;
		if(c>max)
			max=c;
		if(d>max)
			max=d;
		
		return max;
		
	}
	public static void main(String[] args) {
		System.out.println(max4(2,3,4,5));
		System.out.println();
		System.out.println(max4(9,3,2,5));
		System.out.println();
		System.out.println(max4(8,10,4,5));
		System.out.println();

	}

}
