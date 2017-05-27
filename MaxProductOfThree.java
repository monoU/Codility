package sandbox;

import java.util.Arrays;

public class MaxProductOfThree {

	public static void main(String[] args) {
		int[] A = {-3,1,-2,2,5,6};
		System.out.println(solution(A));
	}

	private static int solution(int[] A) {
		int N = A.length;
		Arrays.sort(A);

		return A[N-1]*A[N-2]*A[N-3] > A[0]*A[1]*A[N-1] ?
				A[N-1]*A[N-2]*A[N-3] : A[0]*A[1]*A[N-1];
	}
}
