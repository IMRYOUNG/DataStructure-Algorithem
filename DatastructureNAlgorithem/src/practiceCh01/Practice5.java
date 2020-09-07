package practiceCh01;

public class Practice5 {
	static int med3(int a, int b, int c) {
		if ((b >= a && c <= a) || (b <= a && c >= a))
			return a;
		else if ((a > b & c < b) || (a < b && c > b))
			return b;
		return c;
	}

	public static void main(String[] args) {
		System.out.println("세 정수의 중앙값을 구합니다.");
		System.out.println("med3(3,2,1) = " + med3(3, 2, 1));
		System.out.println("med3(3,2,2) = " + med3(3, 2, 2));
		System.out.println("med3(3,1,2) = " + med3(3, 1, 2));
		System.out.println("med3(3,2,3) = " + med3(3, 2, 3));

	}

}

/*Practice4에 비해 Practice 5의 메서드 효율이 떨어지는 이유는, if의 조건식을 보면 Practice5에서 조건식이 더 긴 것을 알 수 있는데, 
조건식의 비교를 위해서는 조건의 저장이 필요한데 Practice5에서 조건 저장에 더 많은 메모리가 필요하기때문이다.*/